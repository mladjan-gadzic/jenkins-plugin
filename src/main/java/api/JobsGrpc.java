package api;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.67.1)",
    comments = "Source: pkg/api/job.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class JobsGrpc {

  private JobsGrpc() {}

  public static final String SERVICE_NAME = "api.Jobs";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Job.JobStatusRequest,
      Job.JobStatusResponse> getGetJobStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJobStatus",
      requestType = Job.JobStatusRequest.class,
      responseType = Job.JobStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Job.JobStatusRequest,
      Job.JobStatusResponse> getGetJobStatusMethod() {
    io.grpc.MethodDescriptor<Job.JobStatusRequest, Job.JobStatusResponse> getGetJobStatusMethod;
    if ((getGetJobStatusMethod = JobsGrpc.getGetJobStatusMethod) == null) {
      synchronized (JobsGrpc.class) {
        if ((getGetJobStatusMethod = JobsGrpc.getGetJobStatusMethod) == null) {
          JobsGrpc.getGetJobStatusMethod = getGetJobStatusMethod =
              io.grpc.MethodDescriptor.<Job.JobStatusRequest, Job.JobStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJobStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Job.JobStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Job.JobStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobsMethodDescriptorSupplier("GetJobStatus"))
              .build();
        }
      }
    }
    return getGetJobStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Job.JobStatusUsingExternalJobUriRequest,
      Job.JobStatusResponse> getGetJobStatusUsingExternalJobUriMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJobStatusUsingExternalJobUri",
      requestType = Job.JobStatusUsingExternalJobUriRequest.class,
      responseType = Job.JobStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Job.JobStatusUsingExternalJobUriRequest,
      Job.JobStatusResponse> getGetJobStatusUsingExternalJobUriMethod() {
    io.grpc.MethodDescriptor<Job.JobStatusUsingExternalJobUriRequest, Job.JobStatusResponse> getGetJobStatusUsingExternalJobUriMethod;
    if ((getGetJobStatusUsingExternalJobUriMethod = JobsGrpc.getGetJobStatusUsingExternalJobUriMethod) == null) {
      synchronized (JobsGrpc.class) {
        if ((getGetJobStatusUsingExternalJobUriMethod = JobsGrpc.getGetJobStatusUsingExternalJobUriMethod) == null) {
          JobsGrpc.getGetJobStatusUsingExternalJobUriMethod = getGetJobStatusUsingExternalJobUriMethod =
              io.grpc.MethodDescriptor.<Job.JobStatusUsingExternalJobUriRequest, Job.JobStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJobStatusUsingExternalJobUri"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Job.JobStatusUsingExternalJobUriRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Job.JobStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobsMethodDescriptorSupplier("GetJobStatusUsingExternalJobUri"))
              .build();
        }
      }
    }
    return getGetJobStatusUsingExternalJobUriMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Job.JobDetailsRequest,
      Job.JobDetailsResponse> getGetJobDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJobDetails",
      requestType = Job.JobDetailsRequest.class,
      responseType = Job.JobDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Job.JobDetailsRequest,
      Job.JobDetailsResponse> getGetJobDetailsMethod() {
    io.grpc.MethodDescriptor<Job.JobDetailsRequest, Job.JobDetailsResponse> getGetJobDetailsMethod;
    if ((getGetJobDetailsMethod = JobsGrpc.getGetJobDetailsMethod) == null) {
      synchronized (JobsGrpc.class) {
        if ((getGetJobDetailsMethod = JobsGrpc.getGetJobDetailsMethod) == null) {
          JobsGrpc.getGetJobDetailsMethod = getGetJobDetailsMethod =
              io.grpc.MethodDescriptor.<Job.JobDetailsRequest, Job.JobDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJobDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Job.JobDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Job.JobDetailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobsMethodDescriptorSupplier("GetJobDetails"))
              .build();
        }
      }
    }
    return getGetJobDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Job.JobErrorsRequest,
      Job.JobErrorsResponse> getGetJobErrorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJobErrors",
      requestType = Job.JobErrorsRequest.class,
      responseType = Job.JobErrorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Job.JobErrorsRequest,
      Job.JobErrorsResponse> getGetJobErrorsMethod() {
    io.grpc.MethodDescriptor<Job.JobErrorsRequest, Job.JobErrorsResponse> getGetJobErrorsMethod;
    if ((getGetJobErrorsMethod = JobsGrpc.getGetJobErrorsMethod) == null) {
      synchronized (JobsGrpc.class) {
        if ((getGetJobErrorsMethod = JobsGrpc.getGetJobErrorsMethod) == null) {
          JobsGrpc.getGetJobErrorsMethod = getGetJobErrorsMethod =
              io.grpc.MethodDescriptor.<Job.JobErrorsRequest, Job.JobErrorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJobErrors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Job.JobErrorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Job.JobErrorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobsMethodDescriptorSupplier("GetJobErrors"))
              .build();
        }
      }
    }
    return getGetJobErrorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Job.JobRunDetailsRequest,
      Job.JobRunDetailsResponse> getGetJobRunDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJobRunDetails",
      requestType = Job.JobRunDetailsRequest.class,
      responseType = Job.JobRunDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Job.JobRunDetailsRequest,
      Job.JobRunDetailsResponse> getGetJobRunDetailsMethod() {
    io.grpc.MethodDescriptor<Job.JobRunDetailsRequest, Job.JobRunDetailsResponse> getGetJobRunDetailsMethod;
    if ((getGetJobRunDetailsMethod = JobsGrpc.getGetJobRunDetailsMethod) == null) {
      synchronized (JobsGrpc.class) {
        if ((getGetJobRunDetailsMethod = JobsGrpc.getGetJobRunDetailsMethod) == null) {
          JobsGrpc.getGetJobRunDetailsMethod = getGetJobRunDetailsMethod =
              io.grpc.MethodDescriptor.<Job.JobRunDetailsRequest, Job.JobRunDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJobRunDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Job.JobRunDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Job.JobRunDetailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobsMethodDescriptorSupplier("GetJobRunDetails"))
              .build();
        }
      }
    }
    return getGetJobRunDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobsStub>() {
        @Override
        public JobsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobsStub(channel, callOptions);
        }
      };
    return JobsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobsBlockingStub>() {
        @Override
        public JobsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobsBlockingStub(channel, callOptions);
        }
      };
    return JobsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JobsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobsFutureStub>() {
        @Override
        public JobsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobsFutureStub(channel, callOptions);
        }
      };
    return JobsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getJobStatus(Job.JobStatusRequest request,
        io.grpc.stub.StreamObserver<Job.JobStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetJobStatusMethod(), responseObserver);
    }

    /**
     */
    default void getJobStatusUsingExternalJobUri(Job.JobStatusUsingExternalJobUriRequest request,
        io.grpc.stub.StreamObserver<Job.JobStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetJobStatusUsingExternalJobUriMethod(), responseObserver);
    }

    /**
     */
    default void getJobDetails(Job.JobDetailsRequest request,
        io.grpc.stub.StreamObserver<Job.JobDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetJobDetailsMethod(), responseObserver);
    }

    /**
     */
    default void getJobErrors(Job.JobErrorsRequest request,
        io.grpc.stub.StreamObserver<Job.JobErrorsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetJobErrorsMethod(), responseObserver);
    }

    /**
     */
    default void getJobRunDetails(Job.JobRunDetailsRequest request,
        io.grpc.stub.StreamObserver<Job.JobRunDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetJobRunDetailsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Jobs.
   */
  public static abstract class JobsImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return JobsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Jobs.
   */
  public static final class JobsStub
      extends io.grpc.stub.AbstractAsyncStub<JobsStub> {
    private JobsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected JobsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobsStub(channel, callOptions);
    }

    /**
     */
    public void getJobStatus(Job.JobStatusRequest request,
        io.grpc.stub.StreamObserver<Job.JobStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetJobStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getJobStatusUsingExternalJobUri(Job.JobStatusUsingExternalJobUriRequest request,
        io.grpc.stub.StreamObserver<Job.JobStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetJobStatusUsingExternalJobUriMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getJobDetails(Job.JobDetailsRequest request,
        io.grpc.stub.StreamObserver<Job.JobDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetJobDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getJobErrors(Job.JobErrorsRequest request,
        io.grpc.stub.StreamObserver<Job.JobErrorsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetJobErrorsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getJobRunDetails(Job.JobRunDetailsRequest request,
        io.grpc.stub.StreamObserver<Job.JobRunDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetJobRunDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Jobs.
   */
  public static final class JobsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<JobsBlockingStub> {
    private JobsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected JobsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobsBlockingStub(channel, callOptions);
    }

    /**
     */
    public Job.JobStatusResponse getJobStatus(Job.JobStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetJobStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public Job.JobStatusResponse getJobStatusUsingExternalJobUri(Job.JobStatusUsingExternalJobUriRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetJobStatusUsingExternalJobUriMethod(), getCallOptions(), request);
    }

    /**
     */
    public Job.JobDetailsResponse getJobDetails(Job.JobDetailsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetJobDetailsMethod(), getCallOptions(), request);
    }

    /**
     */
    public Job.JobErrorsResponse getJobErrors(Job.JobErrorsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetJobErrorsMethod(), getCallOptions(), request);
    }

    /**
     */
    public Job.JobRunDetailsResponse getJobRunDetails(Job.JobRunDetailsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetJobRunDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Jobs.
   */
  public static final class JobsFutureStub
      extends io.grpc.stub.AbstractFutureStub<JobsFutureStub> {
    private JobsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected JobsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Job.JobStatusResponse> getJobStatus(
        Job.JobStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetJobStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Job.JobStatusResponse> getJobStatusUsingExternalJobUri(
        Job.JobStatusUsingExternalJobUriRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetJobStatusUsingExternalJobUriMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Job.JobDetailsResponse> getJobDetails(
        Job.JobDetailsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetJobDetailsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Job.JobErrorsResponse> getJobErrors(
        Job.JobErrorsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetJobErrorsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Job.JobRunDetailsResponse> getJobRunDetails(
        Job.JobRunDetailsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetJobRunDetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_JOB_STATUS = 0;
  private static final int METHODID_GET_JOB_STATUS_USING_EXTERNAL_JOB_URI = 1;
  private static final int METHODID_GET_JOB_DETAILS = 2;
  private static final int METHODID_GET_JOB_ERRORS = 3;
  private static final int METHODID_GET_JOB_RUN_DETAILS = 4;

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
        case METHODID_GET_JOB_STATUS:
          serviceImpl.getJobStatus((Job.JobStatusRequest) request,
              (io.grpc.stub.StreamObserver<Job.JobStatusResponse>) responseObserver);
          break;
        case METHODID_GET_JOB_STATUS_USING_EXTERNAL_JOB_URI:
          serviceImpl.getJobStatusUsingExternalJobUri((Job.JobStatusUsingExternalJobUriRequest) request,
              (io.grpc.stub.StreamObserver<Job.JobStatusResponse>) responseObserver);
          break;
        case METHODID_GET_JOB_DETAILS:
          serviceImpl.getJobDetails((Job.JobDetailsRequest) request,
              (io.grpc.stub.StreamObserver<Job.JobDetailsResponse>) responseObserver);
          break;
        case METHODID_GET_JOB_ERRORS:
          serviceImpl.getJobErrors((Job.JobErrorsRequest) request,
              (io.grpc.stub.StreamObserver<Job.JobErrorsResponse>) responseObserver);
          break;
        case METHODID_GET_JOB_RUN_DETAILS:
          serviceImpl.getJobRunDetails((Job.JobRunDetailsRequest) request,
              (io.grpc.stub.StreamObserver<Job.JobRunDetailsResponse>) responseObserver);
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
          getGetJobStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Job.JobStatusRequest,
              Job.JobStatusResponse>(
                service, METHODID_GET_JOB_STATUS)))
        .addMethod(
          getGetJobStatusUsingExternalJobUriMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Job.JobStatusUsingExternalJobUriRequest,
              Job.JobStatusResponse>(
                service, METHODID_GET_JOB_STATUS_USING_EXTERNAL_JOB_URI)))
        .addMethod(
          getGetJobDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Job.JobDetailsRequest,
              Job.JobDetailsResponse>(
                service, METHODID_GET_JOB_DETAILS)))
        .addMethod(
          getGetJobErrorsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Job.JobErrorsRequest,
              Job.JobErrorsResponse>(
                service, METHODID_GET_JOB_ERRORS)))
        .addMethod(
          getGetJobRunDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Job.JobRunDetailsRequest,
              Job.JobRunDetailsResponse>(
                service, METHODID_GET_JOB_RUN_DETAILS)))
        .build();
  }

  private static abstract class JobsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobsBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Job.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Jobs");
    }
  }

  private static final class JobsFileDescriptorSupplier
      extends JobsBaseDescriptorSupplier {
    JobsFileDescriptorSupplier() {}
  }

  private static final class JobsMethodDescriptorSupplier
      extends JobsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JobsMethodDescriptorSupplier(String methodName) {
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
      synchronized (JobsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JobsFileDescriptorSupplier())
              .addMethod(getGetJobStatusMethod())
              .addMethod(getGetJobStatusUsingExternalJobUriMethod())
              .addMethod(getGetJobDetailsMethod())
              .addMethod(getGetJobErrorsMethod())
              .addMethod(getGetJobRunDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
