# Cross-Language Phonebook - Docker Deployment

## 🐳 Docker Hub Images

**Ready-to-use Docker images available on Docker Hub:**
- **Web Interface**: [`bennythepooh/phonebook-web:latest`](https://hub.docker.com/r/bennythepooh/phonebook-web)
- **Database Server**: [`bennythepooh/phonebook-database:latest`](https://hub.docker.com/r/bennythepooh/phonebook-database)

## 🏗️ Architecture Overview

This project demonstrates cross-language communication using gRPC with the following containerized services:

```
Browser → Java Web Server → Python gRPC Server → In-Memory Storage
 :8080      (Docker)          (Docker)            (Python Dict)
```

## 🐳 Docker Services

### 1. **python-db-server** (Port 50051)
- **Technology**: Python 3.13 + gRPC
- **Purpose**: Database server with in-memory contact storage
- **Features**: Thread-safe CRUD operations, comprehensive logging

### 2. **java-web-server** (Port 8080) 
- **Technology**: Java 17 + Spring Boot + gRPC Client
- **Purpose**: Web interface with REST API + gRPC communication
- **Features**: Professional UI, form handling, cross-language calls

### 3. **python-client** (Manual)
- **Technology**: Python 3.13 + gRPC Client  
- **Purpose**: Command-line testing client
- **Usage**: For demonstration and testing

## 🚀 Quick Start

### Option 1: Run from Docker Hub (Recommended)
```bash
# Download the docker-compose file
curl -O https://raw.githubusercontent.com/Benjination/Project-1---Distributed-Systems/main/Q3_CrossLanguage_Phonebook/docker-compose.hub.yml

# Start the application
docker-compose -f docker-compose.hub.yml up

# Or run in background
docker-compose -f docker-compose.hub.yml up -d
```

### Option 2: Build from Source
### Prerequisites
- Docker and Docker Compose installed
- Ports 8080 and 50051 available

### 1. Build and Start Services
```bash
# Navigate to project directory
cd Q3_CrossLanguage_Phonebook

# Start all services (builds images automatically)
docker-compose up --build

# Or run in background
docker-compose up --build -d
```

### 2. Access the Application
- **🌐 Live Demo**: http://localhost:8080 (Cross-language phonebook interface)
- **📱 Features**: Add, edit, delete contacts with real-time Java→Python gRPC communication
- **🔧 Internal**: localhost:50051 (Python gRPC server - internal use only)

### 3. Test Cross-Language Communication
1. Open browser to http://localhost:8080
2. Click "Add Contact" 
3. Fill form: Name, Phone, Email, Address
4. Submit → Watch Java→Python gRPC communication!
5. View contacts, edit, delete - all via cross-language calls

## 📋 Available Commands

### Service Management
```bash
# Start services
docker-compose up

# Stop services  
docker-compose down

# Rebuild and restart
docker-compose up --build

# View logs
docker-compose logs -f

# View specific service logs
docker-compose logs -f java-web-server
docker-compose logs -f python-db-server
```

### Manual Testing with Python Client
```bash
# Run the Python CLI client manually
docker-compose run --rm python-client

# Or run interactively
docker-compose run --rm python-client python phonebook_client.py
```

### Service Health Checks
```bash
# Check service status
docker-compose ps

# Check health status
docker inspect phonebook-java-web --format='{{.State.Health.Status}}'
docker inspect phonebook-python-db --format='{{.State.Health.Status}}'
```

## 🔧 Development Mode

For development, you can run individual services:

```bash
# Run only Python database server
docker-compose up python-db-server

# Run only Java web server (requires Python server)
docker-compose up java-web-server
```

## 🌐 Network Configuration

- **Network Name**: `phonebook-net`
- **Driver**: Bridge
- **Inter-service Communication**: Container hostnames
  - `python-db-server:50051` (gRPC server)
  - `java-web-server:8080` (Web server)

## 📊 Service Dependencies

```
python-db-server (starts first)
    ↓ (wait for healthy)
java-web-server (starts after Python server ready)  
    ↓ (wait for healthy)
python-client (manual start only)
```

## 🎯 Demo Instructions for Professor

1. **Start the system**: `docker-compose up --build`
2. **Open browser**: http://localhost:8080
3. **Demonstrate features**:
   - Professional cross-language phonebook interface
   - Add contacts via web form
   - Real-time Java→Python gRPC communication
   - View, edit, delete contacts
   - See contact count and architecture diagram

4. **Show Docker integration**:
   - `docker-compose ps` (running services)
   - `docker-compose logs` (cross-language communication logs)
   - Container networking and service discovery

## 🛠️ Troubleshooting

### Common Issues
- **Port conflicts**: Ensure 8080 and 50051 are available
- **Build failures**: Run `docker-compose down` then `docker-compose up --build`
- **Connection issues**: Check service health with `docker-compose ps`

### Reset Everything
```bash
# Stop and remove all containers, networks, and volumes
docker-compose down -v --remove-orphans

# Remove all images (optional)
docker-compose down --rmi all

# Clean start
docker-compose up --build
```

## 📈 Monitoring

- **Web Interface**: Real-time contact count and status
- **Docker Logs**: Cross-language communication traces
- **Health Checks**: Automatic service monitoring
- **Network**: Isolated container communication

This Docker setup demonstrates enterprise-grade containerization with proper service orchestration, health checks, and cross-language microservice communication!