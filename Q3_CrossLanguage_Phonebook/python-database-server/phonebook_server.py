#!/usr/bin/env python3
"""
Phonebook Database Server - gRPC Server Implementation
Distributed Systems Project 1 - Q3 Cross-Language Communication

This server implements a PhonebookService that stores contact information
in memory and provides CRUD operations via gRPC.
"""

import grpc
from concurrent import futures
import time
import threading
import phonebook_pb2
import phonebook_pb2_grpc


class PhonebookServiceServicer(phonebook_pb2_grpc.PhonebookServiceServicer):
    """
    Phonebook service implementation with in-memory storage.
    Provides thread-safe CRUD operations for contact management.
    """
    
    def __init__(self):
        # In-memory storage: id -> Contact
        self.contacts = {}
        # Auto-incrementing ID counter
        self.next_id = 1
        # Thread lock for concurrent access safety
        self.lock = threading.Lock()
        print("📱 Phonebook Database Server initialized with empty contact storage")
    
    def AddContact(self, request, context):
        """Add a new contact with auto-generated ID"""
        with self.lock:
            contact = request.contact
            
            # Check if phone number already exists
            for existing_contact in self.contacts.values():
                if existing_contact.phone_number == contact.phone_number:
                    context.set_code(grpc.StatusCode.ALREADY_EXISTS)
                    context.set_details(f'Contact with phone number {contact.phone_number} already exists')
                    return phonebook_pb2.ContactResponse(
                        success=False,
                        message=f"Contact with phone number {contact.phone_number} already exists"
                    )
            
            # Create new contact with unique ID
            new_contact = phonebook_pb2.Contact(
                id=self.next_id,
                name=contact.name,
                phone_number=contact.phone_number,
                email=contact.email,
                address=contact.address
            )
            
            # Store contact with ID as key
            self.contacts[self.next_id] = new_contact
            print(f"➕ Added contact: {new_contact.name} (ID: {self.next_id}, Phone: {new_contact.phone_number})")
            
            # Save the current ID and increment for next contact
            contact_id = self.next_id
            self.next_id += 1
            
            return phonebook_pb2.ContactResponse(
                success=True,
                message=f"Contact {new_contact.name} added successfully with ID {contact_id}",
                contact=new_contact
            )
    
    def GetContact(self, request, context):
        """Retrieve a contact by ID or phone number"""
        with self.lock:
            # Search by ID if provided
            if request.id > 0:
                if request.id in self.contacts:
                    contact = self.contacts[request.id]
                    print(f"🔍 Retrieved contact by ID {request.id}: {contact.name}")
                    return phonebook_pb2.ContactResponse(
                        success=True,
                        message="Contact found",
                        contact=contact
                    )
                else:
                    context.set_code(grpc.StatusCode.NOT_FOUND)
                    context.set_details(f'Contact with ID {request.id} not found')
                    return phonebook_pb2.ContactResponse(
                        success=False,
                        message=f"Contact with ID {request.id} not found"
                    )
            
            # Search by phone number if ID not provided
            elif request.phone_number:
                for contact in self.contacts.values():
                    if contact.phone_number == request.phone_number:
                        print(f"🔍 Retrieved contact by phone {request.phone_number}: {contact.name}")
                        return phonebook_pb2.ContactResponse(
                            success=True,
                            message="Contact found",
                            contact=contact
                        )
                
                context.set_code(grpc.StatusCode.NOT_FOUND)
                context.set_details(f'Contact with phone number {request.phone_number} not found')
                return phonebook_pb2.ContactResponse(
                    success=False,
                    message=f"Contact with phone number {request.phone_number} not found"
                )
            
            else:
                context.set_code(grpc.StatusCode.INVALID_ARGUMENT)
                context.set_details('Either ID or phone number must be provided')
                return phonebook_pb2.ContactResponse(
                    success=False,
                    message="Either ID or phone number must be provided"
                )
    
    def UpdateContact(self, request, context):
        """Update an existing contact by ID"""
        with self.lock:
            contact_id = request.id
            updated_contact = request.contact
            
            if contact_id not in self.contacts:
                context.set_code(grpc.StatusCode.NOT_FOUND)
                context.set_details(f'Contact with ID {contact_id} not found')
                return phonebook_pb2.ContactResponse(
                    success=False,
                    message=f"Contact with ID {contact_id} not found"
                )
            
            # Check if new phone number conflicts with other contacts
            for existing_id, existing_contact in self.contacts.items():
                if (existing_id != contact_id and 
                    existing_contact.phone_number == updated_contact.phone_number):
                    context.set_code(grpc.StatusCode.ALREADY_EXISTS)
                    context.set_details(f'Phone number {updated_contact.phone_number} is already used by another contact')
                    return phonebook_pb2.ContactResponse(
                        success=False,
                        message=f"Phone number {updated_contact.phone_number} is already used by another contact"
                    )
            
            # Update the contact while preserving the ID
            new_contact = phonebook_pb2.Contact(
                id=contact_id,
                name=updated_contact.name,
                phone_number=updated_contact.phone_number,
                email=updated_contact.email,
                address=updated_contact.address
            )
            
            old_contact = self.contacts[contact_id]
            self.contacts[contact_id] = new_contact
            
            print(f"✏️  Updated contact ID {contact_id}: {old_contact.name} -> {new_contact.name}")
            return phonebook_pb2.ContactResponse(
                success=True,
                message=f"Contact {new_contact.name} updated successfully",
                contact=new_contact
            )
    
    def DeleteContact(self, request, context):
        """Delete a contact by ID"""
        with self.lock:
            contact_id = request.id
            
            if contact_id not in self.contacts:
                context.set_code(grpc.StatusCode.NOT_FOUND)
                context.set_details(f'Contact with ID {contact_id} not found')
                return phonebook_pb2.ContactResponse(
                    success=False,
                    message=f"Contact with ID {contact_id} not found"
                )
            
            # Delete the contact
            deleted_contact = self.contacts.pop(contact_id)
            
            print(f"🗑️  Deleted contact ID {contact_id}: {deleted_contact.name} ({deleted_contact.phone_number})")
            return phonebook_pb2.ContactResponse(
                success=True,
                message=f"Contact {deleted_contact.name} deleted successfully"
            )
    
    def ListContacts(self, request, context):
        """List all contacts in the phonebook"""
        with self.lock:
            contact_list = list(self.contacts.values())
            
            print(f"📋 Listed {len(contact_list)} contacts")
            return phonebook_pb2.ContactList(
                contacts=contact_list,
                count=len(contact_list)
            )


def serve():
    """Start the gRPC server"""
    # Create server with thread pool
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    
    # Add our service to the server
    phonebook_pb2_grpc.add_PhonebookServiceServicer_to_server(
        PhonebookServiceServicer(), server
    )
    
    # Configure server to listen on port 50051
    listen_addr = '[::]:50051'
    server.add_insecure_port(listen_addr)
    
    # Start the server
    server.start()
    print(f"🚀 Phonebook Database Server started on {listen_addr}")
    print("📱 Ready to handle contact operations...")
    print("🔄 Server supports: AddContact, GetContact, UpdateContact, DeleteContact, ListContacts")
    print("⏹️  Press Ctrl+C to stop the server")
    
    try:
        # Keep the server running
        while True:
            time.sleep(60)  # Sleep for 1 minute intervals
    except KeyboardInterrupt:
        print("\n🛑 Shutting down Phonebook Database Server...")
        server.stop(0)
        print("✅ Server stopped successfully")


if __name__ == '__main__':
    serve()