#!/usr/bin/env python3
"""
Phonebook Client - gRPC Client Implementation
Distributed Systems Project 1 - Q3 Cross-Language Communication

This client demonstrates all CRUD operations with the Phonebook Database Server.
"""

import grpc
import phonebook_pb2
import phonebook_pb2_grpc


def run_client():
    """Connect to the phonebook server and demonstrate all operations"""
    # Create a gRPC channel to the server
    channel = grpc.insecure_channel('localhost:50051')
    
    # Create a stub (client)
    stub = phonebook_pb2_grpc.PhonebookServiceStub(channel)
    
    print("🔗 Connected to Phonebook Database Server at localhost:50051")
    print("=" * 60)
    
    try:
        # Test 1: Add some contacts
        print("\n1️⃣ ADDING CONTACTS")
        print("-" * 30)
        
        contacts_to_add = [
            phonebook_pb2.Contact(
                name="Alice Johnson", 
                phone_number="555-0101", 
                email="alice@example.com",
                address="123 Main St, Anytown, USA"
            ),
            phonebook_pb2.Contact(
                name="Bob Smith", 
                phone_number="555-0102", 
                email="bob@example.com",
                address="456 Oak Ave, Somewhere, USA"
            ),
            phonebook_pb2.Contact(
                name="Carol Davis", 
                phone_number="555-0103", 
                email="carol@example.com",
                address="789 Pine Rd, Elsewhere, USA"
            )
        ]
        
        for contact in contacts_to_add:
            request = phonebook_pb2.ContactRequest(
                phone_number=contact.phone_number,
                contact=contact
            )
            response = stub.AddContact(request)
            print(f"✅ {response.message}")
        
        # Test 2: List all contacts
        print("\n2️⃣ LISTING ALL CONTACTS")
        print("-" * 30)
        
        empty = phonebook_pb2.Empty()
        contact_list = stub.ListContacts(empty)
        print(f"📋 Found {contact_list.count} contacts:")
        for i, contact in enumerate(contact_list.contacts, 1):
            print(f"   {i}. {contact.name} - {contact.phone_number}")
            print(f"      📧 {contact.email}")
            print(f"      🏠 {contact.address}")
        
        # Test 3: Get a specific contact
        print("\n3️⃣ GETTING SPECIFIC CONTACT")
        print("-" * 30)
        
        get_request = phonebook_pb2.ContactRequest(phone_number="555-0102")
        response = stub.GetContact(get_request)
        if response.success:
            contact = response.contact
            print(f"🔍 Found: {contact.name}")
            print(f"   📞 {contact.phone_number}")
            print(f"   📧 {contact.email}")
            print(f"   🏠 {contact.address}")
        
        # Test 4: Update a contact
        print("\n4️⃣ UPDATING CONTACT")
        print("-" * 30)
        
        updated_contact = phonebook_pb2.Contact(
            name="Bob Smith Jr.",  # Updated name
            phone_number="555-0102",
            email="bob.jr@example.com",  # Updated email
            address="456 Oak Ave, Apartment 2B, Somewhere, USA"  # Updated address
        )
        update_request = phonebook_pb2.ContactRequest(
            phone_number="555-0102",
            contact=updated_contact
        )
        response = stub.UpdateContact(update_request)
        print(f"✏️ {response.message}")
        
        # Test 5: Verify the update
        print("\n5️⃣ VERIFYING UPDATE")
        print("-" * 30)
        
        get_request = phonebook_pb2.ContactRequest(phone_number="555-0102")
        response = stub.GetContact(get_request)
        if response.success:
            contact = response.contact
            print(f"✅ Updated contact: {contact.name}")
            print(f"   📧 New email: {contact.email}")
        
        # Test 6: Delete a contact
        print("\n6️⃣ DELETING CONTACT")
        print("-" * 30)
        
        delete_request = phonebook_pb2.ContactRequest(phone_number="555-0103")
        response = stub.DeleteContact(delete_request)
        print(f"🗑️ {response.message}")
        
        # Test 7: Final contact list
        print("\n7️⃣ FINAL CONTACT LIST")
        print("-" * 30)
        
        contact_list = stub.ListContacts(empty)
        print(f"📋 Remaining {contact_list.count} contacts:")
        for i, contact in enumerate(contact_list.contacts, 1):
            print(f"   {i}. {contact.name} - {contact.phone_number}")
        
        # Test 8: Try to get deleted contact (should fail)
        print("\n8️⃣ TESTING ERROR HANDLING")
        print("-" * 30)
        
        try:
            get_request = phonebook_pb2.ContactRequest(phone_number="555-0103")
            response = stub.GetContact(get_request)
            print(f"❌ Unexpected success: {response.message}")
        except grpc.RpcError as e:
            print(f"✅ Expected error: {e.details()}")
        
        print("\n" + "=" * 60)
        print("🎉 All phonebook operations completed successfully!")
        print("🔄 Cross-language gRPC communication working perfectly!")
        
    except Exception as e:
        print(f"❌ Error: {e}")
    finally:
        channel.close()


if __name__ == '__main__':
    run_client()