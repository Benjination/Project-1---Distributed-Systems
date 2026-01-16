package com.distributed.phonebook.controller;

import com.distributed.phonebook.service.PhonebookGrpcClient;
import com.distributed.phonebook.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Web Controller for Phonebook Interface
 * Handles HTTP requests and converts them to gRPC calls to Python database server
 */
@Controller
public class PhonebookWebController {
    
    @Autowired
    private PhonebookGrpcClient grpcClient;
    
    /**
     * Home page - displays all contacts
     */
    @GetMapping("/")
    public String home(Model model) {
        ContactList contacts = grpcClient.listAllContacts();
        model.addAttribute("contacts", contacts.getContactsList());
        model.addAttribute("contactCount", contacts.getCount());
        System.out.println("🌐 Web request: Home page loaded with " + contacts.getCount() + " contacts");
        return "index";
    }
    
    /**
     * Show add contact form
     */
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("contact", new ContactForm());
        model.addAttribute("editing", false);
        System.out.println("🌐 Web request: Add contact form displayed");
        return "add-contact";
    }
    
    /**
     * Process add contact form submission
     */
    @PostMapping("/add")
    public String addContact(@ModelAttribute ContactForm contactForm, RedirectAttributes redirectAttributes) {
        ContactResponse response = grpcClient.addContact(
                contactForm.getName(),
                contactForm.getPhoneNumber(),
                contactForm.getEmail(),
                contactForm.getAddress()
        );
        
        if (response.getSuccess()) {
            redirectAttributes.addFlashAttribute("successMessage", 
                "✅ Contact '" + contactForm.getName() + "' added successfully!");
            System.out.println("🌐 Web success: Contact added via Java→Python gRPC");
        } else {
            redirectAttributes.addFlashAttribute("errorMessage", 
                "❌ Failed to add contact: " + response.getMessage());
            System.out.println("🌐 Web error: Failed to add contact - " + response.getMessage());
        }
        
        return "redirect:/";
    }
    
    /**
     * Show edit contact form
     */
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model, RedirectAttributes redirectAttributes) {
        ContactResponse response = grpcClient.getContactById(id);
        
        if (response.getSuccess()) {
            Contact contact = response.getContact();
            ContactForm contactForm = new ContactForm();
            contactForm.setId(contact.getId());
            contactForm.setName(contact.getName());
            contactForm.setPhoneNumber(contact.getPhoneNumber());
            contactForm.setEmail(contact.getEmail());
            contactForm.setAddress(contact.getAddress());
            
            model.addAttribute("contact", contactForm);
            model.addAttribute("editing", true);
            System.out.println("🌐 Web request: Edit form for " + contact.getName());
            return "add-contact";
        } else {
            redirectAttributes.addFlashAttribute("errorMessage", 
                "❌ Contact not found: " + response.getMessage());
            return "redirect:/";
        }
    }
    
    /**
     * Process edit contact form submission
     */
    @PostMapping("/edit")
    public String editContact(@ModelAttribute ContactForm contactForm, RedirectAttributes redirectAttributes) {
        ContactResponse response = grpcClient.updateContact(
                contactForm.getId(),
                contactForm.getName(),
                contactForm.getPhoneNumber(),
                contactForm.getEmail(),
                contactForm.getAddress()
        );
        
        if (response.getSuccess()) {
            redirectAttributes.addFlashAttribute("successMessage", 
                "✅ Contact '" + contactForm.getName() + "' updated successfully!");
            System.out.println("🌐 Web success: Contact updated via Java→Python gRPC");
        } else {
            redirectAttributes.addFlashAttribute("errorMessage", 
                "❌ Failed to update contact: " + response.getMessage());
            System.out.println("🌐 Web error: Failed to update contact - " + response.getMessage());
        }
        
        return "redirect:/";
    }
    
    /**
     * Delete a contact
     */
    @GetMapping("/delete/{id}")
    public String deleteContact(@PathVariable int id, RedirectAttributes redirectAttributes) {
        ContactResponse response = grpcClient.deleteContact(id);
        
        if (response.getSuccess()) {
            redirectAttributes.addFlashAttribute("successMessage", 
                "🗑️ Contact deleted successfully!");
            System.out.println("🌐 Web success: Contact deleted via Java→Python gRPC");
        } else {
            redirectAttributes.addFlashAttribute("errorMessage", 
                "❌ Failed to delete contact: " + response.getMessage());
            System.out.println("🌐 Web error: Failed to delete contact - " + response.getMessage());
        }
        
        return "redirect:/";
    }
    
    /**
     * Search for a contact
     */
    @GetMapping("/search")
    public String searchContact(@RequestParam String phoneNumber, Model model, RedirectAttributes redirectAttributes) {
        if (phoneNumber.trim().isEmpty()) {
            return "redirect:/";
        }
        
        ContactResponse response = grpcClient.getContact(phoneNumber.trim());
        
        if (response.getSuccess()) {
            model.addAttribute("contacts", java.util.Arrays.asList(response.getContact()));
            model.addAttribute("contactCount", 1);
            model.addAttribute("searchTerm", phoneNumber);
            System.out.println("🌐 Web search: Found contact for " + phoneNumber);
            return "index";
        } else {
            redirectAttributes.addFlashAttribute("errorMessage", 
                "🔍 No contact found with phone number: " + phoneNumber);
            return "redirect:/";
        }
    }
    
    /**
     * Form model class for contact data binding
     */
    public static class ContactForm {
        private int id;
        private String name;
        private String phoneNumber;
        private String email;
        private String address;
        
        // Getters and setters
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        
        public String getPhoneNumber() { return phoneNumber; }
        public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
        
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        
        public String getAddress() { return address; }
        public void setAddress(String address) { this.address = address; }
    }
}