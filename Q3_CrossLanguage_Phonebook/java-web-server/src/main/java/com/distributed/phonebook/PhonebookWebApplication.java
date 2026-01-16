package com.distributed.phonebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Application for Phonebook Web Interface
 * Distributed Systems Project 1 - Q3 Cross-Language Communication
 * 
 * This application provides a web interface at localhost:8080 that communicates
 * with the Python gRPC database server to demonstrate cross-language integration.
 */
@SpringBootApplication
public class PhonebookWebApplication {

    public static void main(String[] args) {
        System.out.println("🌐 Starting Phonebook Web Server...");
        System.out.println("📱 Connecting to Python gRPC Database Server at localhost:50051");
        System.out.println("🔗 Web interface will be available at http://localhost:8080");
        
        SpringApplication.run(PhonebookWebApplication.class, args);
        
        System.out.println("✅ Phonebook Web Server started successfully!");
        System.out.println("🎯 Ready for cross-language gRPC communication demonstration");
    }
}