package io.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * Service interface. Defines request parameters and corresponding results
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.2.0)",
    comments = "Source: GRPCInfomation.proto")
public final class InfoRpcServiceGrpc {

  private InfoRpcServiceGrpc() {}

  public static final String SERVICE_NAME = "InfoRpcService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.GRPCInfomation.InfoRpcRequest,
      io.grpc.GRPCInfomation.InfoRpcResponse> METHOD_TRANSFER_INFORMATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "InfoRpcService", "transferInformation"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.GRPCInfomation.InfoRpcRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.GRPCInfomation.InfoRpcResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InfoRpcServiceStub newStub(io.grpc.Channel channel) {
    return new InfoRpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InfoRpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InfoRpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static InfoRpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InfoRpcServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service interface. Defines request parameters and corresponding results
   * </pre>
   */
  public static abstract class InfoRpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void transferInformation(io.grpc.GRPCInfomation.InfoRpcRequest request,
        io.grpc.stub.StreamObserver<io.grpc.GRPCInfomation.InfoRpcResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TRANSFER_INFORMATION, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_TRANSFER_INFORMATION,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.GRPCInfomation.InfoRpcRequest,
                io.grpc.GRPCInfomation.InfoRpcResponse>(
                  this, METHODID_TRANSFER_INFORMATION)))
          .build();
    }
  }

  /**
   * <pre>
   * Service interface. Defines request parameters and corresponding results
   * </pre>
   */
  public static final class InfoRpcServiceStub extends io.grpc.stub.AbstractStub<InfoRpcServiceStub> {
    private InfoRpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InfoRpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InfoRpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InfoRpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void transferInformation(io.grpc.GRPCInfomation.InfoRpcRequest request,
        io.grpc.stub.StreamObserver<io.grpc.GRPCInfomation.InfoRpcResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TRANSFER_INFORMATION, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service interface. Defines request parameters and corresponding results
   * </pre>
   */
  public static final class InfoRpcServiceBlockingStub extends io.grpc.stub.AbstractStub<InfoRpcServiceBlockingStub> {
    private InfoRpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InfoRpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InfoRpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InfoRpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.GRPCInfomation.InfoRpcResponse transferInformation(io.grpc.GRPCInfomation.InfoRpcRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TRANSFER_INFORMATION, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service interface. Defines request parameters and corresponding results
   * </pre>
   */
  public static final class InfoRpcServiceFutureStub extends io.grpc.stub.AbstractStub<InfoRpcServiceFutureStub> {
    private InfoRpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InfoRpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InfoRpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InfoRpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.GRPCInfomation.InfoRpcResponse> transferInformation(
        io.grpc.GRPCInfomation.InfoRpcRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TRANSFER_INFORMATION, getCallOptions()), request);
    }
  }

  private static final int METHODID_TRANSFER_INFORMATION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InfoRpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InfoRpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRANSFER_INFORMATION:
          serviceImpl.transferInformation((io.grpc.GRPCInfomation.InfoRpcRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.GRPCInfomation.InfoRpcResponse>) responseObserver);
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

  private static final class InfoRpcServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.GRPCInfomation.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (InfoRpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InfoRpcServiceDescriptorSupplier())
              .addMethod(METHOD_TRANSFER_INFORMATION)
              .build();
        }
      }
    }
    return result;
  }
}
