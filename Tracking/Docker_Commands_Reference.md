# Docker Commands Reference & Categorization

## Project Information
- **Student Name**: Benjamin Niccum
- **Student ID**: 1002111609
- **Project**: Distributed Systems Project 1

## Instructions Requirement
**From Q1**: "categorize all the Docker commands that you have tried in the get started guide and briefly explain the purpose of each one of them. For example, docker pull <image_name> : Download a Docker image from a registry to the local system."

---

## Image Management Commands

### Building Images
| Command | Purpose | Example Used |
|---------|---------|--------------|
| `docker build` | Build an image from a Dockerfile | `docker build -t bennythepooh/project.1 .` |
| `docker build .` | Build image without tag (creates dangling image) | `docker build .` |
| `docker tag` | Create a tag TARGET_IMAGE that refers to SOURCE_IMAGE | `docker tag my-new-app BennyThePooh/my-new-app` |

### Image Information  
| Command | Purpose | Example Used |
|---------|---------|--------------|
| `docker images` | List all locally stored images | `docker images` |
| `docker image ls` | List images (same as docker images) | `docker image ls` |
| `docker image rm` | Remove one or more images | `docker image rm getting-started` |

### Registry Operations
| Command | Purpose | Example Used |
|---------|---------|--------------|
| `docker pull` | Download an image from a registry to local system | `docker pull ubuntu:latest` |
| `docker push` | Upload an image to a registry | `docker push bennythepooh/project.1` |
| `docker login` | Authenticate with Docker Hub | `docker login` |

---

## Container Operations Commands

### Running Containers
| Command | Purpose | Example Used |
|---------|---------|--------------|
| `docker run` | Create and start a new container from an image | `docker run -p 3000:3000 bennythepooh/project.1:latest` |
| `docker run -d` | Run container in detached mode (background) | `docker run -d -p 8080:80 docker/welcome-to-docker` |
| `docker run -it` | Run container interactively with terminal | `docker run -it ubuntu /bin/bash` |
| `docker run --name` | Run container with specific name | `docker run --name=app-container -ti node-base` |
| `docker start` | Start one or more stopped containers | `docker start container_name` |
| `docker stop` | Stop one or more running containers | `docker stop container_name` |
| `docker restart` | Restart one or more containers | `docker restart container_name` |

### Container Information
| Command | Purpose | Example Used |
|---------|---------|--------------|
| `docker ps` | List running containers | `docker ps` |
| `docker ps -a` | List all containers (running and stopped) | `docker ps -a` |
| `docker logs` | Fetch the logs of a container | `docker logs container_name` |
| `docker inspect` | Return detailed information about Docker objects | `docker inspect container_name` |

### Container Management
| Command | Purpose | Example Used |
|---------|---------|--------------|
| `docker rm` | Remove one or more containers | `docker rm container_name` |
| `docker exec` | Execute a command in a running container | `docker exec -it container_name /bin/bash` |

---

## Networking Commands

### Network Management
| Command | Purpose | Example Used |
|---------|---------|--------------|
| `docker network create` | Create a user-defined network | `docker network create grpc-network` |
| `docker network ls` | List all networks | `docker network ls` |
| `docker network rm` | Remove one or more networks | `docker network rm network_name` |

---

## Volume and Data Management Commands

### Volume Operations
| Command | Purpose | Example Used |
|---------|---------|--------------|
| `docker volume create` | Create a volume for persistent data storage | `docker volume create todo-db` |
| `docker volume ls` | List all volumes | `docker volume ls` |
| `docker volume rm` | Remove one or more volumes | `docker volume rm volume_name` |

---

## Docker Compose Commands

### Compose Operations
| Command | Purpose | Example Used |
|---------|---------|--------------|
| `docker compose up` | Create and start containers defined in compose file | `docker compose up` |
| `docker compose up -d` | Create and start containers in detached mode | `docker compose up -d` |
| `docker compose down` | Stop and remove containers, networks created by up | `docker compose down` |
| `docker compose ps` | List containers for the compose project | `docker compose ps` |
| `docker compose logs` | View output from containers | `docker compose logs` |

---

## System and Utility Commands

### System Information
| Command | Purpose | Example Used |
|---------|---------|--------------|
| `docker --version` | Display Docker version information | `docker --version` |
| `docker info` | Display system-wide information about Docker | `docker info` |
| `docker system df` | Show Docker disk usage | `docker system df` |
| `docker system prune` | Remove unused Docker objects | `docker system prune` |

---

## Command Options and Flags Reference

### Common Flags
| Flag | Purpose | Used With |
|------|---------|-----------|
| `-d` | Run container in detached mode (background) | `docker run`, `docker compose up` |
| `-p` | Publish container port to host | `docker run -p 3000:3000` |
| `-t` | Allocate a pseudo-TTY | `docker run -t` |
| `-i` | Keep STDIN open | `docker run -i` |
| `--name` | Assign a name to container | `docker run --name my-container` |
| `--rm` | Remove container when it exits | `docker run --rm` |
| `--network` | Connect container to a network | `docker run --network my-net` |

---

## Commands by Tutorial Section

### Introduction Tutorial Commands
- [ ] `docker --version`
- [ ] `docker run hello-world`
- [ ] `docker build --tag getting-started .`
- [ ] `docker run -dp 127.0.0.1:3000:3000 getting-started`
- [ ] `docker ps`
- [ ] `docker stop <container-id>`
- [ ] `docker rm <container-id>`

### Workshop Tutorial Commands  
- [ ] `docker pull ubuntu:18.04`
- [ ] `docker run -it ubuntu:18.04`
- [ ] `docker build -t my-app .`
- [ ] `docker tag my-app YOUR_USER_NAME/my-app`
- [ ] `docker push YOUR_USER_NAME/my-app`
- [ ] `docker volume create todo-db`
- [ ] `docker run -dp 127.0.0.1:3000:3000 --mount type=volume,src=todo-db,target=/etc/todos getting-started`
- [ ] `docker compose up -d`
- [ ] `docker compose down`

---

## Personal Command Log
*Add any additional commands you use during the project*

| Command | Purpose | When Used | Notes |
|---------|---------|-----------|--------|
| | | | |
| | | | |
| | | | |

---

## Summary Statistics
- **Total Unique Commands Used**: ___
- **Most Frequently Used Category**: ___
- **Most Complex Command**: ___
- **Most Useful Command**: ___