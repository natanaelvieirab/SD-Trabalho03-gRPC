package proto;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: propertie.proto")
public final class PropertieServiceGrpc {

  private PropertieServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.PropertieService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.CreatePropertieRequest,
      proto.CreatePropertieResponse> getCreatePropertieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePropertie",
      requestType = proto.CreatePropertieRequest.class,
      responseType = proto.CreatePropertieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.CreatePropertieRequest,
      proto.CreatePropertieResponse> getCreatePropertieMethod() {
    io.grpc.MethodDescriptor<proto.CreatePropertieRequest, proto.CreatePropertieResponse> getCreatePropertieMethod;
    if ((getCreatePropertieMethod = PropertieServiceGrpc.getCreatePropertieMethod) == null) {
      synchronized (PropertieServiceGrpc.class) {
        if ((getCreatePropertieMethod = PropertieServiceGrpc.getCreatePropertieMethod) == null) {
          PropertieServiceGrpc.getCreatePropertieMethod = getCreatePropertieMethod = 
              io.grpc.MethodDescriptor.<proto.CreatePropertieRequest, proto.CreatePropertieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.PropertieService", "CreatePropertie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.CreatePropertieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.CreatePropertieResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PropertieServiceMethodDescriptorSupplier("CreatePropertie"))
                  .build();
          }
        }
     }
     return getCreatePropertieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.DeletePropertieRequest,
      proto.DeletePropertieResponse> getDeletePropertieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePropertie",
      requestType = proto.DeletePropertieRequest.class,
      responseType = proto.DeletePropertieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.DeletePropertieRequest,
      proto.DeletePropertieResponse> getDeletePropertieMethod() {
    io.grpc.MethodDescriptor<proto.DeletePropertieRequest, proto.DeletePropertieResponse> getDeletePropertieMethod;
    if ((getDeletePropertieMethod = PropertieServiceGrpc.getDeletePropertieMethod) == null) {
      synchronized (PropertieServiceGrpc.class) {
        if ((getDeletePropertieMethod = PropertieServiceGrpc.getDeletePropertieMethod) == null) {
          PropertieServiceGrpc.getDeletePropertieMethod = getDeletePropertieMethod = 
              io.grpc.MethodDescriptor.<proto.DeletePropertieRequest, proto.DeletePropertieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.PropertieService", "DeletePropertie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.DeletePropertieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.DeletePropertieResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PropertieServiceMethodDescriptorSupplier("DeletePropertie"))
                  .build();
          }
        }
     }
     return getDeletePropertieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.GetPropertieRequest,
      proto.GetPropertieResponse> getGetPropertieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPropertie",
      requestType = proto.GetPropertieRequest.class,
      responseType = proto.GetPropertieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.GetPropertieRequest,
      proto.GetPropertieResponse> getGetPropertieMethod() {
    io.grpc.MethodDescriptor<proto.GetPropertieRequest, proto.GetPropertieResponse> getGetPropertieMethod;
    if ((getGetPropertieMethod = PropertieServiceGrpc.getGetPropertieMethod) == null) {
      synchronized (PropertieServiceGrpc.class) {
        if ((getGetPropertieMethod = PropertieServiceGrpc.getGetPropertieMethod) == null) {
          PropertieServiceGrpc.getGetPropertieMethod = getGetPropertieMethod = 
              io.grpc.MethodDescriptor.<proto.GetPropertieRequest, proto.GetPropertieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.PropertieService", "GetPropertie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.GetPropertieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.GetPropertieResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PropertieServiceMethodDescriptorSupplier("GetPropertie"))
                  .build();
          }
        }
     }
     return getGetPropertieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.ListAllPropertieRequest,
      proto.ListAllPropertieResponse> getListAllPropertieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAllPropertie",
      requestType = proto.ListAllPropertieRequest.class,
      responseType = proto.ListAllPropertieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ListAllPropertieRequest,
      proto.ListAllPropertieResponse> getListAllPropertieMethod() {
    io.grpc.MethodDescriptor<proto.ListAllPropertieRequest, proto.ListAllPropertieResponse> getListAllPropertieMethod;
    if ((getListAllPropertieMethod = PropertieServiceGrpc.getListAllPropertieMethod) == null) {
      synchronized (PropertieServiceGrpc.class) {
        if ((getListAllPropertieMethod = PropertieServiceGrpc.getListAllPropertieMethod) == null) {
          PropertieServiceGrpc.getListAllPropertieMethod = getListAllPropertieMethod = 
              io.grpc.MethodDescriptor.<proto.ListAllPropertieRequest, proto.ListAllPropertieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.PropertieService", "ListAllPropertie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ListAllPropertieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ListAllPropertieResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PropertieServiceMethodDescriptorSupplier("ListAllPropertie"))
                  .build();
          }
        }
     }
     return getListAllPropertieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.UpdatePropertieRequest,
      proto.UpdatePropertieResponse> getUpdatePropertieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePropertie",
      requestType = proto.UpdatePropertieRequest.class,
      responseType = proto.UpdatePropertieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.UpdatePropertieRequest,
      proto.UpdatePropertieResponse> getUpdatePropertieMethod() {
    io.grpc.MethodDescriptor<proto.UpdatePropertieRequest, proto.UpdatePropertieResponse> getUpdatePropertieMethod;
    if ((getUpdatePropertieMethod = PropertieServiceGrpc.getUpdatePropertieMethod) == null) {
      synchronized (PropertieServiceGrpc.class) {
        if ((getUpdatePropertieMethod = PropertieServiceGrpc.getUpdatePropertieMethod) == null) {
          PropertieServiceGrpc.getUpdatePropertieMethod = getUpdatePropertieMethod = 
              io.grpc.MethodDescriptor.<proto.UpdatePropertieRequest, proto.UpdatePropertieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.PropertieService", "UpdatePropertie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.UpdatePropertieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.UpdatePropertieResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PropertieServiceMethodDescriptorSupplier("UpdatePropertie"))
                  .build();
          }
        }
     }
     return getUpdatePropertieMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PropertieServiceStub newStub(io.grpc.Channel channel) {
    return new PropertieServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PropertieServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PropertieServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PropertieServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PropertieServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PropertieServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createPropertie(proto.CreatePropertieRequest request,
        io.grpc.stub.StreamObserver<proto.CreatePropertieResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreatePropertieMethod(), responseObserver);
    }

    /**
     */
    public void deletePropertie(proto.DeletePropertieRequest request,
        io.grpc.stub.StreamObserver<proto.DeletePropertieResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePropertieMethod(), responseObserver);
    }

    /**
     */
    public void getPropertie(proto.GetPropertieRequest request,
        io.grpc.stub.StreamObserver<proto.GetPropertieResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPropertieMethod(), responseObserver);
    }

    /**
     */
    public void listAllPropertie(proto.ListAllPropertieRequest request,
        io.grpc.stub.StreamObserver<proto.ListAllPropertieResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAllPropertieMethod(), responseObserver);
    }

    /**
     */
    public void updatePropertie(proto.UpdatePropertieRequest request,
        io.grpc.stub.StreamObserver<proto.UpdatePropertieResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePropertieMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatePropertieMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.CreatePropertieRequest,
                proto.CreatePropertieResponse>(
                  this, METHODID_CREATE_PROPERTIE)))
          .addMethod(
            getDeletePropertieMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.DeletePropertieRequest,
                proto.DeletePropertieResponse>(
                  this, METHODID_DELETE_PROPERTIE)))
          .addMethod(
            getGetPropertieMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.GetPropertieRequest,
                proto.GetPropertieResponse>(
                  this, METHODID_GET_PROPERTIE)))
          .addMethod(
            getListAllPropertieMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.ListAllPropertieRequest,
                proto.ListAllPropertieResponse>(
                  this, METHODID_LIST_ALL_PROPERTIE)))
          .addMethod(
            getUpdatePropertieMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.UpdatePropertieRequest,
                proto.UpdatePropertieResponse>(
                  this, METHODID_UPDATE_PROPERTIE)))
          .build();
    }
  }

  /**
   */
  public static final class PropertieServiceStub extends io.grpc.stub.AbstractStub<PropertieServiceStub> {
    private PropertieServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PropertieServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PropertieServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PropertieServiceStub(channel, callOptions);
    }

    /**
     */
    public void createPropertie(proto.CreatePropertieRequest request,
        io.grpc.stub.StreamObserver<proto.CreatePropertieResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePropertieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePropertie(proto.DeletePropertieRequest request,
        io.grpc.stub.StreamObserver<proto.DeletePropertieResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePropertieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPropertie(proto.GetPropertieRequest request,
        io.grpc.stub.StreamObserver<proto.GetPropertieResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPropertieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAllPropertie(proto.ListAllPropertieRequest request,
        io.grpc.stub.StreamObserver<proto.ListAllPropertieResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAllPropertieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePropertie(proto.UpdatePropertieRequest request,
        io.grpc.stub.StreamObserver<proto.UpdatePropertieResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePropertieMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PropertieServiceBlockingStub extends io.grpc.stub.AbstractStub<PropertieServiceBlockingStub> {
    private PropertieServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PropertieServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PropertieServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PropertieServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.CreatePropertieResponse createPropertie(proto.CreatePropertieRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreatePropertieMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.DeletePropertieResponse deletePropertie(proto.DeletePropertieRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeletePropertieMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.GetPropertieResponse getPropertie(proto.GetPropertieRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPropertieMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.ListAllPropertieResponse listAllPropertie(proto.ListAllPropertieRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAllPropertieMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.UpdatePropertieResponse updatePropertie(proto.UpdatePropertieRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePropertieMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PropertieServiceFutureStub extends io.grpc.stub.AbstractStub<PropertieServiceFutureStub> {
    private PropertieServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PropertieServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PropertieServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PropertieServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.CreatePropertieResponse> createPropertie(
        proto.CreatePropertieRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatePropertieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.DeletePropertieResponse> deletePropertie(
        proto.DeletePropertieRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePropertieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.GetPropertieResponse> getPropertie(
        proto.GetPropertieRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPropertieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.ListAllPropertieResponse> listAllPropertie(
        proto.ListAllPropertieRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAllPropertieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.UpdatePropertieResponse> updatePropertie(
        proto.UpdatePropertieRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePropertieMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PROPERTIE = 0;
  private static final int METHODID_DELETE_PROPERTIE = 1;
  private static final int METHODID_GET_PROPERTIE = 2;
  private static final int METHODID_LIST_ALL_PROPERTIE = 3;
  private static final int METHODID_UPDATE_PROPERTIE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PropertieServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PropertieServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PROPERTIE:
          serviceImpl.createPropertie((proto.CreatePropertieRequest) request,
              (io.grpc.stub.StreamObserver<proto.CreatePropertieResponse>) responseObserver);
          break;
        case METHODID_DELETE_PROPERTIE:
          serviceImpl.deletePropertie((proto.DeletePropertieRequest) request,
              (io.grpc.stub.StreamObserver<proto.DeletePropertieResponse>) responseObserver);
          break;
        case METHODID_GET_PROPERTIE:
          serviceImpl.getPropertie((proto.GetPropertieRequest) request,
              (io.grpc.stub.StreamObserver<proto.GetPropertieResponse>) responseObserver);
          break;
        case METHODID_LIST_ALL_PROPERTIE:
          serviceImpl.listAllPropertie((proto.ListAllPropertieRequest) request,
              (io.grpc.stub.StreamObserver<proto.ListAllPropertieResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROPERTIE:
          serviceImpl.updatePropertie((proto.UpdatePropertieRequest) request,
              (io.grpc.stub.StreamObserver<proto.UpdatePropertieResponse>) responseObserver);
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

  private static abstract class PropertieServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PropertieServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.PropertieOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PropertieService");
    }
  }

  private static final class PropertieServiceFileDescriptorSupplier
      extends PropertieServiceBaseDescriptorSupplier {
    PropertieServiceFileDescriptorSupplier() {}
  }

  private static final class PropertieServiceMethodDescriptorSupplier
      extends PropertieServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PropertieServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PropertieServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PropertieServiceFileDescriptorSupplier())
              .addMethod(getCreatePropertieMethod())
              .addMethod(getDeletePropertieMethod())
              .addMethod(getGetPropertieMethod())
              .addMethod(getListAllPropertieMethod())
              .addMethod(getUpdatePropertieMethod())
              .build();
        }
      }
    }
    return result;
  }
}
