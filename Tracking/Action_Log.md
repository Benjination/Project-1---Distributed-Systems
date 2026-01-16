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

## Q2: gRPC Actions Log

### Java Environment Setup
**Date**: January 15, 2026
**Student**: Benjamin Niccum
```bash
date; whoami; java --version
# Error: Unable to locate Java Runtime

date; whoami; brew install openjdk
# OpenJDK 25 installed successfully

date; whoami; brew install openjdk@17  
# Java 17 LTS installed for gRPC compatibility

date; whoami; export PATH="/opt/homebrew/opt/openjdk@17/bin:$PATH"; java --version
# openjdk 17.0.17 2025-10-21

date; whoami; brew install maven
# Maven 3.9.12 installed
```

### gRPC Java Examples Setup
**Date**: January 15, 2026
**Student**: Benjamin Niccum
```bash
date; whoami; cd "/Users/necro/Desktop/Spring '26/Distributed Systems/Project 1" && mkdir gRPC_Java && cd gRPC_Java

date; whoami; git clone -b v1.69.0 --depth 1 --recursive https://github.com/grpc/grpc-java
# Successfully cloned gRPC Java repository

date; whoami; cd grpc-java/examples && ./gradlew installDist
# Build successful with Java 17
```

### gRPC Quick Start Tutorial Completion
**Date**: January 15, 2026
**Student**: Benjamin Niccum
```bash
date; whoami; ./build/install/examples/bin/hello-world-server
# Server started, listening on 50051

date; whoami; ./build/install/examples/bin/hello-world-client  
# Client: "Will try to greet world..."
# Successfully demonstrated gRPC communication
```

### gRPC Basics Tutorial - Route Guide Example
**Date**: January 16, 2026
**Student**: Benjamin Niccum
```bash
date; whoami; cd "/Users/necro/Desktop/Spring '26/Distributed Systems/Project 1/gRPC_Java/grpc-java/examples" && export PATH="/opt/homebrew/opt/openjdk@17/bin:$PATH" && ./build/install/examples/bin/route-guide-server &
# Route guide server started on port 8980

date; whoami; cd "/Users/necro/Desktop/Spring '26/Distributed Systems/Project 1/gRPC_Java/grpc-java/examples" && export PATH="/opt/homebrew/opt/openjdk@17/bin:$PATH" && ./build/install/examples/bin/route-guide-client
# Output: Successfully demonstrated all four gRPC RPC types:
# - GetFeature (unary): Found feature called "Patriots Path, Mendham, NJ 07945, USA"
# - ListFeatures (server streaming): Looking for features between 40, -75 and 42, -73
# - RecordRoute (client streaming): Finished trip with 10 points. Passed 3 features
# - RouteChat (bidirectional streaming): Got message First message at 0, 0
```

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

**Date**: January 15, 2026
**Student**: Benjamin Niccum
**Action**: Part 7 - Share Docker Compose image (Docker Hub Link #2)
```bash
date; whoami; docker tag getting-started bennythepooh/getting-started
date; whoami; docker push bennythepooh/getting-started
# Docker Hub Link #2: https://hub.docker.com/repository/docker/bennythepooh/getting-started/general
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

### Python Environment Setup & gRPC Completion
**Date**: January 16, 2026
**Student**: Benjamin Niccum
```bash
date; whoami; python3 --version
# Python 3.13.7

date; whoami; cd "/Users/necro/Desktop/Spring '26/Distributed Systems/Project 1" && mkdir gRPC_Python && cd gRPC_Python
# Created Python gRPC directory

date; whoami; python3 -m venv grpc_env
# Virtual environment created successfully

date; whoami; source grpc_env/bin/activate && pip install grpcio grpcio-tools protobuf
# grpcio-1.76.0, grpcio-tools-1.76.0, protobuf-6.33.4 installed

date; whoami; git clone -b v1.69.0 --depth 1 https://github.com/grpc/grpc-python.git
# Successfully cloned gRPC Python repository
```

### Python Quick Start Tutorial
**Date**: January 16, 2026
**Student**: Benjamin Niccum
```bash
date; whoami; cd grpc-python/examples/python/helloworld && source "/Users/necro/Desktop/Spring '26/Distributed Systems/Project 1/gRPC_Python/grpc_env/bin/activate"
# Activated virtual environment in hello world directory

date; whoami; python3 greeter_server.py &
# Server started on port 50051

date; whoami; python3 greeter_client.py
# Output: Will try to greet world ...
#         Greeter client received: Hello, you!
# Screenshot: Python1.png
```

### Python Basics Tutorial - Route Guide
**Date**: January 16, 2026
**Student**: Benjamin Niccum
```bash
date; whoami; cd ../route_guide && python3 route_guide_server.py &
# Route Guide server started on port 50051

date; whoami; sleep 2 && date && whoami && python3 route_guide_client.py 2>&1
# Fri Jan 16 14:55:17 CST 2026
# necro
# -------------- GetFeature --------------
# Feature called 'Berkshire Valley Management Area Trail, Jefferson, NJ, USA' at latitude: 409146138, longitude: -746188906
# Found no feature at latitude: 0, longitude: 0
# -------------- ListFeatures --------------
# [Extensive feature listings...]
# -------------- RecordRoute --------------
# Finished trip with 10 points, Passed 10 features, Travelled 687590 meters, It took 0 seconds
# -------------- RouteChat --------------
# [Bidirectional streaming messages...]
# Screenshots: Python2.png, Python3.png
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