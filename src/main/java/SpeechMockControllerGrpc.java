import generated.DummyRequest;
import generated.ExpectedResultsRequest;
import generated.ExpectedResultsResponse;
import generated.SpeechMockProto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.1)",
    comments = "Source: speechmockcontroller.proto")
public final class SpeechMockControllerGrpc {

  private SpeechMockControllerGrpc() {}

  public static final String SERVICE_NAME = "SpeechMockController";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ExpectedResultsRequest,
          ExpectedResultsResponse> METHOD_PUT_EXPECTED_RESULTS =
      io.grpc.MethodDescriptor.<ExpectedResultsRequest, ExpectedResultsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "SpeechMockController", "PutExpectedResults"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ExpectedResultsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ExpectedResultsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<DummyRequest,
      ExpectedResultsResponse> METHOD_GET_EXPECTED_RESULTS =
      io.grpc.MethodDescriptor.<DummyRequest, ExpectedResultsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "SpeechMockController", "GetExpectedResults"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              DummyRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              ExpectedResultsResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpeechMockControllerStub newStub(io.grpc.Channel channel) {
    return new SpeechMockControllerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpeechMockControllerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SpeechMockControllerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpeechMockControllerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SpeechMockControllerFutureStub(channel);
  }

  /**
   */
  public static abstract class SpeechMockControllerImplBase implements io.grpc.BindableService {

    /**
     */
    public void putExpectedResults(ExpectedResultsRequest request,
        io.grpc.stub.StreamObserver<ExpectedResultsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PUT_EXPECTED_RESULTS, responseObserver);
    }

    /**
     */
    public void getExpectedResults(DummyRequest request,
        io.grpc.stub.StreamObserver<ExpectedResultsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_EXPECTED_RESULTS, responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_PUT_EXPECTED_RESULTS,
            asyncUnaryCall(
              new MethodHandlers<
                ExpectedResultsRequest,
                ExpectedResultsResponse>(
                  this, METHODID_PUT_EXPECTED_RESULTS)))
          .addMethod(
            METHOD_GET_EXPECTED_RESULTS,
            asyncUnaryCall(
              new MethodHandlers<
                DummyRequest,
                ExpectedResultsResponse>(
                  this, METHODID_GET_EXPECTED_RESULTS)))
          .build();
    }
  }

  /**
   */
  public static final class SpeechMockControllerStub extends io.grpc.stub.AbstractStub<SpeechMockControllerStub> {
    private SpeechMockControllerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeechMockControllerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SpeechMockControllerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeechMockControllerStub(channel, callOptions);
    }

    /**
     */
    public void putExpectedResults(ExpectedResultsRequest request,
        io.grpc.stub.StreamObserver<ExpectedResultsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PUT_EXPECTED_RESULTS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getExpectedResults(DummyRequest request,
        io.grpc.stub.StreamObserver<ExpectedResultsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_EXPECTED_RESULTS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SpeechMockControllerBlockingStub extends io.grpc.stub.AbstractStub<SpeechMockControllerBlockingStub> {
    private SpeechMockControllerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeechMockControllerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SpeechMockControllerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeechMockControllerBlockingStub(channel, callOptions);
    }

    /**
     */
    public ExpectedResultsResponse putExpectedResults(ExpectedResultsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PUT_EXPECTED_RESULTS, getCallOptions(), request);
    }

    /**
     */
    public ExpectedResultsResponse getExpectedResults(DummyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_EXPECTED_RESULTS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SpeechMockControllerFutureStub extends io.grpc.stub.AbstractStub<SpeechMockControllerFutureStub> {
    private SpeechMockControllerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SpeechMockControllerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SpeechMockControllerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SpeechMockControllerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ExpectedResultsResponse> putExpectedResults(
        ExpectedResultsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PUT_EXPECTED_RESULTS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ExpectedResultsResponse> getExpectedResults(
        DummyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_EXPECTED_RESULTS, getCallOptions()), request);
    }
  }

  private static final int METHODID_PUT_EXPECTED_RESULTS = 0;
  private static final int METHODID_GET_EXPECTED_RESULTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SpeechMockControllerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SpeechMockControllerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUT_EXPECTED_RESULTS:
          serviceImpl.putExpectedResults((ExpectedResultsRequest) request,
              (io.grpc.stub.StreamObserver<ExpectedResultsResponse>) responseObserver);
          break;
        case METHODID_GET_EXPECTED_RESULTS:
          serviceImpl.getExpectedResults((DummyRequest) request,
              (io.grpc.stub.StreamObserver<ExpectedResultsResponse>) responseObserver);
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

  private static final class SpeechMockControllerDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return SpeechMockProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SpeechMockControllerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SpeechMockControllerDescriptorSupplier())
              .addMethod(METHOD_PUT_EXPECTED_RESULTS)
              .addMethod(METHOD_GET_EXPECTED_RESULTS)
              .build();
        }
      }
    }
    return result;
  }
}
