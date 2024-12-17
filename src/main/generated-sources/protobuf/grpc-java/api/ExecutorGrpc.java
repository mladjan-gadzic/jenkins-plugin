package api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: pkg/api/executor.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ExecutorGrpc {

  private ExecutorGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.Executor";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.ExecutorOuterClass.ExecutorSettingsUpsertRequest,
      com.google.protobuf.Empty> getUpsertExecutorSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertExecutorSettings",
      requestType = api.ExecutorOuterClass.ExecutorSettingsUpsertRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.ExecutorOuterClass.ExecutorSettingsUpsertRequest,
      com.google.protobuf.Empty> getUpsertExecutorSettingsMethod() {
    io.grpc.MethodDescriptor<api.ExecutorOuterClass.ExecutorSettingsUpsertRequest, com.google.protobuf.Empty> getUpsertExecutorSettingsMethod;
    if ((getUpsertExecutorSettingsMethod = ExecutorGrpc.getUpsertExecutorSettingsMethod) == null) {
      synchronized (ExecutorGrpc.class) {
        if ((getUpsertExecutorSettingsMethod = ExecutorGrpc.getUpsertExecutorSettingsMethod) == null) {
          ExecutorGrpc.getUpsertExecutorSettingsMethod = getUpsertExecutorSettingsMethod =
              io.grpc.MethodDescriptor.<api.ExecutorOuterClass.ExecutorSettingsUpsertRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertExecutorSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.ExecutorOuterClass.ExecutorSettingsUpsertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ExecutorMethodDescriptorSupplier("UpsertExecutorSettings"))
              .build();
        }
      }
    }
    return getUpsertExecutorSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.ExecutorOuterClass.ExecutorSettingsDeleteRequest,
      com.google.protobuf.Empty> getDeleteExecutorSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteExecutorSettings",
      requestType = api.ExecutorOuterClass.ExecutorSettingsDeleteRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.ExecutorOuterClass.ExecutorSettingsDeleteRequest,
      com.google.protobuf.Empty> getDeleteExecutorSettingsMethod() {
    io.grpc.MethodDescriptor<api.ExecutorOuterClass.ExecutorSettingsDeleteRequest, com.google.protobuf.Empty> getDeleteExecutorSettingsMethod;
    if ((getDeleteExecutorSettingsMethod = ExecutorGrpc.getDeleteExecutorSettingsMethod) == null) {
      synchronized (ExecutorGrpc.class) {
        if ((getDeleteExecutorSettingsMethod = ExecutorGrpc.getDeleteExecutorSettingsMethod) == null) {
          ExecutorGrpc.getDeleteExecutorSettingsMethod = getDeleteExecutorSettingsMethod =
              io.grpc.MethodDescriptor.<api.ExecutorOuterClass.ExecutorSettingsDeleteRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteExecutorSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.ExecutorOuterClass.ExecutorSettingsDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ExecutorMethodDescriptorSupplier("DeleteExecutorSettings"))
              .build();
        }
      }
    }
    return getDeleteExecutorSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.ExecutorOuterClass.ExecutorPreemptRequest,
      com.google.protobuf.Empty> getPreemptOnExecutorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PreemptOnExecutor",
      requestType = api.ExecutorOuterClass.ExecutorPreemptRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.ExecutorOuterClass.ExecutorPreemptRequest,
      com.google.protobuf.Empty> getPreemptOnExecutorMethod() {
    io.grpc.MethodDescriptor<api.ExecutorOuterClass.ExecutorPreemptRequest, com.google.protobuf.Empty> getPreemptOnExecutorMethod;
    if ((getPreemptOnExecutorMethod = ExecutorGrpc.getPreemptOnExecutorMethod) == null) {
      synchronized (ExecutorGrpc.class) {
        if ((getPreemptOnExecutorMethod = ExecutorGrpc.getPreemptOnExecutorMethod) == null) {
          ExecutorGrpc.getPreemptOnExecutorMethod = getPreemptOnExecutorMethod =
              io.grpc.MethodDescriptor.<api.ExecutorOuterClass.ExecutorPreemptRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PreemptOnExecutor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.ExecutorOuterClass.ExecutorPreemptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ExecutorMethodDescriptorSupplier("PreemptOnExecutor"))
              .build();
        }
      }
    }
    return getPreemptOnExecutorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.ExecutorOuterClass.ExecutorCancelRequest,
      com.google.protobuf.Empty> getCancelOnExecutorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelOnExecutor",
      requestType = api.ExecutorOuterClass.ExecutorCancelRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.ExecutorOuterClass.ExecutorCancelRequest,
      com.google.protobuf.Empty> getCancelOnExecutorMethod() {
    io.grpc.MethodDescriptor<api.ExecutorOuterClass.ExecutorCancelRequest, com.google.protobuf.Empty> getCancelOnExecutorMethod;
    if ((getCancelOnExecutorMethod = ExecutorGrpc.getCancelOnExecutorMethod) == null) {
      synchronized (ExecutorGrpc.class) {
        if ((getCancelOnExecutorMethod = ExecutorGrpc.getCancelOnExecutorMethod) == null) {
          ExecutorGrpc.getCancelOnExecutorMethod = getCancelOnExecutorMethod =
              io.grpc.MethodDescriptor.<api.ExecutorOuterClass.ExecutorCancelRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelOnExecutor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.ExecutorOuterClass.ExecutorCancelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ExecutorMethodDescriptorSupplier("CancelOnExecutor"))
              .build();
        }
      }
    }
    return getCancelOnExecutorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExecutorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExecutorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExecutorStub>() {
        @java.lang.Override
        public ExecutorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExecutorStub(channel, callOptions);
        }
      };
    return ExecutorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExecutorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExecutorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExecutorBlockingStub>() {
        @java.lang.Override
        public ExecutorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExecutorBlockingStub(channel, callOptions);
        }
      };
    return ExecutorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExecutorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExecutorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExecutorFutureStub>() {
        @java.lang.Override
        public ExecutorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExecutorFutureStub(channel, callOptions);
        }
      };
    return ExecutorFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void upsertExecutorSettings(api.ExecutorOuterClass.ExecutorSettingsUpsertRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertExecutorSettingsMethod(), responseObserver);
    }

    /**
     */
    default void deleteExecutorSettings(api.ExecutorOuterClass.ExecutorSettingsDeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteExecutorSettingsMethod(), responseObserver);
    }

    /**
     */
    default void preemptOnExecutor(api.ExecutorOuterClass.ExecutorPreemptRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPreemptOnExecutorMethod(), responseObserver);
    }

    /**
     */
    default void cancelOnExecutor(api.ExecutorOuterClass.ExecutorCancelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelOnExecutorMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Executor.
   */
  public static abstract class ExecutorImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ExecutorGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Executor.
   */
  public static final class ExecutorStub
      extends io.grpc.stub.AbstractAsyncStub<ExecutorStub> {
    private ExecutorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExecutorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExecutorStub(channel, callOptions);
    }

    /**
     */
    public void upsertExecutorSettings(api.ExecutorOuterClass.ExecutorSettingsUpsertRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertExecutorSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteExecutorSettings(api.ExecutorOuterClass.ExecutorSettingsDeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteExecutorSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void preemptOnExecutor(api.ExecutorOuterClass.ExecutorPreemptRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPreemptOnExecutorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelOnExecutor(api.ExecutorOuterClass.ExecutorCancelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelOnExecutorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Executor.
   */
  public static final class ExecutorBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ExecutorBlockingStub> {
    private ExecutorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExecutorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExecutorBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty upsertExecutorSettings(api.ExecutorOuterClass.ExecutorSettingsUpsertRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertExecutorSettingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteExecutorSettings(api.ExecutorOuterClass.ExecutorSettingsDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteExecutorSettingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty preemptOnExecutor(api.ExecutorOuterClass.ExecutorPreemptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPreemptOnExecutorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty cancelOnExecutor(api.ExecutorOuterClass.ExecutorCancelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelOnExecutorMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Executor.
   */
  public static final class ExecutorFutureStub
      extends io.grpc.stub.AbstractFutureStub<ExecutorFutureStub> {
    private ExecutorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExecutorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExecutorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> upsertExecutorSettings(
        api.ExecutorOuterClass.ExecutorSettingsUpsertRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertExecutorSettingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteExecutorSettings(
        api.ExecutorOuterClass.ExecutorSettingsDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteExecutorSettingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> preemptOnExecutor(
        api.ExecutorOuterClass.ExecutorPreemptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPreemptOnExecutorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> cancelOnExecutor(
        api.ExecutorOuterClass.ExecutorCancelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelOnExecutorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPSERT_EXECUTOR_SETTINGS = 0;
  private static final int METHODID_DELETE_EXECUTOR_SETTINGS = 1;
  private static final int METHODID_PREEMPT_ON_EXECUTOR = 2;
  private static final int METHODID_CANCEL_ON_EXECUTOR = 3;

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
        case METHODID_UPSERT_EXECUTOR_SETTINGS:
          serviceImpl.upsertExecutorSettings((api.ExecutorOuterClass.ExecutorSettingsUpsertRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_EXECUTOR_SETTINGS:
          serviceImpl.deleteExecutorSettings((api.ExecutorOuterClass.ExecutorSettingsDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_PREEMPT_ON_EXECUTOR:
          serviceImpl.preemptOnExecutor((api.ExecutorOuterClass.ExecutorPreemptRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CANCEL_ON_EXECUTOR:
          serviceImpl.cancelOnExecutor((api.ExecutorOuterClass.ExecutorCancelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
          getUpsertExecutorSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.ExecutorOuterClass.ExecutorSettingsUpsertRequest,
              com.google.protobuf.Empty>(
                service, METHODID_UPSERT_EXECUTOR_SETTINGS)))
        .addMethod(
          getDeleteExecutorSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.ExecutorOuterClass.ExecutorSettingsDeleteRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_EXECUTOR_SETTINGS)))
        .addMethod(
          getPreemptOnExecutorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.ExecutorOuterClass.ExecutorPreemptRequest,
              com.google.protobuf.Empty>(
                service, METHODID_PREEMPT_ON_EXECUTOR)))
        .addMethod(
          getCancelOnExecutorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.ExecutorOuterClass.ExecutorCancelRequest,
              com.google.protobuf.Empty>(
                service, METHODID_CANCEL_ON_EXECUTOR)))
        .build();
  }

  private static abstract class ExecutorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExecutorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return api.ExecutorOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Executor");
    }
  }

  private static final class ExecutorFileDescriptorSupplier
      extends ExecutorBaseDescriptorSupplier {
    ExecutorFileDescriptorSupplier() {}
  }

  private static final class ExecutorMethodDescriptorSupplier
      extends ExecutorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ExecutorMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ExecutorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExecutorFileDescriptorSupplier())
              .addMethod(getUpsertExecutorSettingsMethod())
              .addMethod(getDeleteExecutorSettingsMethod())
              .addMethod(getPreemptOnExecutorMethod())
              .addMethod(getCancelOnExecutorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
