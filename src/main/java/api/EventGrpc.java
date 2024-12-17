package api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: pkg/api/event.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EventGrpc {

  private EventGrpc() {}

  public static final String SERVICE_NAME = "api.Event";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<EventOuterClass.JobSetRequest,
      EventOuterClass.EventStreamMessage> getGetJobSetEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJobSetEvents",
      requestType = EventOuterClass.JobSetRequest.class,
      responseType = EventOuterClass.EventStreamMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<EventOuterClass.JobSetRequest,
      EventOuterClass.EventStreamMessage> getGetJobSetEventsMethod() {
    io.grpc.MethodDescriptor<EventOuterClass.JobSetRequest, EventOuterClass.EventStreamMessage> getGetJobSetEventsMethod;
    if ((getGetJobSetEventsMethod = EventGrpc.getGetJobSetEventsMethod) == null) {
      synchronized (EventGrpc.class) {
        if ((getGetJobSetEventsMethod = EventGrpc.getGetJobSetEventsMethod) == null) {
          EventGrpc.getGetJobSetEventsMethod = getGetJobSetEventsMethod =
              io.grpc.MethodDescriptor.<EventOuterClass.JobSetRequest, EventOuterClass.EventStreamMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJobSetEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EventOuterClass.JobSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EventOuterClass.EventStreamMessage.getDefaultInstance()))
              .setSchemaDescriptor(new EventMethodDescriptorSupplier("GetJobSetEvents"))
              .build();
        }
      }
    }
    return getGetJobSetEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<EventOuterClass.WatchRequest,
      EventOuterClass.EventStreamMessage> getWatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Watch",
      requestType = EventOuterClass.WatchRequest.class,
      responseType = EventOuterClass.EventStreamMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<EventOuterClass.WatchRequest,
      EventOuterClass.EventStreamMessage> getWatchMethod() {
    io.grpc.MethodDescriptor<EventOuterClass.WatchRequest, EventOuterClass.EventStreamMessage> getWatchMethod;
    if ((getWatchMethod = EventGrpc.getWatchMethod) == null) {
      synchronized (EventGrpc.class) {
        if ((getWatchMethod = EventGrpc.getWatchMethod) == null) {
          EventGrpc.getWatchMethod = getWatchMethod =
              io.grpc.MethodDescriptor.<EventOuterClass.WatchRequest, EventOuterClass.EventStreamMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Watch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EventOuterClass.WatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  EventOuterClass.EventStreamMessage.getDefaultInstance()))
              .setSchemaDescriptor(new EventMethodDescriptorSupplier("Watch"))
              .build();
        }
      }
    }
    return getWatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      Health.HealthCheckResponse> getHealthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Health",
      requestType = com.google.protobuf.Empty.class,
      responseType = Health.HealthCheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      Health.HealthCheckResponse> getHealthMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, Health.HealthCheckResponse> getHealthMethod;
    if ((getHealthMethod = EventGrpc.getHealthMethod) == null) {
      synchronized (EventGrpc.class) {
        if ((getHealthMethod = EventGrpc.getHealthMethod) == null) {
          EventGrpc.getHealthMethod = getHealthMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, Health.HealthCheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Health"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Health.HealthCheckResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventMethodDescriptorSupplier("Health"))
              .build();
        }
      }
    }
    return getHealthMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventStub>() {
        @Override
        public EventStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventStub(channel, callOptions);
        }
      };
    return EventStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventBlockingStub>() {
        @Override
        public EventBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventBlockingStub(channel, callOptions);
        }
      };
    return EventBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventFutureStub>() {
        @Override
        public EventFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventFutureStub(channel, callOptions);
        }
      };
    return EventFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getJobSetEvents(EventOuterClass.JobSetRequest request,
        io.grpc.stub.StreamObserver<EventOuterClass.EventStreamMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetJobSetEventsMethod(), responseObserver);
    }

    /**
     */
    @Deprecated
    default void watch(EventOuterClass.WatchRequest request,
        io.grpc.stub.StreamObserver<EventOuterClass.EventStreamMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWatchMethod(), responseObserver);
    }

    /**
     */
    default void health(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<Health.HealthCheckResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHealthMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Event.
   */
  public static abstract class EventImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return EventGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Event.
   */
  public static final class EventStub
      extends io.grpc.stub.AbstractAsyncStub<EventStub> {
    private EventStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected EventStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventStub(channel, callOptions);
    }

    /**
     */
    public void getJobSetEvents(EventOuterClass.JobSetRequest request,
        io.grpc.stub.StreamObserver<EventOuterClass.EventStreamMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetJobSetEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    @Deprecated
    public void watch(EventOuterClass.WatchRequest request,
        io.grpc.stub.StreamObserver<EventOuterClass.EventStreamMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getWatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void health(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<Health.HealthCheckResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHealthMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Event.
   */
  public static final class EventBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EventBlockingStub> {
    private EventBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected EventBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<EventOuterClass.EventStreamMessage> getJobSetEvents(
        EventOuterClass.JobSetRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetJobSetEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    @Deprecated
    public java.util.Iterator<EventOuterClass.EventStreamMessage> watch(
        EventOuterClass.WatchRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getWatchMethod(), getCallOptions(), request);
    }

    /**
     */
    public Health.HealthCheckResponse health(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHealthMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Event.
   */
  public static final class EventFutureStub
      extends io.grpc.stub.AbstractFutureStub<EventFutureStub> {
    private EventFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected EventFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Health.HealthCheckResponse> health(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHealthMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_JOB_SET_EVENTS = 0;
  private static final int METHODID_WATCH = 1;
  private static final int METHODID_HEALTH = 2;

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

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_JOB_SET_EVENTS:
          serviceImpl.getJobSetEvents((EventOuterClass.JobSetRequest) request,
              (io.grpc.stub.StreamObserver<EventOuterClass.EventStreamMessage>) responseObserver);
          break;
        case METHODID_WATCH:
          serviceImpl.watch((EventOuterClass.WatchRequest) request,
              (io.grpc.stub.StreamObserver<EventOuterClass.EventStreamMessage>) responseObserver);
          break;
        case METHODID_HEALTH:
          serviceImpl.health((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<Health.HealthCheckResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
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
          getGetJobSetEventsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              EventOuterClass.JobSetRequest,
              EventOuterClass.EventStreamMessage>(
                service, METHODID_GET_JOB_SET_EVENTS)))
        .addMethod(
          getWatchMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              EventOuterClass.WatchRequest,
              EventOuterClass.EventStreamMessage>(
                service, METHODID_WATCH)))
        .addMethod(
          getHealthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              Health.HealthCheckResponse>(
                service, METHODID_HEALTH)))
        .build();
  }

  private static abstract class EventBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return EventOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Event");
    }
  }

  private static final class EventFileDescriptorSupplier
      extends EventBaseDescriptorSupplier {
    EventFileDescriptorSupplier() {}
  }

  private static final class EventMethodDescriptorSupplier
      extends EventBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EventGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventFileDescriptorSupplier())
              .addMethod(getGetJobSetEventsMethod())
              .addMethod(getWatchMethod())
              .addMethod(getHealthMethod())
              .build();
        }
      }
    }
    return result;
  }
}
