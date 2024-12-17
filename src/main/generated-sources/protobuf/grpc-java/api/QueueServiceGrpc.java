package api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: pkg/api/submit.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class QueueServiceGrpc {

  private QueueServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.QueueService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.SubmitOuterClass.Queue,
      com.google.protobuf.Empty> getCreateQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateQueue",
      requestType = api.SubmitOuterClass.Queue.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.SubmitOuterClass.Queue,
      com.google.protobuf.Empty> getCreateQueueMethod() {
    io.grpc.MethodDescriptor<api.SubmitOuterClass.Queue, com.google.protobuf.Empty> getCreateQueueMethod;
    if ((getCreateQueueMethod = QueueServiceGrpc.getCreateQueueMethod) == null) {
      synchronized (QueueServiceGrpc.class) {
        if ((getCreateQueueMethod = QueueServiceGrpc.getCreateQueueMethod) == null) {
          QueueServiceGrpc.getCreateQueueMethod = getCreateQueueMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.Queue, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.Queue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new QueueServiceMethodDescriptorSupplier("CreateQueue"))
              .build();
        }
      }
    }
    return getCreateQueueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.SubmitOuterClass.QueueList,
      api.SubmitOuterClass.BatchQueueCreateResponse> getCreateQueuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateQueues",
      requestType = api.SubmitOuterClass.QueueList.class,
      responseType = api.SubmitOuterClass.BatchQueueCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.SubmitOuterClass.QueueList,
      api.SubmitOuterClass.BatchQueueCreateResponse> getCreateQueuesMethod() {
    io.grpc.MethodDescriptor<api.SubmitOuterClass.QueueList, api.SubmitOuterClass.BatchQueueCreateResponse> getCreateQueuesMethod;
    if ((getCreateQueuesMethod = QueueServiceGrpc.getCreateQueuesMethod) == null) {
      synchronized (QueueServiceGrpc.class) {
        if ((getCreateQueuesMethod = QueueServiceGrpc.getCreateQueuesMethod) == null) {
          QueueServiceGrpc.getCreateQueuesMethod = getCreateQueuesMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.QueueList, api.SubmitOuterClass.BatchQueueCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateQueues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.QueueList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.BatchQueueCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueueServiceMethodDescriptorSupplier("CreateQueues"))
              .build();
        }
      }
    }
    return getCreateQueuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.SubmitOuterClass.Queue,
      com.google.protobuf.Empty> getUpdateQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateQueue",
      requestType = api.SubmitOuterClass.Queue.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.SubmitOuterClass.Queue,
      com.google.protobuf.Empty> getUpdateQueueMethod() {
    io.grpc.MethodDescriptor<api.SubmitOuterClass.Queue, com.google.protobuf.Empty> getUpdateQueueMethod;
    if ((getUpdateQueueMethod = QueueServiceGrpc.getUpdateQueueMethod) == null) {
      synchronized (QueueServiceGrpc.class) {
        if ((getUpdateQueueMethod = QueueServiceGrpc.getUpdateQueueMethod) == null) {
          QueueServiceGrpc.getUpdateQueueMethod = getUpdateQueueMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.Queue, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.Queue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new QueueServiceMethodDescriptorSupplier("UpdateQueue"))
              .build();
        }
      }
    }
    return getUpdateQueueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.SubmitOuterClass.QueueList,
      api.SubmitOuterClass.BatchQueueUpdateResponse> getUpdateQueuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateQueues",
      requestType = api.SubmitOuterClass.QueueList.class,
      responseType = api.SubmitOuterClass.BatchQueueUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.SubmitOuterClass.QueueList,
      api.SubmitOuterClass.BatchQueueUpdateResponse> getUpdateQueuesMethod() {
    io.grpc.MethodDescriptor<api.SubmitOuterClass.QueueList, api.SubmitOuterClass.BatchQueueUpdateResponse> getUpdateQueuesMethod;
    if ((getUpdateQueuesMethod = QueueServiceGrpc.getUpdateQueuesMethod) == null) {
      synchronized (QueueServiceGrpc.class) {
        if ((getUpdateQueuesMethod = QueueServiceGrpc.getUpdateQueuesMethod) == null) {
          QueueServiceGrpc.getUpdateQueuesMethod = getUpdateQueuesMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.QueueList, api.SubmitOuterClass.BatchQueueUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateQueues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.QueueList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.BatchQueueUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueueServiceMethodDescriptorSupplier("UpdateQueues"))
              .build();
        }
      }
    }
    return getUpdateQueuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.SubmitOuterClass.QueueDeleteRequest,
      com.google.protobuf.Empty> getDeleteQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteQueue",
      requestType = api.SubmitOuterClass.QueueDeleteRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.SubmitOuterClass.QueueDeleteRequest,
      com.google.protobuf.Empty> getDeleteQueueMethod() {
    io.grpc.MethodDescriptor<api.SubmitOuterClass.QueueDeleteRequest, com.google.protobuf.Empty> getDeleteQueueMethod;
    if ((getDeleteQueueMethod = QueueServiceGrpc.getDeleteQueueMethod) == null) {
      synchronized (QueueServiceGrpc.class) {
        if ((getDeleteQueueMethod = QueueServiceGrpc.getDeleteQueueMethod) == null) {
          QueueServiceGrpc.getDeleteQueueMethod = getDeleteQueueMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.QueueDeleteRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.QueueDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new QueueServiceMethodDescriptorSupplier("DeleteQueue"))
              .build();
        }
      }
    }
    return getDeleteQueueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.SubmitOuterClass.QueueGetRequest,
      api.SubmitOuterClass.Queue> getGetQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueue",
      requestType = api.SubmitOuterClass.QueueGetRequest.class,
      responseType = api.SubmitOuterClass.Queue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.SubmitOuterClass.QueueGetRequest,
      api.SubmitOuterClass.Queue> getGetQueueMethod() {
    io.grpc.MethodDescriptor<api.SubmitOuterClass.QueueGetRequest, api.SubmitOuterClass.Queue> getGetQueueMethod;
    if ((getGetQueueMethod = QueueServiceGrpc.getGetQueueMethod) == null) {
      synchronized (QueueServiceGrpc.class) {
        if ((getGetQueueMethod = QueueServiceGrpc.getGetQueueMethod) == null) {
          QueueServiceGrpc.getGetQueueMethod = getGetQueueMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.QueueGetRequest, api.SubmitOuterClass.Queue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.QueueGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.Queue.getDefaultInstance()))
              .setSchemaDescriptor(new QueueServiceMethodDescriptorSupplier("GetQueue"))
              .build();
        }
      }
    }
    return getGetQueueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.SubmitOuterClass.StreamingQueueGetRequest,
      api.SubmitOuterClass.StreamingQueueMessage> getGetQueuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueues",
      requestType = api.SubmitOuterClass.StreamingQueueGetRequest.class,
      responseType = api.SubmitOuterClass.StreamingQueueMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<api.SubmitOuterClass.StreamingQueueGetRequest,
      api.SubmitOuterClass.StreamingQueueMessage> getGetQueuesMethod() {
    io.grpc.MethodDescriptor<api.SubmitOuterClass.StreamingQueueGetRequest, api.SubmitOuterClass.StreamingQueueMessage> getGetQueuesMethod;
    if ((getGetQueuesMethod = QueueServiceGrpc.getGetQueuesMethod) == null) {
      synchronized (QueueServiceGrpc.class) {
        if ((getGetQueuesMethod = QueueServiceGrpc.getGetQueuesMethod) == null) {
          QueueServiceGrpc.getGetQueuesMethod = getGetQueuesMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.StreamingQueueGetRequest, api.SubmitOuterClass.StreamingQueueMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQueues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.StreamingQueueGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.StreamingQueueMessage.getDefaultInstance()))
              .setSchemaDescriptor(new QueueServiceMethodDescriptorSupplier("GetQueues"))
              .build();
        }
      }
    }
    return getGetQueuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.SubmitOuterClass.QueueCordonRequest,
      com.google.protobuf.Empty> getCordonQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CordonQueue",
      requestType = api.SubmitOuterClass.QueueCordonRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.SubmitOuterClass.QueueCordonRequest,
      com.google.protobuf.Empty> getCordonQueueMethod() {
    io.grpc.MethodDescriptor<api.SubmitOuterClass.QueueCordonRequest, com.google.protobuf.Empty> getCordonQueueMethod;
    if ((getCordonQueueMethod = QueueServiceGrpc.getCordonQueueMethod) == null) {
      synchronized (QueueServiceGrpc.class) {
        if ((getCordonQueueMethod = QueueServiceGrpc.getCordonQueueMethod) == null) {
          QueueServiceGrpc.getCordonQueueMethod = getCordonQueueMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.QueueCordonRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CordonQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.QueueCordonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new QueueServiceMethodDescriptorSupplier("CordonQueue"))
              .build();
        }
      }
    }
    return getCordonQueueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.SubmitOuterClass.QueueUncordonRequest,
      com.google.protobuf.Empty> getUncordonQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UncordonQueue",
      requestType = api.SubmitOuterClass.QueueUncordonRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.SubmitOuterClass.QueueUncordonRequest,
      com.google.protobuf.Empty> getUncordonQueueMethod() {
    io.grpc.MethodDescriptor<api.SubmitOuterClass.QueueUncordonRequest, com.google.protobuf.Empty> getUncordonQueueMethod;
    if ((getUncordonQueueMethod = QueueServiceGrpc.getUncordonQueueMethod) == null) {
      synchronized (QueueServiceGrpc.class) {
        if ((getUncordonQueueMethod = QueueServiceGrpc.getUncordonQueueMethod) == null) {
          QueueServiceGrpc.getUncordonQueueMethod = getUncordonQueueMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.QueueUncordonRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UncordonQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.QueueUncordonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new QueueServiceMethodDescriptorSupplier("UncordonQueue"))
              .build();
        }
      }
    }
    return getUncordonQueueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.SubmitOuterClass.QueuePreemptRequest,
      com.google.protobuf.Empty> getPreemptOnQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PreemptOnQueue",
      requestType = api.SubmitOuterClass.QueuePreemptRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.SubmitOuterClass.QueuePreemptRequest,
      com.google.protobuf.Empty> getPreemptOnQueueMethod() {
    io.grpc.MethodDescriptor<api.SubmitOuterClass.QueuePreemptRequest, com.google.protobuf.Empty> getPreemptOnQueueMethod;
    if ((getPreemptOnQueueMethod = QueueServiceGrpc.getPreemptOnQueueMethod) == null) {
      synchronized (QueueServiceGrpc.class) {
        if ((getPreemptOnQueueMethod = QueueServiceGrpc.getPreemptOnQueueMethod) == null) {
          QueueServiceGrpc.getPreemptOnQueueMethod = getPreemptOnQueueMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.QueuePreemptRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PreemptOnQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.QueuePreemptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new QueueServiceMethodDescriptorSupplier("PreemptOnQueue"))
              .build();
        }
      }
    }
    return getPreemptOnQueueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.SubmitOuterClass.QueueCancelRequest,
      com.google.protobuf.Empty> getCancelOnQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelOnQueue",
      requestType = api.SubmitOuterClass.QueueCancelRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.SubmitOuterClass.QueueCancelRequest,
      com.google.protobuf.Empty> getCancelOnQueueMethod() {
    io.grpc.MethodDescriptor<api.SubmitOuterClass.QueueCancelRequest, com.google.protobuf.Empty> getCancelOnQueueMethod;
    if ((getCancelOnQueueMethod = QueueServiceGrpc.getCancelOnQueueMethod) == null) {
      synchronized (QueueServiceGrpc.class) {
        if ((getCancelOnQueueMethod = QueueServiceGrpc.getCancelOnQueueMethod) == null) {
          QueueServiceGrpc.getCancelOnQueueMethod = getCancelOnQueueMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.QueueCancelRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelOnQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.QueueCancelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new QueueServiceMethodDescriptorSupplier("CancelOnQueue"))
              .build();
        }
      }
    }
    return getCancelOnQueueMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueueServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueueServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueueServiceStub>() {
        @java.lang.Override
        public QueueServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueueServiceStub(channel, callOptions);
        }
      };
    return QueueServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueueServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueueServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueueServiceBlockingStub>() {
        @java.lang.Override
        public QueueServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueueServiceBlockingStub(channel, callOptions);
        }
      };
    return QueueServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueueServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueueServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueueServiceFutureStub>() {
        @java.lang.Override
        public QueueServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueueServiceFutureStub(channel, callOptions);
        }
      };
    return QueueServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createQueue(api.SubmitOuterClass.Queue request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateQueueMethod(), responseObserver);
    }

    /**
     */
    default void createQueues(api.SubmitOuterClass.QueueList request,
        io.grpc.stub.StreamObserver<api.SubmitOuterClass.BatchQueueCreateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateQueuesMethod(), responseObserver);
    }

    /**
     */
    default void updateQueue(api.SubmitOuterClass.Queue request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateQueueMethod(), responseObserver);
    }

    /**
     */
    default void updateQueues(api.SubmitOuterClass.QueueList request,
        io.grpc.stub.StreamObserver<api.SubmitOuterClass.BatchQueueUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateQueuesMethod(), responseObserver);
    }

    /**
     */
    default void deleteQueue(api.SubmitOuterClass.QueueDeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteQueueMethod(), responseObserver);
    }

    /**
     */
    default void getQueue(api.SubmitOuterClass.QueueGetRequest request,
        io.grpc.stub.StreamObserver<api.SubmitOuterClass.Queue> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQueueMethod(), responseObserver);
    }

    /**
     */
    default void getQueues(api.SubmitOuterClass.StreamingQueueGetRequest request,
        io.grpc.stub.StreamObserver<api.SubmitOuterClass.StreamingQueueMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQueuesMethod(), responseObserver);
    }

    /**
     */
    default void cordonQueue(api.SubmitOuterClass.QueueCordonRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCordonQueueMethod(), responseObserver);
    }

    /**
     */
    default void uncordonQueue(api.SubmitOuterClass.QueueUncordonRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUncordonQueueMethod(), responseObserver);
    }

    /**
     */
    default void preemptOnQueue(api.SubmitOuterClass.QueuePreemptRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPreemptOnQueueMethod(), responseObserver);
    }

    /**
     */
    default void cancelOnQueue(api.SubmitOuterClass.QueueCancelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelOnQueueMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service QueueService.
   */
  public static abstract class QueueServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return QueueServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service QueueService.
   */
  public static final class QueueServiceStub
      extends io.grpc.stub.AbstractAsyncStub<QueueServiceStub> {
    private QueueServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueueServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueueServiceStub(channel, callOptions);
    }

    /**
     */
    public void createQueue(api.SubmitOuterClass.Queue request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createQueues(api.SubmitOuterClass.QueueList request,
        io.grpc.stub.StreamObserver<api.SubmitOuterClass.BatchQueueCreateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateQueuesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateQueue(api.SubmitOuterClass.Queue request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateQueues(api.SubmitOuterClass.QueueList request,
        io.grpc.stub.StreamObserver<api.SubmitOuterClass.BatchQueueUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateQueuesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteQueue(api.SubmitOuterClass.QueueDeleteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQueue(api.SubmitOuterClass.QueueGetRequest request,
        io.grpc.stub.StreamObserver<api.SubmitOuterClass.Queue> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQueues(api.SubmitOuterClass.StreamingQueueGetRequest request,
        io.grpc.stub.StreamObserver<api.SubmitOuterClass.StreamingQueueMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetQueuesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cordonQueue(api.SubmitOuterClass.QueueCordonRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCordonQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void uncordonQueue(api.SubmitOuterClass.QueueUncordonRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUncordonQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void preemptOnQueue(api.SubmitOuterClass.QueuePreemptRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPreemptOnQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelOnQueue(api.SubmitOuterClass.QueueCancelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelOnQueueMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service QueueService.
   */
  public static final class QueueServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<QueueServiceBlockingStub> {
    private QueueServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueueServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueueServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty createQueue(api.SubmitOuterClass.Queue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateQueueMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.SubmitOuterClass.BatchQueueCreateResponse createQueues(api.SubmitOuterClass.QueueList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateQueuesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateQueue(api.SubmitOuterClass.Queue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateQueueMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.SubmitOuterClass.BatchQueueUpdateResponse updateQueues(api.SubmitOuterClass.QueueList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateQueuesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteQueue(api.SubmitOuterClass.QueueDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteQueueMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.SubmitOuterClass.Queue getQueue(api.SubmitOuterClass.QueueGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQueueMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<api.SubmitOuterClass.StreamingQueueMessage> getQueues(
        api.SubmitOuterClass.StreamingQueueGetRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetQueuesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty cordonQueue(api.SubmitOuterClass.QueueCordonRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCordonQueueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty uncordonQueue(api.SubmitOuterClass.QueueUncordonRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUncordonQueueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty preemptOnQueue(api.SubmitOuterClass.QueuePreemptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPreemptOnQueueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty cancelOnQueue(api.SubmitOuterClass.QueueCancelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelOnQueueMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service QueueService.
   */
  public static final class QueueServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<QueueServiceFutureStub> {
    private QueueServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueueServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueueServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createQueue(
        api.SubmitOuterClass.Queue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateQueueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.SubmitOuterClass.BatchQueueCreateResponse> createQueues(
        api.SubmitOuterClass.QueueList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateQueuesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateQueue(
        api.SubmitOuterClass.Queue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateQueueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.SubmitOuterClass.BatchQueueUpdateResponse> updateQueues(
        api.SubmitOuterClass.QueueList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateQueuesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteQueue(
        api.SubmitOuterClass.QueueDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteQueueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.SubmitOuterClass.Queue> getQueue(
        api.SubmitOuterClass.QueueGetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQueueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> cordonQueue(
        api.SubmitOuterClass.QueueCordonRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCordonQueueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> uncordonQueue(
        api.SubmitOuterClass.QueueUncordonRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUncordonQueueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> preemptOnQueue(
        api.SubmitOuterClass.QueuePreemptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPreemptOnQueueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> cancelOnQueue(
        api.SubmitOuterClass.QueueCancelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelOnQueueMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_QUEUE = 0;
  private static final int METHODID_CREATE_QUEUES = 1;
  private static final int METHODID_UPDATE_QUEUE = 2;
  private static final int METHODID_UPDATE_QUEUES = 3;
  private static final int METHODID_DELETE_QUEUE = 4;
  private static final int METHODID_GET_QUEUE = 5;
  private static final int METHODID_GET_QUEUES = 6;
  private static final int METHODID_CORDON_QUEUE = 7;
  private static final int METHODID_UNCORDON_QUEUE = 8;
  private static final int METHODID_PREEMPT_ON_QUEUE = 9;
  private static final int METHODID_CANCEL_ON_QUEUE = 10;

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
        case METHODID_CREATE_QUEUE:
          serviceImpl.createQueue((api.SubmitOuterClass.Queue) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_QUEUES:
          serviceImpl.createQueues((api.SubmitOuterClass.QueueList) request,
              (io.grpc.stub.StreamObserver<api.SubmitOuterClass.BatchQueueCreateResponse>) responseObserver);
          break;
        case METHODID_UPDATE_QUEUE:
          serviceImpl.updateQueue((api.SubmitOuterClass.Queue) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_QUEUES:
          serviceImpl.updateQueues((api.SubmitOuterClass.QueueList) request,
              (io.grpc.stub.StreamObserver<api.SubmitOuterClass.BatchQueueUpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE_QUEUE:
          serviceImpl.deleteQueue((api.SubmitOuterClass.QueueDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_QUEUE:
          serviceImpl.getQueue((api.SubmitOuterClass.QueueGetRequest) request,
              (io.grpc.stub.StreamObserver<api.SubmitOuterClass.Queue>) responseObserver);
          break;
        case METHODID_GET_QUEUES:
          serviceImpl.getQueues((api.SubmitOuterClass.StreamingQueueGetRequest) request,
              (io.grpc.stub.StreamObserver<api.SubmitOuterClass.StreamingQueueMessage>) responseObserver);
          break;
        case METHODID_CORDON_QUEUE:
          serviceImpl.cordonQueue((api.SubmitOuterClass.QueueCordonRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UNCORDON_QUEUE:
          serviceImpl.uncordonQueue((api.SubmitOuterClass.QueueUncordonRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_PREEMPT_ON_QUEUE:
          serviceImpl.preemptOnQueue((api.SubmitOuterClass.QueuePreemptRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CANCEL_ON_QUEUE:
          serviceImpl.cancelOnQueue((api.SubmitOuterClass.QueueCancelRequest) request,
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
          getCreateQueueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.SubmitOuterClass.Queue,
              com.google.protobuf.Empty>(
                service, METHODID_CREATE_QUEUE)))
        .addMethod(
          getCreateQueuesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.SubmitOuterClass.QueueList,
              api.SubmitOuterClass.BatchQueueCreateResponse>(
                service, METHODID_CREATE_QUEUES)))
        .addMethod(
          getUpdateQueueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.SubmitOuterClass.Queue,
              com.google.protobuf.Empty>(
                service, METHODID_UPDATE_QUEUE)))
        .addMethod(
          getUpdateQueuesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.SubmitOuterClass.QueueList,
              api.SubmitOuterClass.BatchQueueUpdateResponse>(
                service, METHODID_UPDATE_QUEUES)))
        .addMethod(
          getDeleteQueueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.SubmitOuterClass.QueueDeleteRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_QUEUE)))
        .addMethod(
          getGetQueueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.SubmitOuterClass.QueueGetRequest,
              api.SubmitOuterClass.Queue>(
                service, METHODID_GET_QUEUE)))
        .addMethod(
          getGetQueuesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              api.SubmitOuterClass.StreamingQueueGetRequest,
              api.SubmitOuterClass.StreamingQueueMessage>(
                service, METHODID_GET_QUEUES)))
        .addMethod(
          getCordonQueueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.SubmitOuterClass.QueueCordonRequest,
              com.google.protobuf.Empty>(
                service, METHODID_CORDON_QUEUE)))
        .addMethod(
          getUncordonQueueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.SubmitOuterClass.QueueUncordonRequest,
              com.google.protobuf.Empty>(
                service, METHODID_UNCORDON_QUEUE)))
        .addMethod(
          getPreemptOnQueueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.SubmitOuterClass.QueuePreemptRequest,
              com.google.protobuf.Empty>(
                service, METHODID_PREEMPT_ON_QUEUE)))
        .addMethod(
          getCancelOnQueueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.SubmitOuterClass.QueueCancelRequest,
              com.google.protobuf.Empty>(
                service, METHODID_CANCEL_ON_QUEUE)))
        .build();
  }

  private static abstract class QueueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueueServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return api.SubmitOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueueService");
    }
  }

  private static final class QueueServiceFileDescriptorSupplier
      extends QueueServiceBaseDescriptorSupplier {
    QueueServiceFileDescriptorSupplier() {}
  }

  private static final class QueueServiceMethodDescriptorSupplier
      extends QueueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    QueueServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (QueueServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueueServiceFileDescriptorSupplier())
              .addMethod(getCreateQueueMethod())
              .addMethod(getCreateQueuesMethod())
              .addMethod(getUpdateQueueMethod())
              .addMethod(getUpdateQueuesMethod())
              .addMethod(getDeleteQueueMethod())
              .addMethod(getGetQueueMethod())
              .addMethod(getGetQueuesMethod())
              .addMethod(getCordonQueueMethod())
              .addMethod(getUncordonQueueMethod())
              .addMethod(getPreemptOnQueueMethod())
              .addMethod(getCancelOnQueueMethod())
              .build();
        }
      }
    }
    return result;
  }
}
