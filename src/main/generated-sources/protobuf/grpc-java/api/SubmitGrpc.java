package api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: pkg/api/submit.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SubmitGrpc {

  private SubmitGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.Submit";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.SubmitOuterClass.JobSubmitRequest,
      api.SubmitOuterClass.JobSubmitResponse> getSubmitJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitJobs",
      requestType = api.SubmitOuterClass.JobSubmitRequest.class,
      responseType = api.SubmitOuterClass.JobSubmitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.SubmitOuterClass.JobSubmitRequest,
      api.SubmitOuterClass.JobSubmitResponse> getSubmitJobsMethod() {
    io.grpc.MethodDescriptor<api.SubmitOuterClass.JobSubmitRequest, api.SubmitOuterClass.JobSubmitResponse> getSubmitJobsMethod;
    if ((getSubmitJobsMethod = SubmitGrpc.getSubmitJobsMethod) == null) {
      synchronized (SubmitGrpc.class) {
        if ((getSubmitJobsMethod = SubmitGrpc.getSubmitJobsMethod) == null) {
          SubmitGrpc.getSubmitJobsMethod = getSubmitJobsMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.JobSubmitRequest, api.SubmitOuterClass.JobSubmitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.JobSubmitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.JobSubmitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SubmitMethodDescriptorSupplier("SubmitJobs"))
              .build();
        }
      }
    }
    return getSubmitJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.SubmitOuterClass.JobCancelRequest,
      api.SubmitOuterClass.CancellationResult> getCancelJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelJobs",
      requestType = api.SubmitOuterClass.JobCancelRequest.class,
      responseType = api.SubmitOuterClass.CancellationResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.SubmitOuterClass.JobCancelRequest,
      api.SubmitOuterClass.CancellationResult> getCancelJobsMethod() {
    io.grpc.MethodDescriptor<api.SubmitOuterClass.JobCancelRequest, api.SubmitOuterClass.CancellationResult> getCancelJobsMethod;
    if ((getCancelJobsMethod = SubmitGrpc.getCancelJobsMethod) == null) {
      synchronized (SubmitGrpc.class) {
        if ((getCancelJobsMethod = SubmitGrpc.getCancelJobsMethod) == null) {
          SubmitGrpc.getCancelJobsMethod = getCancelJobsMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.JobCancelRequest, api.SubmitOuterClass.CancellationResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.JobCancelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.CancellationResult.getDefaultInstance()))
              .setSchemaDescriptor(new SubmitMethodDescriptorSupplier("CancelJobs"))
              .build();
        }
      }
    }
    return getCancelJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.SubmitOuterClass.JobSetCancelRequest,
      com.google.protobuf.Empty> getCancelJobSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelJobSet",
      requestType = api.SubmitOuterClass.JobSetCancelRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.SubmitOuterClass.JobSetCancelRequest,
      com.google.protobuf.Empty> getCancelJobSetMethod() {
    io.grpc.MethodDescriptor<api.SubmitOuterClass.JobSetCancelRequest, com.google.protobuf.Empty> getCancelJobSetMethod;
    if ((getCancelJobSetMethod = SubmitGrpc.getCancelJobSetMethod) == null) {
      synchronized (SubmitGrpc.class) {
        if ((getCancelJobSetMethod = SubmitGrpc.getCancelJobSetMethod) == null) {
          SubmitGrpc.getCancelJobSetMethod = getCancelJobSetMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.JobSetCancelRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelJobSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.JobSetCancelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SubmitMethodDescriptorSupplier("CancelJobSet"))
              .build();
        }
      }
    }
    return getCancelJobSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.SubmitOuterClass.JobReprioritizeRequest,
      api.SubmitOuterClass.JobReprioritizeResponse> getReprioritizeJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReprioritizeJobs",
      requestType = api.SubmitOuterClass.JobReprioritizeRequest.class,
      responseType = api.SubmitOuterClass.JobReprioritizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.SubmitOuterClass.JobReprioritizeRequest,
      api.SubmitOuterClass.JobReprioritizeResponse> getReprioritizeJobsMethod() {
    io.grpc.MethodDescriptor<api.SubmitOuterClass.JobReprioritizeRequest, api.SubmitOuterClass.JobReprioritizeResponse> getReprioritizeJobsMethod;
    if ((getReprioritizeJobsMethod = SubmitGrpc.getReprioritizeJobsMethod) == null) {
      synchronized (SubmitGrpc.class) {
        if ((getReprioritizeJobsMethod = SubmitGrpc.getReprioritizeJobsMethod) == null) {
          SubmitGrpc.getReprioritizeJobsMethod = getReprioritizeJobsMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.JobReprioritizeRequest, api.SubmitOuterClass.JobReprioritizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReprioritizeJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.JobReprioritizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.JobReprioritizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SubmitMethodDescriptorSupplier("ReprioritizeJobs"))
              .build();
        }
      }
    }
    return getReprioritizeJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.SubmitOuterClass.JobPreemptRequest,
      com.google.protobuf.Empty> getPreemptJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PreemptJobs",
      requestType = api.SubmitOuterClass.JobPreemptRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.SubmitOuterClass.JobPreemptRequest,
      com.google.protobuf.Empty> getPreemptJobsMethod() {
    io.grpc.MethodDescriptor<api.SubmitOuterClass.JobPreemptRequest, com.google.protobuf.Empty> getPreemptJobsMethod;
    if ((getPreemptJobsMethod = SubmitGrpc.getPreemptJobsMethod) == null) {
      synchronized (SubmitGrpc.class) {
        if ((getPreemptJobsMethod = SubmitGrpc.getPreemptJobsMethod) == null) {
          SubmitGrpc.getPreemptJobsMethod = getPreemptJobsMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.JobPreemptRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PreemptJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.JobPreemptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SubmitMethodDescriptorSupplier("PreemptJobs"))
              .build();
        }
      }
    }
    return getPreemptJobsMethod;
  }

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
    if ((getCreateQueueMethod = SubmitGrpc.getCreateQueueMethod) == null) {
      synchronized (SubmitGrpc.class) {
        if ((getCreateQueueMethod = SubmitGrpc.getCreateQueueMethod) == null) {
          SubmitGrpc.getCreateQueueMethod = getCreateQueueMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.Queue, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.Queue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SubmitMethodDescriptorSupplier("CreateQueue"))
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
    if ((getCreateQueuesMethod = SubmitGrpc.getCreateQueuesMethod) == null) {
      synchronized (SubmitGrpc.class) {
        if ((getCreateQueuesMethod = SubmitGrpc.getCreateQueuesMethod) == null) {
          SubmitGrpc.getCreateQueuesMethod = getCreateQueuesMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.QueueList, api.SubmitOuterClass.BatchQueueCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateQueues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.QueueList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.BatchQueueCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SubmitMethodDescriptorSupplier("CreateQueues"))
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
    if ((getUpdateQueueMethod = SubmitGrpc.getUpdateQueueMethod) == null) {
      synchronized (SubmitGrpc.class) {
        if ((getUpdateQueueMethod = SubmitGrpc.getUpdateQueueMethod) == null) {
          SubmitGrpc.getUpdateQueueMethod = getUpdateQueueMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.Queue, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.Queue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SubmitMethodDescriptorSupplier("UpdateQueue"))
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
    if ((getUpdateQueuesMethod = SubmitGrpc.getUpdateQueuesMethod) == null) {
      synchronized (SubmitGrpc.class) {
        if ((getUpdateQueuesMethod = SubmitGrpc.getUpdateQueuesMethod) == null) {
          SubmitGrpc.getUpdateQueuesMethod = getUpdateQueuesMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.QueueList, api.SubmitOuterClass.BatchQueueUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateQueues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.QueueList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.BatchQueueUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SubmitMethodDescriptorSupplier("UpdateQueues"))
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
    if ((getDeleteQueueMethod = SubmitGrpc.getDeleteQueueMethod) == null) {
      synchronized (SubmitGrpc.class) {
        if ((getDeleteQueueMethod = SubmitGrpc.getDeleteQueueMethod) == null) {
          SubmitGrpc.getDeleteQueueMethod = getDeleteQueueMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.QueueDeleteRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.QueueDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SubmitMethodDescriptorSupplier("DeleteQueue"))
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
    if ((getGetQueueMethod = SubmitGrpc.getGetQueueMethod) == null) {
      synchronized (SubmitGrpc.class) {
        if ((getGetQueueMethod = SubmitGrpc.getGetQueueMethod) == null) {
          SubmitGrpc.getGetQueueMethod = getGetQueueMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.QueueGetRequest, api.SubmitOuterClass.Queue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.QueueGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.Queue.getDefaultInstance()))
              .setSchemaDescriptor(new SubmitMethodDescriptorSupplier("GetQueue"))
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
    if ((getGetQueuesMethod = SubmitGrpc.getGetQueuesMethod) == null) {
      synchronized (SubmitGrpc.class) {
        if ((getGetQueuesMethod = SubmitGrpc.getGetQueuesMethod) == null) {
          SubmitGrpc.getGetQueuesMethod = getGetQueuesMethod =
              io.grpc.MethodDescriptor.<api.SubmitOuterClass.StreamingQueueGetRequest, api.SubmitOuterClass.StreamingQueueMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQueues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.StreamingQueueGetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.SubmitOuterClass.StreamingQueueMessage.getDefaultInstance()))
              .setSchemaDescriptor(new SubmitMethodDescriptorSupplier("GetQueues"))
              .build();
        }
      }
    }
    return getGetQueuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      api.Health.HealthCheckResponse> getHealthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Health",
      requestType = com.google.protobuf.Empty.class,
      responseType = api.Health.HealthCheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      api.Health.HealthCheckResponse> getHealthMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, api.Health.HealthCheckResponse> getHealthMethod;
    if ((getHealthMethod = SubmitGrpc.getHealthMethod) == null) {
      synchronized (SubmitGrpc.class) {
        if ((getHealthMethod = SubmitGrpc.getHealthMethod) == null) {
          SubmitGrpc.getHealthMethod = getHealthMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, api.Health.HealthCheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Health"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.Health.HealthCheckResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SubmitMethodDescriptorSupplier("Health"))
              .build();
        }
      }
    }
    return getHealthMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SubmitStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubmitStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubmitStub>() {
        @java.lang.Override
        public SubmitStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubmitStub(channel, callOptions);
        }
      };
    return SubmitStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SubmitBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubmitBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubmitBlockingStub>() {
        @java.lang.Override
        public SubmitBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubmitBlockingStub(channel, callOptions);
        }
      };
    return SubmitBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SubmitFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SubmitFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SubmitFutureStub>() {
        @java.lang.Override
        public SubmitFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SubmitFutureStub(channel, callOptions);
        }
      };
    return SubmitFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void submitJobs(api.SubmitOuterClass.JobSubmitRequest request,
        io.grpc.stub.StreamObserver<api.SubmitOuterClass.JobSubmitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitJobsMethod(), responseObserver);
    }

    /**
     */
    default void cancelJobs(api.SubmitOuterClass.JobCancelRequest request,
        io.grpc.stub.StreamObserver<api.SubmitOuterClass.CancellationResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelJobsMethod(), responseObserver);
    }

    /**
     */
    default void cancelJobSet(api.SubmitOuterClass.JobSetCancelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelJobSetMethod(), responseObserver);
    }

    /**
     */
    default void reprioritizeJobs(api.SubmitOuterClass.JobReprioritizeRequest request,
        io.grpc.stub.StreamObserver<api.SubmitOuterClass.JobReprioritizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReprioritizeJobsMethod(), responseObserver);
    }

    /**
     */
    default void preemptJobs(api.SubmitOuterClass.JobPreemptRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPreemptJobsMethod(), responseObserver);
    }

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
    default void health(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<api.Health.HealthCheckResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHealthMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Submit.
   */
  public static abstract class SubmitImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SubmitGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Submit.
   */
  public static final class SubmitStub
      extends io.grpc.stub.AbstractAsyncStub<SubmitStub> {
    private SubmitStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubmitStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubmitStub(channel, callOptions);
    }

    /**
     */
    public void submitJobs(api.SubmitOuterClass.JobSubmitRequest request,
        io.grpc.stub.StreamObserver<api.SubmitOuterClass.JobSubmitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelJobs(api.SubmitOuterClass.JobCancelRequest request,
        io.grpc.stub.StreamObserver<api.SubmitOuterClass.CancellationResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelJobSet(api.SubmitOuterClass.JobSetCancelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelJobSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reprioritizeJobs(api.SubmitOuterClass.JobReprioritizeRequest request,
        io.grpc.stub.StreamObserver<api.SubmitOuterClass.JobReprioritizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReprioritizeJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void preemptJobs(api.SubmitOuterClass.JobPreemptRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPreemptJobsMethod(), getCallOptions()), request, responseObserver);
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
    public void health(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<api.Health.HealthCheckResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHealthMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Submit.
   */
  public static final class SubmitBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SubmitBlockingStub> {
    private SubmitBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubmitBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubmitBlockingStub(channel, callOptions);
    }

    /**
     */
    public api.SubmitOuterClass.JobSubmitResponse submitJobs(api.SubmitOuterClass.JobSubmitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitJobsMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.SubmitOuterClass.CancellationResult cancelJobs(api.SubmitOuterClass.JobCancelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelJobsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty cancelJobSet(api.SubmitOuterClass.JobSetCancelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelJobSetMethod(), getCallOptions(), request);
    }

    /**
     */
    public api.SubmitOuterClass.JobReprioritizeResponse reprioritizeJobs(api.SubmitOuterClass.JobReprioritizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReprioritizeJobsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty preemptJobs(api.SubmitOuterClass.JobPreemptRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPreemptJobsMethod(), getCallOptions(), request);
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
    public api.Health.HealthCheckResponse health(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHealthMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Submit.
   */
  public static final class SubmitFutureStub
      extends io.grpc.stub.AbstractFutureStub<SubmitFutureStub> {
    private SubmitFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubmitFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SubmitFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.SubmitOuterClass.JobSubmitResponse> submitJobs(
        api.SubmitOuterClass.JobSubmitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitJobsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.SubmitOuterClass.CancellationResult> cancelJobs(
        api.SubmitOuterClass.JobCancelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelJobsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> cancelJobSet(
        api.SubmitOuterClass.JobSetCancelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelJobSetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<api.SubmitOuterClass.JobReprioritizeResponse> reprioritizeJobs(
        api.SubmitOuterClass.JobReprioritizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReprioritizeJobsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> preemptJobs(
        api.SubmitOuterClass.JobPreemptRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPreemptJobsMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<api.Health.HealthCheckResponse> health(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHealthMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT_JOBS = 0;
  private static final int METHODID_CANCEL_JOBS = 1;
  private static final int METHODID_CANCEL_JOB_SET = 2;
  private static final int METHODID_REPRIORITIZE_JOBS = 3;
  private static final int METHODID_PREEMPT_JOBS = 4;
  private static final int METHODID_CREATE_QUEUE = 5;
  private static final int METHODID_CREATE_QUEUES = 6;
  private static final int METHODID_UPDATE_QUEUE = 7;
  private static final int METHODID_UPDATE_QUEUES = 8;
  private static final int METHODID_DELETE_QUEUE = 9;
  private static final int METHODID_GET_QUEUE = 10;
  private static final int METHODID_GET_QUEUES = 11;
  private static final int METHODID_HEALTH = 12;

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
        case METHODID_SUBMIT_JOBS:
          serviceImpl.submitJobs((api.SubmitOuterClass.JobSubmitRequest) request,
              (io.grpc.stub.StreamObserver<api.SubmitOuterClass.JobSubmitResponse>) responseObserver);
          break;
        case METHODID_CANCEL_JOBS:
          serviceImpl.cancelJobs((api.SubmitOuterClass.JobCancelRequest) request,
              (io.grpc.stub.StreamObserver<api.SubmitOuterClass.CancellationResult>) responseObserver);
          break;
        case METHODID_CANCEL_JOB_SET:
          serviceImpl.cancelJobSet((api.SubmitOuterClass.JobSetCancelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REPRIORITIZE_JOBS:
          serviceImpl.reprioritizeJobs((api.SubmitOuterClass.JobReprioritizeRequest) request,
              (io.grpc.stub.StreamObserver<api.SubmitOuterClass.JobReprioritizeResponse>) responseObserver);
          break;
        case METHODID_PREEMPT_JOBS:
          serviceImpl.preemptJobs((api.SubmitOuterClass.JobPreemptRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
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
        case METHODID_HEALTH:
          serviceImpl.health((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<api.Health.HealthCheckResponse>) responseObserver);
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
          getSubmitJobsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.SubmitOuterClass.JobSubmitRequest,
              api.SubmitOuterClass.JobSubmitResponse>(
                service, METHODID_SUBMIT_JOBS)))
        .addMethod(
          getCancelJobsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.SubmitOuterClass.JobCancelRequest,
              api.SubmitOuterClass.CancellationResult>(
                service, METHODID_CANCEL_JOBS)))
        .addMethod(
          getCancelJobSetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.SubmitOuterClass.JobSetCancelRequest,
              com.google.protobuf.Empty>(
                service, METHODID_CANCEL_JOB_SET)))
        .addMethod(
          getReprioritizeJobsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.SubmitOuterClass.JobReprioritizeRequest,
              api.SubmitOuterClass.JobReprioritizeResponse>(
                service, METHODID_REPRIORITIZE_JOBS)))
        .addMethod(
          getPreemptJobsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              api.SubmitOuterClass.JobPreemptRequest,
              com.google.protobuf.Empty>(
                service, METHODID_PREEMPT_JOBS)))
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
          getHealthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              api.Health.HealthCheckResponse>(
                service, METHODID_HEALTH)))
        .build();
  }

  private static abstract class SubmitBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SubmitBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return api.SubmitOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Submit");
    }
  }

  private static final class SubmitFileDescriptorSupplier
      extends SubmitBaseDescriptorSupplier {
    SubmitFileDescriptorSupplier() {}
  }

  private static final class SubmitMethodDescriptorSupplier
      extends SubmitBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SubmitMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SubmitGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SubmitFileDescriptorSupplier())
              .addMethod(getSubmitJobsMethod())
              .addMethod(getCancelJobsMethod())
              .addMethod(getCancelJobSetMethod())
              .addMethod(getReprioritizeJobsMethod())
              .addMethod(getPreemptJobsMethod())
              .addMethod(getCreateQueueMethod())
              .addMethod(getCreateQueuesMethod())
              .addMethod(getUpdateQueueMethod())
              .addMethod(getUpdateQueuesMethod())
              .addMethod(getDeleteQueueMethod())
              .addMethod(getGetQueueMethod())
              .addMethod(getGetQueuesMethod())
              .addMethod(getHealthMethod())
              .build();
        }
      }
    }
    return result;
  }
}
