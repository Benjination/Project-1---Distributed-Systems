# Python CLI Client Dockerfile
FROM python:3.13-slim

# Set working directory
WORKDIR /app

# Copy requirements first for better caching
COPY requirements.txt .

# Install Python dependencies
RUN pip install --no-cache-dir -r requirements.txt

# Copy protobuf files and generated classes
COPY phonebook_pb2.py phonebook_pb2_grpc.py ./

# Copy client application
COPY phonebook_client.py .

# Run the client (this will be overridden by docker-compose or manual docker run)
CMD ["python", "phonebook_client.py"]