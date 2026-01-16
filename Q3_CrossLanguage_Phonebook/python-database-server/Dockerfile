# Python Database Server Dockerfile
FROM python:3.13-slim

# Set working directory
WORKDIR /app

# Copy requirements first for better caching
COPY requirements.txt .

# Install Python dependencies
RUN pip install --no-cache-dir -r requirements.txt

# Copy protobuf files and generated classes
COPY phonebook_pb2.py phonebook_pb2_grpc.py ./

# Copy server application
COPY phonebook_server.py .

# Expose gRPC port
EXPOSE 50051

# Health check
HEALTHCHECK --interval=30s --timeout=5s --start-period=10s --retries=3 \
    CMD python -c "import grpc; import phonebook_pb2_grpc; import phonebook_pb2; \
    channel = grpc.insecure_channel('localhost:50051'); \
    stub = phonebook_pb2_grpc.PhonebookServiceStub(channel); \
    stub.listContacts(phonebook_pb2.Empty()).count >= 0" || exit 1

# Run the server
CMD ["python", "phonebook_server.py"]