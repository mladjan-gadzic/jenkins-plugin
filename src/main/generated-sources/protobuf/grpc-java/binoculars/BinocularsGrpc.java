package binoculars;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: pkg/api/binoculars/binoculars.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BinocularsGrpc {

  private BinocularsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "binoculars.Binoculars";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<binoculars.BinocularsOuterClass.LogRequest,
      binoculars.BinocularsOuterClass.LogResponse> getLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Logs",
      requestType = binoculars.BinocularsOuterClass.LogRequest.class,
      responseType = binoculars.BinocularsOuterClass.LogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<binoculars.BinocularsOuterClass.LogRequest,
      binoculars.BinocularsOuterClass.LogResponse> getLogsMethod() {
    io.grpc.MethodDescriptor<binoculars.BinocularsOuterClass.LogRequest, binoculars.BinocularsOuterClass.LogResponse> getLogsMethod;
    if ((getLogsMethod = BinocularsGrpc.getLogsMethod) == null) {
      synchronized (BinocularsGrpc.class) {
        if ((getLogsMethod = BinocularsGrpc.getLogsMethod) == null) {
          BinocularsGrpc.getLogsMethod = getLogsMethod =
              io.grpc.MethodDescriptor.<binoculars.BinocularsOuterClass.LogRequest, binoculars.BinocularsOuterClass.LogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Logs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  binoculars.BinocularsOuterClass.LogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  binoculars.BinocularsOuterClass.LogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BinocularsMethodDescriptorSupplier("Logs"))
              .build();
        }
      }
    }
    return getLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<binoculars.BinocularsOuterClass.CordonRequest,
      com.google.protobuf.Empty> getCordonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cordon",
      requestType = binoculars.BinocularsOuterClass.CordonRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<binoculars.BinocularsOuterClass.CordonRequest,
      com.google.protobuf.Empty> getCordonMethod() {
    io.grpc.MethodDescriptor<binoculars.BinocularsOuterClass.CordonRequest, com.google.protobuf.Empty> getCordonMethod;
    if ((getCordonMethod = BinocularsGrpc.getCordonMethod) == null) {
      synchronized (BinocularsGrpc.class) {
        if ((getCordonMethod = BinocularsGrpc.getCordonMethod) == null) {
          BinocularsGrpc.getCordonMethod = getCordonMethod =
              io.grpc.MethodDescriptor.<binoculars.BinocularsOuterClass.CordonRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cordon"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  binoculars.BinocularsOuterClass.CordonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new BinocularsMethodDescriptorSupplier("Cordon"))
              .build();
        }
      }
    }
    return getCordonMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BinocularsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BinocularsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BinocularsStub>() {
        @java.lang.Override
        public BinocularsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BinocularsStub(channel, callOptions);
        }
      };
    return BinocularsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BinocularsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BinocularsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BinocularsBlockingStub>() {
        @java.lang.Override
        public BinocularsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BinocularsBlockingStub(channel, callOptions);
        }
      };
    return BinocularsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BinocularsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BinocularsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BinocularsFutureStub>() {
        @java.lang.Override
        public BinocularsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BinocularsFutureStub(channel, callOptions);
        }
      };
    return BinocularsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void logs(binoculars.BinocularsOuterClass.LogRequest request,
        io.grpc.stub.StreamObserver<binoculars.BinocularsOuterClass.LogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogsMethod(), responseObserver);
    }

    /**
     */
    default void cordon(binoculars.BinocularsOuterClass.CordonRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCordonMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Binoculars.
   */
  public static abstract class BinocularsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BinocularsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Binoculars.
   */
  public static final class BinocularsStub
      extends io.grpc.stub.AbstractAsyncStub<BinocularsStub> {
    private BinocularsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BinocularsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BinocularsStub(channel, callOptions);
    }

    /**
     */
    public void logs(binoculars.BinocularsOuterClass.LogRequest request,
        io.grpc.stub.StreamObserver<binoculars.BinocularsOuterClass.LogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cordon(binoculars.BinocularsOuterClass.CordonRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCordonMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Binoculars.
   */
  public static final class BinocularsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BinocularsBlockingStub> {
    private BinocularsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BinocularsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BinocularsBlockingStub(channel, callOptions);
    }

    /**
     */
    public binoculars.BinocularsOuterClass.LogResponse logs(binoculars.BinocularsOuterClass.LogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty cordon(binoculars.BinocularsOuterClass.CordonRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCordonMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Binoculars.
   */
  public static final class BinocularsFutureStub
      extends io.grpc.stub.AbstractFutureStub<BinocularsFutureStub> {
    private BinocularsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BinocularsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BinocularsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<binoculars.BinocularsOuterClass.LogResponse> logs(
        binoculars.BinocularsOuterClass.LogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> cordon(
        binoculars.BinocularsOuterClass.CordonRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCordonMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGS = 0;
  private static final int METHODID_CORDON = 1;

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
        case METHODID_LOGS:
          serviceImpl.logs((binoculars.BinocularsOuterClass.LogRequest) request,
              (io.grpc.stub.StreamObserver<binoculars.BinocularsOuterClass.LogResponse>) responseObserver);
          break;
        case METHODID_CORDON:
          serviceImpl.cordon((binoculars.BinocularsOuterClass.CordonRequest) request,
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
          getLogsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              binoculars.BinocularsOuterClass.LogRequest,
              binoculars.BinocularsOuterClass.LogResponse>(
                service, METHODID_LOGS)))
        .addMethod(
          getCordonMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              binoculars.BinocularsOuterClass.CordonRequest,
              com.google.protobuf.Empty>(
                service, METHODID_CORDON)))
        .build();
  }

  private static abstract class BinocularsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BinocularsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return binoculars.BinocularsOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Binoculars");
    }
  }

  private static final class BinocularsFileDescriptorSupplier
      extends BinocularsBaseDescriptorSupplier {
    BinocularsFileDescriptorSupplier() {}
  }

  private static final class BinocularsMethodDescriptorSupplier
      extends BinocularsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BinocularsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BinocularsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BinocularsFileDescriptorSupplier())
              .addMethod(getLogsMethod())
              .addMethod(getCordonMethod())
              .build();
        }
      }
    }
    return result;
  }
}
