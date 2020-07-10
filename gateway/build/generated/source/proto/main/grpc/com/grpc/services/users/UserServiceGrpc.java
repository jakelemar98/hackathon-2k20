package com.grpc.services.users;

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
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: users.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.services.users.UserRequest,
      com.grpc.services.users.UserResponse> getGetUserDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserData",
      requestType = com.grpc.services.users.UserRequest.class,
      responseType = com.grpc.services.users.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.services.users.UserRequest,
      com.grpc.services.users.UserResponse> getGetUserDataMethod() {
    io.grpc.MethodDescriptor<com.grpc.services.users.UserRequest, com.grpc.services.users.UserResponse> getGetUserDataMethod;
    if ((getGetUserDataMethod = UserServiceGrpc.getGetUserDataMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserDataMethod = UserServiceGrpc.getGetUserDataMethod) == null) {
          UserServiceGrpc.getGetUserDataMethod = getGetUserDataMethod = 
              io.grpc.MethodDescriptor.<com.grpc.services.users.UserRequest, com.grpc.services.users.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "GetUserData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.services.users.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.services.users.UserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUserData"))
                  .build();
          }
        }
     }
     return getGetUserDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.services.users.UserRequest,
      com.grpc.services.users.UserResponse> getGetRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRoute",
      requestType = com.grpc.services.users.UserRequest.class,
      responseType = com.grpc.services.users.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.services.users.UserRequest,
      com.grpc.services.users.UserResponse> getGetRouteMethod() {
    io.grpc.MethodDescriptor<com.grpc.services.users.UserRequest, com.grpc.services.users.UserResponse> getGetRouteMethod;
    if ((getGetRouteMethod = UserServiceGrpc.getGetRouteMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetRouteMethod = UserServiceGrpc.getGetRouteMethod) == null) {
          UserServiceGrpc.getGetRouteMethod = getGetRouteMethod = 
              io.grpc.MethodDescriptor.<com.grpc.services.users.UserRequest, com.grpc.services.users.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "GetRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.services.users.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.services.users.UserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetRoute"))
                  .build();
          }
        }
     }
     return getGetRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.services.users.UserRequest,
      com.grpc.services.users.UserResponse> getGetRoutesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRoutes",
      requestType = com.grpc.services.users.UserRequest.class,
      responseType = com.grpc.services.users.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.services.users.UserRequest,
      com.grpc.services.users.UserResponse> getGetRoutesMethod() {
    io.grpc.MethodDescriptor<com.grpc.services.users.UserRequest, com.grpc.services.users.UserResponse> getGetRoutesMethod;
    if ((getGetRoutesMethod = UserServiceGrpc.getGetRoutesMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetRoutesMethod = UserServiceGrpc.getGetRoutesMethod) == null) {
          UserServiceGrpc.getGetRoutesMethod = getGetRoutesMethod = 
              io.grpc.MethodDescriptor.<com.grpc.services.users.UserRequest, com.grpc.services.users.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "GetRoutes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.services.users.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.services.users.UserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetRoutes"))
                  .build();
          }
        }
     }
     return getGetRoutesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUserData(com.grpc.services.users.UserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.services.users.UserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserDataMethod(), responseObserver);
    }

    /**
     */
    public void getRoute(com.grpc.services.users.UserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.services.users.UserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRouteMethod(), responseObserver);
    }

    /**
     */
    public void getRoutes(com.grpc.services.users.UserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.services.users.UserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRoutesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.services.users.UserRequest,
                com.grpc.services.users.UserResponse>(
                  this, METHODID_GET_USER_DATA)))
          .addMethod(
            getGetRouteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.services.users.UserRequest,
                com.grpc.services.users.UserResponse>(
                  this, METHODID_GET_ROUTE)))
          .addMethod(
            getGetRoutesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.services.users.UserRequest,
                com.grpc.services.users.UserResponse>(
                  this, METHODID_GET_ROUTES)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUserData(com.grpc.services.users.UserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.services.users.UserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRoute(com.grpc.services.users.UserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.services.users.UserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRoutes(com.grpc.services.users.UserRequest request,
        io.grpc.stub.StreamObserver<com.grpc.services.users.UserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRoutesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.services.users.UserResponse getUserData(com.grpc.services.users.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.services.users.UserResponse getRoute(com.grpc.services.users.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRouteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.services.users.UserResponse getRoutes(com.grpc.services.users.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRoutesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.services.users.UserResponse> getUserData(
        com.grpc.services.users.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.services.users.UserResponse> getRoute(
        com.grpc.services.users.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRouteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.services.users.UserResponse> getRoutes(
        com.grpc.services.users.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRoutesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_DATA = 0;
  private static final int METHODID_GET_ROUTE = 1;
  private static final int METHODID_GET_ROUTES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_DATA:
          serviceImpl.getUserData((com.grpc.services.users.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.services.users.UserResponse>) responseObserver);
          break;
        case METHODID_GET_ROUTE:
          serviceImpl.getRoute((com.grpc.services.users.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.services.users.UserResponse>) responseObserver);
          break;
        case METHODID_GET_ROUTES:
          serviceImpl.getRoutes((com.grpc.services.users.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.services.users.UserResponse>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.services.users.Users.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getGetUserDataMethod())
              .addMethod(getGetRouteMethod())
              .addMethod(getGetRoutesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
