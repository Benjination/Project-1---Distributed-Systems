package com.distributed.phonebook;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The Phonebook service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: phonebook.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PhonebookServiceGrpc {

  private PhonebookServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "phonebook.PhonebookService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.distributed.phonebook.ContactRequest,
      com.distributed.phonebook.ContactResponse> getAddContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddContact",
      requestType = com.distributed.phonebook.ContactRequest.class,
      responseType = com.distributed.phonebook.ContactResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.distributed.phonebook.ContactRequest,
      com.distributed.phonebook.ContactResponse> getAddContactMethod() {
    io.grpc.MethodDescriptor<com.distributed.phonebook.ContactRequest, com.distributed.phonebook.ContactResponse> getAddContactMethod;
    if ((getAddContactMethod = PhonebookServiceGrpc.getAddContactMethod) == null) {
      synchronized (PhonebookServiceGrpc.class) {
        if ((getAddContactMethod = PhonebookServiceGrpc.getAddContactMethod) == null) {
          PhonebookServiceGrpc.getAddContactMethod = getAddContactMethod =
              io.grpc.MethodDescriptor.<com.distributed.phonebook.ContactRequest, com.distributed.phonebook.ContactResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distributed.phonebook.ContactRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distributed.phonebook.ContactResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PhonebookServiceMethodDescriptorSupplier("AddContact"))
              .build();
        }
      }
    }
    return getAddContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.distributed.phonebook.ContactRequest,
      com.distributed.phonebook.ContactResponse> getGetContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContact",
      requestType = com.distributed.phonebook.ContactRequest.class,
      responseType = com.distributed.phonebook.ContactResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.distributed.phonebook.ContactRequest,
      com.distributed.phonebook.ContactResponse> getGetContactMethod() {
    io.grpc.MethodDescriptor<com.distributed.phonebook.ContactRequest, com.distributed.phonebook.ContactResponse> getGetContactMethod;
    if ((getGetContactMethod = PhonebookServiceGrpc.getGetContactMethod) == null) {
      synchronized (PhonebookServiceGrpc.class) {
        if ((getGetContactMethod = PhonebookServiceGrpc.getGetContactMethod) == null) {
          PhonebookServiceGrpc.getGetContactMethod = getGetContactMethod =
              io.grpc.MethodDescriptor.<com.distributed.phonebook.ContactRequest, com.distributed.phonebook.ContactResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distributed.phonebook.ContactRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distributed.phonebook.ContactResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PhonebookServiceMethodDescriptorSupplier("GetContact"))
              .build();
        }
      }
    }
    return getGetContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.distributed.phonebook.ContactRequest,
      com.distributed.phonebook.ContactResponse> getUpdateContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateContact",
      requestType = com.distributed.phonebook.ContactRequest.class,
      responseType = com.distributed.phonebook.ContactResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.distributed.phonebook.ContactRequest,
      com.distributed.phonebook.ContactResponse> getUpdateContactMethod() {
    io.grpc.MethodDescriptor<com.distributed.phonebook.ContactRequest, com.distributed.phonebook.ContactResponse> getUpdateContactMethod;
    if ((getUpdateContactMethod = PhonebookServiceGrpc.getUpdateContactMethod) == null) {
      synchronized (PhonebookServiceGrpc.class) {
        if ((getUpdateContactMethod = PhonebookServiceGrpc.getUpdateContactMethod) == null) {
          PhonebookServiceGrpc.getUpdateContactMethod = getUpdateContactMethod =
              io.grpc.MethodDescriptor.<com.distributed.phonebook.ContactRequest, com.distributed.phonebook.ContactResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distributed.phonebook.ContactRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distributed.phonebook.ContactResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PhonebookServiceMethodDescriptorSupplier("UpdateContact"))
              .build();
        }
      }
    }
    return getUpdateContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.distributed.phonebook.ContactRequest,
      com.distributed.phonebook.ContactResponse> getDeleteContactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteContact",
      requestType = com.distributed.phonebook.ContactRequest.class,
      responseType = com.distributed.phonebook.ContactResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.distributed.phonebook.ContactRequest,
      com.distributed.phonebook.ContactResponse> getDeleteContactMethod() {
    io.grpc.MethodDescriptor<com.distributed.phonebook.ContactRequest, com.distributed.phonebook.ContactResponse> getDeleteContactMethod;
    if ((getDeleteContactMethod = PhonebookServiceGrpc.getDeleteContactMethod) == null) {
      synchronized (PhonebookServiceGrpc.class) {
        if ((getDeleteContactMethod = PhonebookServiceGrpc.getDeleteContactMethod) == null) {
          PhonebookServiceGrpc.getDeleteContactMethod = getDeleteContactMethod =
              io.grpc.MethodDescriptor.<com.distributed.phonebook.ContactRequest, com.distributed.phonebook.ContactResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distributed.phonebook.ContactRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distributed.phonebook.ContactResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PhonebookServiceMethodDescriptorSupplier("DeleteContact"))
              .build();
        }
      }
    }
    return getDeleteContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.distributed.phonebook.Empty,
      com.distributed.phonebook.ContactList> getListContactsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListContacts",
      requestType = com.distributed.phonebook.Empty.class,
      responseType = com.distributed.phonebook.ContactList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.distributed.phonebook.Empty,
      com.distributed.phonebook.ContactList> getListContactsMethod() {
    io.grpc.MethodDescriptor<com.distributed.phonebook.Empty, com.distributed.phonebook.ContactList> getListContactsMethod;
    if ((getListContactsMethod = PhonebookServiceGrpc.getListContactsMethod) == null) {
      synchronized (PhonebookServiceGrpc.class) {
        if ((getListContactsMethod = PhonebookServiceGrpc.getListContactsMethod) == null) {
          PhonebookServiceGrpc.getListContactsMethod = getListContactsMethod =
              io.grpc.MethodDescriptor.<com.distributed.phonebook.Empty, com.distributed.phonebook.ContactList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListContacts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distributed.phonebook.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distributed.phonebook.ContactList.getDefaultInstance()))
              .setSchemaDescriptor(new PhonebookServiceMethodDescriptorSupplier("ListContacts"))
              .build();
        }
      }
    }
    return getListContactsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PhonebookServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PhonebookServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PhonebookServiceStub>() {
        @java.lang.Override
        public PhonebookServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PhonebookServiceStub(channel, callOptions);
        }
      };
    return PhonebookServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PhonebookServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PhonebookServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PhonebookServiceBlockingStub>() {
        @java.lang.Override
        public PhonebookServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PhonebookServiceBlockingStub(channel, callOptions);
        }
      };
    return PhonebookServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PhonebookServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PhonebookServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PhonebookServiceFutureStub>() {
        @java.lang.Override
        public PhonebookServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PhonebookServiceFutureStub(channel, callOptions);
        }
      };
    return PhonebookServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The Phonebook service definition
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Add a new contact to the phonebook
     * </pre>
     */
    default void addContact(com.distributed.phonebook.ContactRequest request,
        io.grpc.stub.StreamObserver<com.distributed.phonebook.ContactResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddContactMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a contact by phone number
     * </pre>
     */
    default void getContact(com.distributed.phonebook.ContactRequest request,
        io.grpc.stub.StreamObserver<com.distributed.phonebook.ContactResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetContactMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an existing contact
     * </pre>
     */
    default void updateContact(com.distributed.phonebook.ContactRequest request,
        io.grpc.stub.StreamObserver<com.distributed.phonebook.ContactResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateContactMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a contact by phone number
     * </pre>
     */
    default void deleteContact(com.distributed.phonebook.ContactRequest request,
        io.grpc.stub.StreamObserver<com.distributed.phonebook.ContactResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteContactMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all contacts in the phonebook
     * </pre>
     */
    default void listContacts(com.distributed.phonebook.Empty request,
        io.grpc.stub.StreamObserver<com.distributed.phonebook.ContactList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListContactsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PhonebookService.
   * <pre>
   * The Phonebook service definition
   * </pre>
   */
  public static abstract class PhonebookServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PhonebookServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PhonebookService.
   * <pre>
   * The Phonebook service definition
   * </pre>
   */
  public static final class PhonebookServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PhonebookServiceStub> {
    private PhonebookServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PhonebookServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PhonebookServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Add a new contact to the phonebook
     * </pre>
     */
    public void addContact(com.distributed.phonebook.ContactRequest request,
        io.grpc.stub.StreamObserver<com.distributed.phonebook.ContactResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a contact by phone number
     * </pre>
     */
    public void getContact(com.distributed.phonebook.ContactRequest request,
        io.grpc.stub.StreamObserver<com.distributed.phonebook.ContactResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an existing contact
     * </pre>
     */
    public void updateContact(com.distributed.phonebook.ContactRequest request,
        io.grpc.stub.StreamObserver<com.distributed.phonebook.ContactResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a contact by phone number
     * </pre>
     */
    public void deleteContact(com.distributed.phonebook.ContactRequest request,
        io.grpc.stub.StreamObserver<com.distributed.phonebook.ContactResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all contacts in the phonebook
     * </pre>
     */
    public void listContacts(com.distributed.phonebook.Empty request,
        io.grpc.stub.StreamObserver<com.distributed.phonebook.ContactList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListContactsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PhonebookService.
   * <pre>
   * The Phonebook service definition
   * </pre>
   */
  public static final class PhonebookServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PhonebookServiceBlockingStub> {
    private PhonebookServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PhonebookServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PhonebookServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Add a new contact to the phonebook
     * </pre>
     */
    public com.distributed.phonebook.ContactResponse addContact(com.distributed.phonebook.ContactRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddContactMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a contact by phone number
     * </pre>
     */
    public com.distributed.phonebook.ContactResponse getContact(com.distributed.phonebook.ContactRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetContactMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing contact
     * </pre>
     */
    public com.distributed.phonebook.ContactResponse updateContact(com.distributed.phonebook.ContactRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateContactMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a contact by phone number
     * </pre>
     */
    public com.distributed.phonebook.ContactResponse deleteContact(com.distributed.phonebook.ContactRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteContactMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all contacts in the phonebook
     * </pre>
     */
    public com.distributed.phonebook.ContactList listContacts(com.distributed.phonebook.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListContactsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PhonebookService.
   * <pre>
   * The Phonebook service definition
   * </pre>
   */
  public static final class PhonebookServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PhonebookServiceFutureStub> {
    private PhonebookServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PhonebookServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PhonebookServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Add a new contact to the phonebook
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.distributed.phonebook.ContactResponse> addContact(
        com.distributed.phonebook.ContactRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddContactMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a contact by phone number
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.distributed.phonebook.ContactResponse> getContact(
        com.distributed.phonebook.ContactRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetContactMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an existing contact
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.distributed.phonebook.ContactResponse> updateContact(
        com.distributed.phonebook.ContactRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateContactMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a contact by phone number
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.distributed.phonebook.ContactResponse> deleteContact(
        com.distributed.phonebook.ContactRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteContactMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all contacts in the phonebook
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.distributed.phonebook.ContactList> listContacts(
        com.distributed.phonebook.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListContactsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_CONTACT = 0;
  private static final int METHODID_GET_CONTACT = 1;
  private static final int METHODID_UPDATE_CONTACT = 2;
  private static final int METHODID_DELETE_CONTACT = 3;
  private static final int METHODID_LIST_CONTACTS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_CONTACT:
          serviceImpl.addContact((com.distributed.phonebook.ContactRequest) request,
              (io.grpc.stub.StreamObserver<com.distributed.phonebook.ContactResponse>) responseObserver);
          break;
        case METHODID_GET_CONTACT:
          serviceImpl.getContact((com.distributed.phonebook.ContactRequest) request,
              (io.grpc.stub.StreamObserver<com.distributed.phonebook.ContactResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CONTACT:
          serviceImpl.updateContact((com.distributed.phonebook.ContactRequest) request,
              (io.grpc.stub.StreamObserver<com.distributed.phonebook.ContactResponse>) responseObserver);
          break;
        case METHODID_DELETE_CONTACT:
          serviceImpl.deleteContact((com.distributed.phonebook.ContactRequest) request,
              (io.grpc.stub.StreamObserver<com.distributed.phonebook.ContactResponse>) responseObserver);
          break;
        case METHODID_LIST_CONTACTS:
          serviceImpl.listContacts((com.distributed.phonebook.Empty) request,
              (io.grpc.stub.StreamObserver<com.distributed.phonebook.ContactList>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAddContactMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.distributed.phonebook.ContactRequest,
              com.distributed.phonebook.ContactResponse>(
                service, METHODID_ADD_CONTACT)))
        .addMethod(
          getGetContactMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.distributed.phonebook.ContactRequest,
              com.distributed.phonebook.ContactResponse>(
                service, METHODID_GET_CONTACT)))
        .addMethod(
          getUpdateContactMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.distributed.phonebook.ContactRequest,
              com.distributed.phonebook.ContactResponse>(
                service, METHODID_UPDATE_CONTACT)))
        .addMethod(
          getDeleteContactMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.distributed.phonebook.ContactRequest,
              com.distributed.phonebook.ContactResponse>(
                service, METHODID_DELETE_CONTACT)))
        .addMethod(
          getListContactsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.distributed.phonebook.Empty,
              com.distributed.phonebook.ContactList>(
                service, METHODID_LIST_CONTACTS)))
        .build();
  }

  private static abstract class PhonebookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PhonebookServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.distributed.phonebook.PhonebookProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PhonebookService");
    }
  }

  private static final class PhonebookServiceFileDescriptorSupplier
      extends PhonebookServiceBaseDescriptorSupplier {
    PhonebookServiceFileDescriptorSupplier() {}
  }

  private static final class PhonebookServiceMethodDescriptorSupplier
      extends PhonebookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PhonebookServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PhonebookServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PhonebookServiceFileDescriptorSupplier())
              .addMethod(getAddContactMethod())
              .addMethod(getGetContactMethod())
              .addMethod(getUpdateContactMethod())
              .addMethod(getDeleteContactMethod())
              .addMethod(getListContactsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
