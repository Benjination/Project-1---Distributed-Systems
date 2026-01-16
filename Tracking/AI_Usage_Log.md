# AI Tools Usage Documentation

## Project Information
- **Student Name**: Benjamin Niccum
- **Student ID**: 1002111609
- **Project**: Distributed Systems Project 1
- **Date Started**: January 14, 2026

## AI Tools Usage Tracking (Required for Q3)

### Instructions from Assignment
> "You should use AI tools for this question. You should include in the report brief descriptions of (1) the prompts you provide, (2) the answers provided by the AI tools, (3) how you use these answers to complete this question, (4) bullet points summarizing both the positive and negative aspects of your experience with the AI tools you used for this question."

---

## AI Tool Session #1
**Date**: January 14, 2026
**Time**: Afternoon
**AI Tool Used**: GitHub Copilot (Claude Sonnet 4)
**Task**: Project planning and documentation setup

### Prompt(s) Provided:
```
1. "I added the instructions for my first Distributed Systems Project. Let's create a file that has a step by step checklist of what I need to do. I'm working on a mac, and I'll probably write the code in java, unless a different language would be considerably better. I'm also open to using python."

2. "Now read through the two files here, and let's create files for everything that I need to keep track of. I know there is a req to include Ai involvement. We will need a file for that. There is also one for documenting when and by whom each action was taken."
```

### AI Response(s):
```
AI provided:
1. Comprehensive step-by-step checklist (Project_Checklist.md) breaking down all 3 questions with timeline, recommended Java+Python approach, macOS-specific instructions
2. Four tracking files:
   - AI_Usage_Log.md (for Q3 AI documentation requirement)
   - Action_Log.md (time/student documentation with date;whoami format)
   - Docker_Commands_Reference.md (Q1 command categorization requirement)
   - Progress_Tracker.md (overall project management)
```

### How I Used This Answer:
- [x] Used files directly as provided
- [ ] Modified the code before using
- [ ] Used as reference/guidance only
- [ ] Combined with other sources
- [ ] Other: ___________

**Specific Implementation Details**:
- Created organized project structure with separate Tracking/ folder
- All tracking templates ready for documentation as work progresses
- Checklist provides clear 2-week timeline with language recommendations (Java+Python for cross-language communication)
- Files address all specific documentation requirements from project instructions

---

## AI Tool Session #2
**Date**: January 15, 2026
**Time**: Afternoon
**AI Tool Used**: GitHub Copilot (Claude Sonnet 4)
**Task**: LaTeX report structure creation and content population

### Prompt(s) Provided:
```
"I started a new folder called Latex PDF. Lets fill it with a main file that has intro stuff and Table of Contents etc... It should have three sections that will be different structures for Q1, Q2, and Q3. Add as much of the details from our tracking as you can, and include the images where applicable. I'll add the images on overleaf in a folder called images."
```

### AI Response(s):
```
AI provided comprehensive LaTeX document with:
1. Complete document structure with proper formatting and packages
2. Title page with student name and ID (Benjamin Niccum - 1002111609)
3. Table of contents and professional formatting
4. Q1 section fully populated with:
   - Docker Hub links (both required deliverables)
   - Complete command documentation tables
   - Timestamped command examples with date;whoami format
   - Screenshot placeholders for existing images
5. Q2 section template ready for gRPC tutorials
6. Q3 section structure with AI usage documentation
7. References and conclusion sections
```

### How I Used This Answer:
- [x] Used code directly as provided
- [ ] Modified the code before using
- [ ] Used as reference/guidance only
- [ ] Combined with other sources
- [ ] Other: ___________

**Specific Implementation Details**:
- Used complete LaTeX file as provided for main report structure
- Document includes all tracking data from Progress_Tracker.md and Action_Log.md
- Q1 section fully populated with completed Docker work
- Ready for upload to Overleaf with image folder integration
- Serves as primary deliverable for final project report

---

## AI Tool Session #4
**Date**: January 15-16, 2026
**Time**: Evening/Morning
**AI Tool Used**: GitHub Copilot (Claude Sonnet 4)
**Task**: Java gRPC environment setup and tutorial completion

### Prompt(s) Provided:
```
1. "Before we move on, Let's add to the Ai contributions that you helped me install Java, Maven, and the others."
2. "I want to be a part of the tutorial. If you do it alone, I won't learn anything."
3. "Excellent. Let's update the tracker and the Latex file."
```

### AI Response(s):
```
AI provided:
1. Complete Java development environment setup guidance including:
   - OpenJDK 17 LTS installation via Homebrew (resolved Java 25 compatibility issues)
   - Maven installation and configuration
   - PATH configuration for Java 17
   - gRPC Java examples repository cloning and compilation
2. Step-by-step tutorial guidance emphasizing student participation
3. Comprehensive documentation updates for tracking files and LaTeX report
4. Proper command formatting with date;whoami prefixes
5. Detailed explanation of all four gRPC RPC types demonstrated
```

### How I Used This Answer:
- [x] Used guidance directly as provided
- [x] Modified commands for specific environment paths
- [x] Used as reference/guidance throughout tutorials
- [ ] Combined with other sources
- [ ] Other: ___________

**Specific Implementation Details**:
- Used AI guidance to resolve Java version compatibility issues (Java 25 → Java 17)
- Followed step-by-step instructions for environment setup and compilation
- Executed all tutorial steps with AI assistance but maintained active learning participation
- Successfully completed both Quick Start and Basics Tutorial (Route Guide example)
- Demonstrated all four gRPC RPC communication patterns with proper screenshot capture
- Updated all tracking documentation with AI-assisted formatting

---

## AI Tool Session #5
**Date**: January 16, 2026
**Time**: Afternoon
**AI Tool Used**: GitHub Copilot (Claude Sonnet 4)
**Task**: Python gRPC environment setup, package installation, and tutorial completion

### Prompt(s) Provided:
```
1. "Continue: Continue to iterate?"
2. "Now let's run the Python Route Guide server and client to complete the Basics Tutorial. I'll start the server first, then run the client for the screenshot."
3. "Let's update the Ai contributions to explain that you installed the Python package and setup for python."
```

### AI Response(s):
```
AI provided:
1. Complete Python gRPC environment setup guidance including:
   - Python 3.13.7 virtual environment creation and activation
   - gRPC Python packages installation (grpcio-1.76.0, grpcio-tools-1.76.0, protobuf-6.33.4)
   - gRPC Python repository cloning and navigation
   - Resolution of externally-managed-environment errors through isolated virtual environment
2. Step-by-step tutorial execution for both Quick Start and Basics Tutorial
3. Troubleshooting and debugging assistance for server/client connectivity issues
4. Protocol buffer file regeneration and port conflict resolution
5. Comprehensive documentation updates for LaTeX report with Python screenshot integration
```

### How I Used This Answer:
- [x] Used guidance directly as provided
- [x] Modified commands for specific environment paths  
- [x] Used as reference/guidance throughout setup and tutorials
- [x] Combined with troubleshooting for port conflicts
- [ ] Other: ___________

**Specific Implementation Details**:
- Used AI guidance to create isolated Python virtual environment at `/Users/necro/Desktop/Spring '26/Distributed Systems/Project 1/gRPC_Python/grpc_env`
- Followed step-by-step instructions for gRPC Python packages installation in virtual environment
- Successfully resolved Python externally-managed-environment restrictions through virtual environment isolation
- Executed Python Hello World Quick Start with proper client-server communication
- Completed Python Route Guide Basics Tutorial demonstrating all four gRPC RPC types:
  - Simple RPC (GetFeature)
  - Server-side streaming RPC (ListFeatures)
  - Client-side streaming RPC (RecordRoute)  
  - Bidirectional streaming RPC (RouteChat)
- Debugged and resolved port conflicts and server connectivity issues with AI assistance
- Updated LaTeX documentation with Python gRPC completion status and screenshot placeholders

---

## AI Tool Session #TBD
**Date**: 
**Time**: 
**AI Tool Used**: 
**Task**: 

### Prompt(s) Provided:
```
[Copy your exact prompts here]
```

### AI Response(s):
```
[Copy the AI's responses here]
```

### How I Used This Answer:
- [ ] Used code directly as provided
- [ ] Modified the code before using
- [ ] Used as reference/guidance only
- [ ] Combined with other sources
- [ ] Other: ___________

**Specific Implementation Details**:
[Describe exactly how you incorporated the AI's help]

---

## Summary Assessment

### Positive Aspects of AI Tools Experience:
- [ ] **Code Generation**: 
- [ ] **Problem Solving**: 
- [ ] **Learning Support**: 
- [ ] **Debugging Help**: 
- [ ] **Documentation**: 
- [ ] **Time Efficiency**: 
- [ ] **Other**: 

### Negative Aspects of AI Tools Experience:
- [ ] **Accuracy Issues**: 
- [ ] **Code Quality**: 
- [ ] **Understanding Gaps**: 
- [ ] **Dependency**: 
- [ ] **Debugging Difficulty**: 
- [ ] **Learning Hindrance**: 
- [ ] **Other**: 

### Overall Rating of AI Tools Usefulness: ___/10

### Recommendations for Future AI Tool Usage:
1. 
2. 
3. 

---

## AI Tool Session #3
**Date**: January 15, 2026
**Time**: 4:45 PM - 5:00 PM
**AI Tool Used**: GitHub Copilot (Claude Sonnet 4)
**Task**: Java gRPC Environment Setup and Quick Start Tutorial

### Prompt(s) Provided:
```
1. "Continue to iterate?" (continuing Q2 gRPC work)
2. "Before we move on, Let's add to the Ai contributions that you helped me install Java, Maven, and the others."
```

### AI Response(s):
```
- Guided through Java installation troubleshooting (Java 25 compatibility issue → Java 17 LTS)
- Provided step-by-step OpenJDK and Maven installation via Homebrew
- Assisted with PATH configuration for Java 17
- Guided through gRPC Java repository cloning and build process
- Provided terminal commands with proper date/whoami format
- Helped navigate gRPC Quick Start tutorial
- Added documentation to LaTeX report AI usage section
```

### How I Used This Answer:
Successfully set up complete Java development environment for gRPC work. Followed AI guidance to resolve version compatibility issues and complete Quick Start tutorial.

### Specific Implementation Details:
- Installed Java 17 LTS (resolved Java 25 incompatibility)
- Installed Maven 3.9.12 for project management
- Cloned and built gRPC Java examples repository
- Successfully ran hello-world-server and hello-world-client
- Completed Java gRPC Quick Start tutorial
- Updated LaTeX report with AI usage documentation

---

## AI Tool Session #4
**Date**: January 16, 2026
**Time**: 8:00 AM - 6:00 PM (Full Day Implementation)
**AI Tool Used**: GitHub Copilot (Claude Sonnet 4)
**Task**: Complete Q3 Cross-Language Phonebook Implementation with Docker Deployment

### Prompt(s) Provided:
```
1. "Let's continue with Q2, we have the Java running. let's get the Python working too"
2. "Alright, lets move on to Q3. Can you tell me what exactly I need to implement?"
3. "Let's start creating the basic structure for Q3. I want to make sure we have a good foundation"
4. "I want to create a phonebook application with Java frontend and Python backend using gRPC"
5. "Let's implement the web interface using Spring Boot with proper forms and UI"
6. "Now let's containerize everything with Docker and Docker Compose"
7. "I'm having issues with phone number editing - it seems to be readonly"
8. "Since these are Docker containers, I'd like to upload them to Docker so that I can include a link"
```

### AI Response(s):
```
Comprehensive implementation assistance including:

1. **Python gRPC Tutorial Completion**:
   - Guided through Python virtual environment setup
   - Completed Python Hello World and Route Guide tutorials  
   - Set up gRPC-tools and protobuf compilation

2. **Q3 Architecture Design**:
   - Designed cross-language phonebook system architecture
   - Created protobuf schema for Contact and ContactRequest messages
   - Planned Java web frontend + Python gRPC backend structure

3. **Python gRPC Server Implementation**:
   - Created phonebook_server.py with full CRUD operations
   - Implemented thread-safe in-memory contact storage
   - Added comprehensive logging and error handling
   - Built auto-incrementing unique ID system

4. **Java Spring Boot Web Application**:
   - Created complete Spring Boot project structure
   - Implemented PhonebookController with REST endpoints  
   - Built PhonebookGrpcClient for cross-language communication
   - Created professional Bootstrap UI with Thymeleaf templates
   - Added ContactForm model and validation

5. **Docker Containerization**:
   - Created Dockerfiles for both Python and Java services
   - Implemented docker-compose.yml with service orchestration
   - Configured container networking and health checks
   - Set up proper service dependencies and startup order

6. **Advanced Problem Solving**:
   - Diagnosed and fixed phone number readonly issue in HTML templates
   - Redesigned system to use unique IDs while keeping phone numbers editable
   - Implemented duplicate phone number prevention
   - Added comprehensive cross-container logging

7. **Docker Hub Deployment**:
   - Tagged and pushed both containers to Docker Hub
   - Created bennythepooh/phonebook-web and bennythepooh/phonebook-database images
   - Built docker-compose.hub.yml for public deployment
   - Updated README with Docker Hub links and deployment instructions
```

### How I Used This Answer:
- [x] Used code directly as provided
- [x] Modified the code before using (minor customizations)
- [ ] Used as reference/guidance only
- [ ] Combined with other sources
- [ ] Other: ___________

**Specific Implementation Details**:

**Phase 1 - Python gRPC Setup**:
- Successfully completed Python Hello World and Route Guide tutorials
- Set up virtual environment with gRPC dependencies
- Verified cross-language protobuf compilation

**Phase 2 - Core Application Development**:
- Built complete phonebook.proto schema with Contact/ContactRequest/ContactResponse messages
- Implemented Python gRPC server with auto-incrementing IDs and thread-safe storage
- Created Java Spring Boot web application with professional Bootstrap UI
- Integrated gRPC client into Spring Boot for cross-language communication

**Phase 3 - Docker Integration**:
- Containerized both services with optimized Dockerfiles
- Implemented service orchestration with health checks and dependencies
- Configured custom Docker network for inter-service communication
- Successfully tested end-to-end containerized deployment

**Phase 4 - Advanced Features & Problem Resolution**:
- Diagnosed HTML template issue causing readonly phone numbers
- Redesigned data model from phone-number-as-key to unique ID system
- Maintained user-friendly phone number editing while ensuring data integrity
- Added comprehensive validation and duplicate prevention

**Phase 5 - Public Deployment**:
- Successfully pushed both images to Docker Hub as public repositories
- Created deployment-ready docker-compose configuration for easy distribution
- Updated project documentation with deployment links and instructions
- Verified public deployment functionality from Docker Hub images

**Technical Achievements**:
- ✅ Cross-language gRPC communication (Java ↔ Python)
- ✅ Professional web interface with Bootstrap UI
- ✅ Complete containerization with Docker Compose
- ✅ Public deployment via Docker Hub
- ✅ Advanced features: unique IDs, editable fields, validation, logging
- ✅ Production-ready architecture with proper error handling

---

## AI Tool Session #5  
**Date**: January 16, 2026
**Time**: 6:00 PM - 6:30 PM
**AI Tool Used**: GitHub Copilot (Claude Sonnet 4)
**Task**: Documentation Updates and Project Finalization

### Prompt(s) Provided:
```
1. "Let's update the README in Q3_CrossLanguage"
2. "Now let's update our progress tracker and the AI Usage log"
```

### AI Response(s):
```
AI provided comprehensive documentation updates:
1. Confirmed README.md was already comprehensive with Docker Hub links and deployment instructions
2. Updated Progress_Tracker.md to 100% completion status with detailed Q3 phases
3. Added comprehensive AI Usage Log session documenting the full implementation journey
4. Updated time tracking and daily progress logs to reflect project completion
```

### How I Used This Answer:
- [x] Used code directly as provided
- [ ] Modified the code before using  
- [ ] Used as reference/guidance only
- [ ] Combined with other sources
- [ ] Other: ___________

**Specific Implementation Details**:
- Verified README.md completeness with all Docker Hub links and deployment instructions
- Updated Progress_Tracker.md from 70% to 100% complete with detailed phase breakdown
- Documented comprehensive AI usage for Q3 requirement compliance
- Finalized all project tracking documentation for submission readiness

---

## Session Summary  
**Total Sessions**: 5
**Total Duration**: ~12 hours over 3 days
**Primary Outcomes**: 
- Complete Project 1 implementation (100%)
- Cross-language gRPC phonebook system
- Professional Docker Hub deployment
- Comprehensive documentation and tracking

**Project Status**: ✅ COMPLETED - Ready for submission

### Overall AI Contribution Assessment

**Positive Aspects**:
✅ **Comprehensive Architecture Guidance**: AI provided excellent system design recommendations for cross-language communication
✅ **Code Generation Efficiency**: Generated complete, working code for both Java Spring Boot and Python gRPC components  
✅ **Problem-Solving Excellence**: Diagnosed and resolved complex issues (readonly fields, container networking, ID system redesign)
✅ **Professional Documentation**: Created comprehensive README, Docker Hub deployment instructions, and project tracking
✅ **Docker Expertise**: Guided through complete containerization including multi-service orchestration and public deployment
✅ **Best Practices**: Ensured professional code quality, proper error handling, logging, and validation throughout

**Negative Aspects**:
⚠️ **Learning Curve**: Required iterative refinement to understand specific requirements and constraints
⚠️ **Context Switching**: Needed to provide context when switching between different aspects of the project
⚠️ **Platform-Specific Issues**: Some Docker and Java version compatibility issues required troubleshooting
⚠️ **Template Precision**: HTML template issues required careful debugging to identify readonly attribute problems

**Overall Assessment**: The AI assistance was instrumental in completing this complex distributed systems project efficiently. The combination of code generation, architecture guidance, problem-solving, and documentation support enabled rapid development of a production-quality cross-language system with Docker deployment. The iterative problem-solving approach led to a robust final implementation that exceeds basic requirements.

---

## Template for Additional Sessions
*Copy this template as needed for more AI tool interactions*

**Date**: 
**Time**: 
**AI Tool Used**: 
**Task**: 

### Prompt(s) Provided:
```
```

### AI Response(s):
```
```

### How I Used This Answer:
### Specific Implementation Details: