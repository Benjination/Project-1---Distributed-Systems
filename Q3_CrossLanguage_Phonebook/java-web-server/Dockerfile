# Java Web Server Dockerfile
FROM eclipse-temurin:17-jdk

# Install necessary packages
RUN apt-get update && apt-get install -y curl && rm -rf /var/lib/apt/lists/*

# Set working directory
WORKDIR /app

# Copy Gradle wrapper and build files
COPY gradlew gradlew.bat ./
COPY gradle/ gradle/
COPY build.gradle settings.gradle ./

# Copy source code (including proto files)
COPY src/ src/

# Make gradlew executable
RUN chmod +x gradlew

# Build the application
RUN ./gradlew build --no-daemon

# Expose web port
EXPOSE 8080

# Health check
HEALTHCHECK --interval=30s --timeout=10s --start-period=30s --retries=3 \
    CMD curl -f http://localhost:8080/ || exit 1

# Run the application
CMD ["./gradlew", "bootRun", "--no-daemon"]