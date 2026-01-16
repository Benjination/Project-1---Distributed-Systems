# Distributed Systems Project 1 - Cross-Language Phonebook

A distributed phonebook system demonstrating cross-language gRPC communication between Python and Java, containerized with Docker.

## Project Structure

- **Q3_CrossLanguage_Phonebook/**: Main project implementation
  - **python-database-server/**: Python gRPC server (database backend)
  - **java-web-server/**: Java Spring Boot web application (frontend)
  - **proto/**: Protocol Buffers schema definitions
  - **docker-compose.yml**: Multi-container orchestration
- **Latex PDF/**: Complete project documentation
- **Tracking/**: Progress tracking and planning documents
- **Command Images/**: Screenshots of commands and outputs

## Features

- **Cross-Language Communication**: Java web frontend communicates with Python database backend via gRPC
- **Unique ID System**: Auto-incrementing IDs for contacts with editable phone numbers
- **Professional UI**: Bootstrap-styled web interface with form validation
- **Docker Containerization**: Complete containerized deployment with health checks
- **Thread-Safe Operations**: Concurrent-safe contact management
- **Duplicate Prevention**: Phone number uniqueness validation

## Quick Start

### Option 1: Docker Hub Deployment (Recommended)
```bash
# Pull and run from Docker Hub
docker run -d --name phonebook-db -p 50051:50051 bennythepooh/phonebook-database:latest
docker run -d --name phonebook-web -p 8080:8080 --link phonebook-db:database bennythepooh/phonebook-web:latest

# Access web interface
open http://localhost:8080
```

### Option 2: Build from Source
```bash
# Clone the repository
git clone https://github.com/Benjination/Project-1---Distributed-Systems.git
cd "Project-1---Distributed-Systems/Q3_CrossLanguage_Phonebook"

# Build and run with Docker Compose
docker-compose up --build

# Access web interface
open http://localhost:8080
```

## Development Setup

### Prerequisites
- Docker & Docker Compose
- Java 17+ (for local development)
- Python 3.13+ (for local development)
- Protocol Buffers compiler (protoc)

### Local Development
```bash
# Generate protobuf classes
cd Q3_CrossLanguage_Phonebook

# Python server
cd python-database-server
python -m grpc_tools.protoc -I../proto --python_out=. --grpc_python_out=. ../proto/phonebook.proto
python phonebook_server.py

# Java web server (in new terminal)
cd ../java-web-server
./gradlew bootRun
```

## Docker Hub Images

- **Database Server**: `bennythepooh/phonebook-database:latest`
- **Web Server**: `bennythepooh/phonebook-web:latest`

## Documentation

- **Complete Report**: See `Latex PDF/main.pdf` for comprehensive documentation
- **Progress Tracking**: See `Tracking/Progress_Tracker.md` for development timeline
- **Project Checklist**: See `Project_Checklist.md` for requirements verification

## Technology Stack

- **Backend**: Python 3.13, gRPC, Protocol Buffers
- **Frontend**: Java 17, Spring Boot 3.2.1, Thymeleaf, Bootstrap
- **Containerization**: Docker, Docker Compose
- **Build Tools**: Gradle, Python pip
- **Documentation**: LaTeX, Markdown

## API Operations

- **AddContact**: Add new contact with auto-generated ID
- **GetContact**: Retrieve contact by ID or phone number  
- **UpdateContact**: Update existing contact details
- **DeleteContact**: Remove contact by ID
- **ListContacts**: Get all contacts with pagination

## Deployment

The system is production-ready with:
- Health checks and monitoring
- Graceful error handling
- Thread-safe concurrent operations
- Docker Hub public images for easy deployment
- Comprehensive logging and debugging

## License

This project is created for academic purposes as part of a Distributed Systems course.