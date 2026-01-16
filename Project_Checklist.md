# Distributed Systems Project 1 - Step-by-Step Checklist

## Overview
- **Estimated Workload**: 2 weeks
- **Languages**: Java + Python (recommended for cross-language communication)
- **Platform**: macOS
- **Key Technologies**: Docker, gRPC, Protocol Buffers

## Q1: Docker Fundamentals (~0.5 week)

### Setup and Installation
- [X] Install Docker Desktop for Mac from https://docs.docker.com/get-started/
- [X] Verify installation: `docker --version`
- [X] Create Docker Hub account at https://hub.docker.com

### Docker Get Started Guide
Complete the following sections from:

- [X] **"What is Docker?"** - Read and understand concepts
- [X] **"Get Docker"** - Installation (already done above)
- [X] **"Introduction"** - Complete all parts
  - [X] Part 1: Overview
  - [X] Part 2: Containerize an application
  - [X] Part 3: Update the application
  - [X] Part 4: Share the application
  - [X] **Save Docker Hub link #1** for report
- [ ] **"Docker concepts"** - Read and understand
- [ ] **"Docker workshop"** - Complete all parts
  - [ ] Part 1: Getting started
  - [ ] Part 2: Our application
  - [ ] Part 3: Updating our application
  - [ ] Part 4: Sharing our application
  - [ ] Part 5: Persisting our database
  - [ ] Part 6: Using bind mounts
  - [ ] Part 7: Use Docker Compose
  - [ ] **Additional Task**: Share Part 7 image on Docker Hub
  - [ ] **Save Docker Hub link #2** for report

### Docker Commands Documentation
- [ ] Create comprehensive list of all Docker commands used
- [ ] Categorize commands (e.g., image management, container operations, networking)
- [ ] Write brief explanation for each command's purpose

## Q2: gRPC Fundamentals (~0.5 week)

### Language Selection and Setup
- [ ] **Primary Language**: Java (https://grpc.io/docs/languages/java/)
- [ ] **Secondary Language**: Python (https://grpc.io/docs/languages/python/)

### Java gRPC Setup
- [X] Install Java 8+ (check with `java -version`) - Java 17 LTS installed
- [X] Install Gradle or Maven - Gradle included with repository
- [X] Complete Java Quick Start guide - **Date**: January 15, 2026
- [X] Complete Java Basics Tutorial - **Date**: January 16, 2026
- [X] **Take screenshots** of final Basics Tutorial step - Java1.png, Java2.png
- [X] Use command format: `date; whoami; [your-command]` - **Completed**

### Python gRPC Setup  
- [X] Install Python 3.6+ (check with `python3 --version`) - Python 3.13.7
- [X] Install pip and virtualenv - Virtual environment created
- [X] Complete Python Quick Start guide - **Date**: January 16, 2026
- [X] Complete Python Basics Tutorial - **Date**: January 16, 2026
- [X] **Take screenshots** of final Basics Tutorial step - Python1.png, Python2.png, Python3.png
- [X] Use command format: `date; whoami; [your-command]` - **Completed**

## Q3: Implementation (~1 week)

### Project Planning
- [ ] Design simple service functionality (e.g., calculator, file storage, chat)
- [ ] Create shared `.proto` file defining service interface
- [ ] Plan Docker containerization strategy

### Implementation Structure
```
project/
├── proto/
│   └── service.proto          # Shared protocol definition
├── java-server/
│   ├── src/
│   ├── Dockerfile
│   └── build.gradle
├── java-client/
│   ├── src/
│   ├── Dockerfile  
│   └── build.gradle
├── python-server/
│   ├── server.py
│   ├── requirements.txt
│   └── Dockerfile
├── python-client/
│   ├── client.py
│   ├── requirements.txt
│   └── Dockerfile
└── README.md
```

### Development Tasks
- [ ] **Define Protocol Buffer (.proto file)**
  - [ ] Define message types
  - [ ] Define service methods (choose from unary, server streaming, client streaming, or bidirectional)

- [ ] **Java Server Implementation**
  - [ ] Generate Java classes from .proto
  - [ ] Implement server logic
  - [ ] Create Dockerfile
  - [ ] Test locally

- [ ] **Java Client Implementation** 
  - [ ] Generate Java classes from .proto
  - [ ] Implement client logic
  - [ ] Create Dockerfile
  - [ ] Test with Java server

- [ ] **Python Server Implementation**
  - [ ] Generate Python classes from .proto  
  - [ ] Implement server logic
  - [ ] Create Dockerfile
  - [ ] Test locally

- [ ] **Python Client Implementation**
  - [ ] Generate Python classes from .proto
  - [ ] Implement client logic
  - [ ] Create Dockerfile
  - [ ] Test with Python server

### AI Tools Usage Documentation
- [ ] **Document AI prompts used**
- [ ] **Record AI tool responses**
- [ ] **Explain how AI answers were utilized** 
- [ ] **List positive aspects** of AI assistance
- [ ] **List negative aspects** of AI assistance

### Docker Containerization
- [ ] Build Java server Docker image
- [ ] Build Java client Docker image  
- [ ] Build Python server Docker image
- [ ] Build Python client Docker image
- [ ] Test cross-language communication:
  - [ ] Java client ↔ Python server
  - [ ] Python client ↔ Java server

### Video Recording Requirements
- [ ] **Video 1 (5-10 seconds)**: Java client communicating with Python server
  - [ ] Use command format: `date; whoami; [docker-run-command]`
  - [ ] Show successful communication
- [ ] **Video 2 (5-10 seconds)**: Python client communicating with Java server  
  - [ ] Use command format: `date; whoami; [docker-run-command]`
  - [ ] Show successful communication

## Final Deliverables

### Code Organization
- [ ] Clean, well-commented source code
- [ ] Proper project structure
- [ ] All Dockerfiles working correctly

### README.md File (5 pts)
- [ ] **Compilation instructions** for both languages
- [ ] **Run instructions** for all components
- [ ] **Docker build and run commands**
- [ ] **Unusual aspects** of the solution
- [ ] **External sources** referenced

### Final Report
- [ ] **Student names and IDs** clearly listed
- [ ] **Work division** - who worked on what parts
- [ ] **Q1 Deliverables**:
  - [ ] Docker Hub link #1 (from Introduction guide)
  - [ ] Docker Hub link #2 (from Part 7 of workshop)
  - [ ] Categorized Docker commands with explanations
- [ ] **Q2 Deliverables**:
  - [ ] Screenshots from Java Basics Tutorial final step
  - [ ] Screenshots from Python Basics Tutorial final step
  - [ ] Commands showing `date; whoami;` prefix
- [ ] **Q3 Deliverables**:
  - [ ] AI tools usage documentation
  - [ ] Service functionality description
  - [ ] Cross-language communication explanation

### File Upload to Canvas
- [ ] Source code files (not zipped)
- [ ] README.md file  
- [ ] Video 1 file
- [ ] Video 2 file
- [ ] Final report file

## Recommended Timeline

### Week 1
- Days 1-3: Complete Q1 (Docker fundamentals)
- Days 4-7: Complete Q2 (gRPC basics in both languages)

### Week 2  
- Days 1-5: Q3 implementation and containerization
- Days 6-7: Testing, video recording, and report writing

## Technical Notes for macOS

### Required Tools
- Docker Desktop for Mac
- Java 8+ (install via Homebrew: `brew install openjdk`)
- Python 3.6+ (install via Homebrew: `brew install python`)
- Protocol Buffer Compiler: `brew install protobuf`

### Command Prefix for Screenshots
Always use: `date; whoami; [your-actual-command]`

### Docker Networking
For cross-container communication, consider using:
- Docker network: `docker network create grpc-network`
- Or Docker Compose for orchestration

## Success Criteria Checklist
- [ ] All Docker tutorial sections completed
- [ ] Two Docker Hub images shared
- [ ] gRPC tutorials completed in both languages
- [ ] Four separate Docker containers created
- [ ] Cross-language gRPC communication working
- [ ] Videos demonstrate successful communication
- [ ] Complete documentation and report
- [ ] All files uploaded separately to Canvas

---
**Remember**: Late penalty is 20 points per day. Start early and test thoroughly!