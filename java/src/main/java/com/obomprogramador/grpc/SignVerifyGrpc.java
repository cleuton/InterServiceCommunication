package com.obomprogramador.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: signature.proto")
public final class SignVerifyGrpc {

  private SignVerifyGrpc() {}

  public static final String SERVICE_NAME = "signverify.SignVerify";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.obomprogramador.grpc.SignRequest,
      com.obomprogramador.grpc.SignResponse> getSignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sign",
      requestType = com.obomprogramador.grpc.SignRequest.class,
      responseType = com.obomprogramador.grpc.SignResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.obomprogramador.grpc.SignRequest,
      com.obomprogramador.grpc.SignResponse> getSignMethod() {
    io.grpc.MethodDescriptor<com.obomprogramador.grpc.SignRequest, com.obomprogramador.grpc.SignResponse> getSignMethod;
    if ((getSignMethod = SignVerifyGrpc.getSignMethod) == null) {
      synchronized (SignVerifyGrpc.class) {
        if ((getSignMethod = SignVerifyGrpc.getSignMethod) == null) {
          SignVerifyGrpc.getSignMethod = getSignMethod =
              io.grpc.MethodDescriptor.<com.obomprogramador.grpc.SignRequest, com.obomprogramador.grpc.SignResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.obomprogramador.grpc.SignRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.obomprogramador.grpc.SignResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SignVerifyMethodDescriptorSupplier("Sign"))
              .build();
        }
      }
    }
    return getSignMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SignVerifyStub newStub(io.grpc.Channel channel) {
    return new SignVerifyStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SignVerifyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SignVerifyBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SignVerifyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SignVerifyFutureStub(channel);
  }

  /**
   */
  public static abstract class SignVerifyImplBase implements io.grpc.BindableService {

    /**
     */
    public void sign(com.obomprogramador.grpc.SignRequest request,
        io.grpc.stub.StreamObserver<com.obomprogramador.grpc.SignResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSignMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.obomprogramador.grpc.SignRequest,
                com.obomprogramador.grpc.SignResponse>(
                  this, METHODID_SIGN)))
          .build();
    }
  }

  /**
   */
  public static final class SignVerifyStub extends io.grpc.stub.AbstractStub<SignVerifyStub> {
    private SignVerifyStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SignVerifyStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SignVerifyStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SignVerifyStub(channel, callOptions);
    }

    /**
     */
    public void sign(com.obomprogramador.grpc.SignRequest request,
        io.grpc.stub.StreamObserver<com.obomprogramador.grpc.SignResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SignVerifyBlockingStub extends io.grpc.stub.AbstractStub<SignVerifyBlockingStub> {
    private SignVerifyBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SignVerifyBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SignVerifyBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SignVerifyBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.obomprogramador.grpc.SignResponse sign(com.obomprogramador.grpc.SignRequest request) {
      return blockingUnaryCall(
          getChannel(), getSignMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SignVerifyFutureStub extends io.grpc.stub.AbstractStub<SignVerifyFutureStub> {
    private SignVerifyFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SignVerifyFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SignVerifyFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SignVerifyFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.obomprogramador.grpc.SignResponse> sign(
        com.obomprogramador.grpc.SignRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSignMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIGN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SignVerifyImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SignVerifyImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIGN:
          serviceImpl.sign((com.obomprogramador.grpc.SignRequest) request,
              (io.grpc.stub.StreamObserver<com.obomprogramador.grpc.SignResponse>) responseObserver);
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

  private static abstract class SignVerifyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SignVerifyBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.obomprogramador.grpc.SignVerifyClient.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SignVerify");
    }
  }

  private static final class SignVerifyFileDescriptorSupplier
      extends SignVerifyBaseDescriptorSupplier {
    SignVerifyFileDescriptorSupplier() {}
  }

  private static final class SignVerifyMethodDescriptorSupplier
      extends SignVerifyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SignVerifyMethodDescriptorSupplier(String methodName) {
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
      synchronized (SignVerifyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SignVerifyFileDescriptorSupplier())
              .addMethod(getSignMethod())
              .build();
        }
      }
    }
    return result;
  }
}
