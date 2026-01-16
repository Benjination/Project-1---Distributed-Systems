# Q3: Cross-Language Phonebook Service - Progress Tracker

## Project Overview
**Service**: Personal Phonebook Database  
**Architecture**: Java Web Frontend ↔ Python gRPC Database Backend  
**Demo**: Web interface at `localhost:8080` for visual demonstration  
**Videos**: Two 5-10 second clips showing cross-language communication  

## Implementation Steps Checklist

### Phase 1: Project Structure Setup
- [x] Create Q3 project directory structure (**Date**: January 16, 2026)
- [x] Set up proto/ directory for shared definitions (**Date**: January 16, 2026)
- [x] Create Java and Python component directories (**Date**: January 16, 2026)

**Expected Structure:**
```
Q3_CrossLanguage_Phonebook/
├── proto/
│   └── phonebook.proto           # Shared gRPC service definition
├── java-web-server/
│   ├── src/main/java/
│   ├── src/main/resources/static/ # HTML/CSS files
│   ├── build.gradle
│   └── Dockerfile
├── python-database-server/
│   ├── phonebook_server.py
│   ├── requirements.txt
│   └── Dockerfile
├── python-client/
│   ├── phonebook_client.py
│   ├── requirements.txt
│   └── Dockerfile
├── docker-compose.yml
└── README.md
```

### Phase 2: Protocol Buffer Definition
- [x] Define Contact message structure (**Date**: January 16, 2026)
- [x] Define PhonebookService with CRUD operations (**Date**: January 16, 2026)
- [x] Generate Java classes from proto (**Date**: January 16, 2026)
- [x] Generate Python classes from proto (**Date**: January 16, 2026)

**Required gRPC Methods:**
- `AddContact(Contact) → Response`
- `GetContact(ContactRequest) → Contact` 
- `UpdateContact(Contact) → Response`
- `DeleteContact(ContactRequest) → Response`
- `ListContacts(Empty) → ContactList`

### Phase 3: Python Database Server Implementation
- [x] Implement gRPC server class (**Date**: January 16, 2026)
- [x] Create in-memory contact storage (dictionary) (**Date**: January 16, 2026)
- [x] Implement AddContact method (**Date**: January 16, 2026)
- [x] Implement GetContact method (**Date**: January 16, 2026)
- [x] Implement UpdateContact method (**Date**: January 16, 2026)
- [x] Implement DeleteContact method (**Date**: January 16, 2026)
- [x] Implement ListContacts method (**Date**: January 16, 2026)
- [x] Test Python server locally (**Date**: January 16, 2026)

### Phase 4: Java Web Server Implementation  
- [x] Set up Spring Boot web application (**Date**: January 16, 2026)
- [x] Create gRPC client to Python server (**Date**: January 16, 2026)
- [x] Implement HTML forms (add/edit/delete/list) (**Date**: January 16, 2026)
- [x] Create REST endpoints for web interface (**Date**: January 16, 2026)
- [x] Implement contact management controllers (**Date**: January 16, 2026)
- [x] Add CSS styling for professional appearance (**Date**: January 16, 2026)
- [x] Test Java web server locally (**Date**: January 16, 2026)

### Phase 5: Python CLI Client Implementation
- [ ] Create Python command-line client (**Date**: _______)
- [ ] Implement direct gRPC calls to Java server (**Date**: _______)
- [ ] Add interactive menu for operations (**Date**: _______)
- [ ] Test Python client with Java server (**Date**: _______)

### Phase 6: Docker Containerization
- [ ] Create Python database server Dockerfile (**Date**: _______)
- [ ] Create Java web server Dockerfile (**Date**: _______)  
- [ ] Create Python client Dockerfile (**Date**: _______)
- [ ] Build all Docker images successfully (**Date**: _______)
- [ ] Create docker-compose.yml for orchestration (**Date**: _______)
- [ ] Create Docker network configuration (**Date**: _______)
- [ ] Test all containers communicate properly (**Date**: _______)

### Phase 7: Integration Testing
- [ ] Test full workflow: Web → Java → Python → Storage (**Date**: _______)
- [ ] Verify contact persistence across operations (**Date**: _______)
- [ ] Test error handling and edge cases (**Date**: _______)
- [ ] Validate cross-language data consistency (**Date**: _______)

### Phase 8: Video Recording Preparation
- [ ] Practice demo workflow for smooth recording (**Date**: _______)
- [ ] Prepare sample data for demonstrations (**Date**: _______)
- [ ] Test localhost:8080 interface appearance (**Date**: _______)
- [ ] Verify terminal commands work as expected (**Date**: _______)

### Phase 9: Video Production
- [ ] **Video 1**: Java Web Client ↔ Python Database Server (**Date**: _______)
  - [ ] Record: `date; whoami; docker-compose up`
  - [ ] Show: Web browser adding/viewing contacts
  - [ ] Demonstrate: Contact stored in Python backend
  - **File**: `java_client_python_server.mp4`

- [ ] **Video 2**: Python CLI Client ↔ Java Web Server (**Date**: _______)
  - [ ] Record: `date; whoami; docker run python-client`
  - [ ] Show: Python client direct gRPC calls
  - [ ] Demonstrate: Java server processing requests
  - **File**: `python_client_java_server.mp4`

### Phase 10: Documentation & Submission
- [ ] Update README.md with complete instructions (**Date**: _______)
- [ ] Document Docker build and run commands (**Date**: _______)
- [ ] Add troubleshooting section (**Date**: _______)
- [ ] Update LaTeX report Q3 section (**Date**: _______)
- [ ] Verify all deliverables are complete (**Date**: _______)

## Technical Requirements Checklist

### Protocol Buffer Requirements ✓/❌
- [ ] Shared .proto file defines service interface
- [ ] All message types properly defined
- [ ] Both languages can generate code from proto
- [ ] gRPC service methods cover all CRUD operations

### Cross-Language Communication ✓/❌  
- [ ] Java can call Python gRPC server
- [ ] Python can call Java gRPC server
- [ ] Data serialization works between languages
- [ ] Error handling works across language boundaries

### Docker Requirements ✓/❌
- [ ] 4 separate Docker containers (Java server, Java client, Python server, Python client)
- [ ] All containers build successfully
- [ ] Containers communicate via Docker network
- [ ] docker-compose orchestrates all services

### Video Requirements ✓/❌
- [ ] Video 1: 5-10 seconds showing Java↔Python
- [ ] Video 2: 5-10 seconds showing Python↔Java
- [ ] Both videos include `date; whoami;` commands
- [ ] Clear demonstration of cross-language communication
- [ ] Professional quality suitable for submission

## Demo Script for Videos

### Video 1 Script: Java Web → Python Database
```bash
date; whoami; docker-compose up -d
# [Open browser to localhost:8080]
# [Add contact: "John Doe, 555-1234, john@email.com"]
# [Show contact list displaying the stored contact]
# [Demonstrate contact was stored in Python backend]
```

### Video 2 Script: Python CLI → Java Web  
```bash
date; whoami; docker run --network phonebook_network python-client
# [Python client shows menu]
# [Select "List Contacts" - shows contacts from Java server]
# [Select "Add Contact" - adds via Java server]  
# [Demonstrate cross-language communication in terminal]
```

## Success Criteria
- ✅ **Visual Interface**: Web browser shows professional phonebook
- ✅ **Cross-Language**: Clear evidence Java ↔ Python communication  
- ✅ **Data Persistence**: Contacts survive server restarts
- ✅ **Docker Integration**: All components containerized and networked
- ✅ **Video Quality**: Professional demonstrations under 10 seconds each
- ✅ **Code Quality**: Clean, well-commented, production-ready code

## Timeline Estimate
- **Phase 1-2**: 2 hours (Setup + Proto)
- **Phase 3**: 3 hours (Python Server)  
- **Phase 4**: 4 hours (Java Web Server)
- **Phase 5**: 2 hours (Python Client)
- **Phase 6**: 3 hours (Docker)
- **Phase 7-10**: 2 hours (Testing + Videos)
- **Total**: ~16 hours (~2 days)

---

## Notes Section
- Record any implementation challenges here
- Note deviations from planned approach  
- Track debugging sessions and solutions