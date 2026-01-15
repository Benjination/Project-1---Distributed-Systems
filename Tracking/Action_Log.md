# Action Log - Time & Student Documentation

## Project Information
- **Student Name**: Benjamin Niccum
- **Student ID**: 1002111609
- **Project**: Distributed Systems Project 1
- **Platform**: macOS

## Command Format Requirements
**From Instructions**: "Please specify the time and the student performing the action for every step."

**macOS Format**: `date; whoami; [your-command]`
**Example**: `date; whoami; docker build --tag python-docker .`

---

## Q1: Docker Actions Log

### Docker Installation & Setup
**Date**: January 14, 2026
**Student**: Benjamin Niccum
```bash
date; whoami; docker --version
# Output: Docker version verified during setup
```

**Date**: January 15, 2026
**Student**: Benjamin Niccum
```bash
date; whoami; docker run -it ubuntu /bin/bash
# Output: Interactive Ubuntu container session
```

**Date**: January 15, 2026
**Student**: Benjamin Niccum
```bash
date; whoami; docker run -d -p 8080:80 docker/welcome-to-docker
# Output: Welcome container running on port 8080
```

### Docker Tutorial Actions
**Date**: ___________
**Student**: ___________
**Action**: Part 2 - Containerize application
```bash
date; whoami; docker build --tag getting-started .
# Output: [paste output here]
```

**Date**: ___________
**Student**: ___________
```bash
date; whoami; docker run -dp 127.0.0.1:3000:3000 getting-started
# Output: [paste output here]
```

**Date**: January 14, 2026
**Student**: Benjamin Niccum
**Action**: Part 3 - Share application (Docker Hub Link #1)
```bash
date; whoami; docker build -t bennythepooh/project.1 .
date; whoami; docker push bennythepooh/project.1
# Docker Hub Link #1: https://hub.docker.com/r/bennythepooh/project.1
```

**Date**: ___________
**Student**: ___________
**Action**: Part 7 - Docker Compose
```bash
date; whoami; docker compose up -d
# Output: [paste output here]
```

**Date**: ___________
**Student**: ___________
**Action**: Part 7 - Share Docker Compose image (Docker Hub Link #2)
```bash
date; whoami; docker tag [image-name] YOUR_USER_NAME/[image-name]
date; whoami; docker push YOUR_USER_NAME/[image-name]
# Docker Hub Link #2: [paste link here]
```

---

## Q2: gRPC Actions Log

### Java gRPC Tutorial
**Date**: ___________
**Student**: ___________
**Action**: Java environment check
```bash
date; whoami; java -version
# Output: [paste output here]
```

**Date**: ___________
**Student**: ___________
**Action**: Build Java gRPC example
```bash
date; whoami; ./gradlew build
# Output: [paste output here]
```

**Date**: ___________
**Student**: ___________
**Action**: Run Java server (SCREENSHOT REQUIRED)
```bash
date; whoami; ./gradlew runServer
# Output: [paste output here]
# Screenshot: [attach screenshot]
```

**Date**: ___________
**Student**: ___________
**Action**: Run Java client (SCREENSHOT REQUIRED)  
```bash
date; whoami; ./gradlew runClient
# Output: [paste output here]
# Screenshot: [attach screenshot]
```

### Python gRPC Tutorial
**Date**: ___________
**Student**: ___________
**Action**: Python environment check
```bash
date; whoami; python3 --version
# Output: [paste output here]
```

**Date**: ___________
**Student**: ___________
**Action**: Install Python gRPC
```bash
date; whoami; pip install grpcio grpcio-tools
# Output: [paste output here]
```

**Date**: ___________
**Student**: ___________
**Action**: Run Python server (SCREENSHOT REQUIRED)
```bash
date; whoami; python greeter_server.py
# Output: [paste output here]
# Screenshot: [attach screenshot]
```

**Date**: ___________
**Student**: ___________
**Action**: Run Python client (SCREENSHOT REQUIRED)
```bash
date; whoami; python greeter_client.py
# Output: [paste output here]
# Screenshot: [attach screenshot]
```

---

## Q3: Implementation Actions Log

### Protocol Buffer Generation
**Date**: ___________
**Student**: ___________
**Action**: Generate Java classes from proto
```bash
date; whoami; protoc --java_out=. --grpc-java_out=. service.proto
# Output: [paste output here]
```

**Date**: ___________
**Student**: ___________
**Action**: Generate Python classes from proto
```bash
date; whoami; python -m grpc_tools.protoc --python_out=. --grpc_python_out=. service.proto
# Output: [paste output here]
```

### Docker Image Building
**Date**: ___________
**Student**: ___________
**Action**: Build Java server image
```bash
date; whoami; docker build -t java-server ./java-server
# Output: [paste output here]
```

**Date**: ___________
**Student**: ___________
**Action**: Build Java client image
```bash
date; whoami; docker build -t java-client ./java-client
# Output: [paste output here]
```

**Date**: ___________
**Student**: ___________
**Action**: Build Python server image
```bash
date; whoami; docker build -t python-server ./python-server
# Output: [paste output here]
```

**Date**: ___________
**Student**: ___________
**Action**: Build Python client image
```bash
date; whoami; docker build -t python-client ./python-client
# Output: [paste output here]
```

### Cross-Language Testing
**Date**: ___________
**Student**: ___________
**Action**: Run Python server
```bash
date; whoami; docker run --name py-server --network grpc-net -p 50051:50051 python-server
# Output: [paste output here]
```

**Date**: ___________
**Student**: ___________
**Action**: Test Java client with Python server (VIDEO #1)
```bash
date; whoami; docker run --network grpc-net java-client
# Output: [paste output here]
# Video file: [video1_java_client_python_server.mp4]
```

**Date**: ___________
**Student**: ___________
**Action**: Run Java server  
```bash
date; whoami; docker run --name java-server --network grpc-net -p 50051:50051 java-server
# Output: [paste output here]
```

**Date**: ___________
**Student**: ___________
**Action**: Test Python client with Java server (VIDEO #2)
```bash
date; whoami; docker run --network grpc-net python-client
# Output: [paste output here]
# Video file: [video2_python_client_java_server.mp4]
```

---

## Additional Commands Log

### Docker Network Setup
**Date**: ___________
**Student**: ___________
```bash
date; whoami; docker network create grpc-net
# Output: [paste output here]
```

### Container Management
**Date**: ___________
**Student**: ___________
```bash
date; whoami; docker ps -a
# Output: [paste output here]
```

**Date**: ___________
**Student**: ___________
```bash
date; whoami; docker images
# Output: [paste output here]
```

---

## Template for Additional Actions
**Date**: ___________
**Student**: ___________
**Action**: 
```bash
date; whoami; [command]
# Output: [paste output here]
```

## Notes Section
- Use this section for any additional observations or issues encountered
- Include timestamps for debugging sessions
- Note any deviations from planned approach