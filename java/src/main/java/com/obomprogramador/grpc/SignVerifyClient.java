// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: signature.proto

package com.obomprogramador.grpc;

public final class SignVerifyClient {
  private SignVerifyClient() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_signverify_SignRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_signverify_SignRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_signverify_SignResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_signverify_SignResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017signature.proto\022\nsignverify\"\033\n\013SignReq" +
      "uest\022\014\n\004text\030\001 \001(\t\"!\n\014SignResponse\022\021\n\tsi" +
      "gnature\030\001 \001(\t2I\n\nSignVerify\022;\n\004Sign\022\027.si" +
      "gnverify.SignRequest\032\030.signverify.SignRe" +
      "sponse\"\000B4\n\030com.obomprogramador.grpcB\020Si" +
      "gnVerifyClientP\001\242\002\003SVCb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_signverify_SignRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_signverify_SignRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_signverify_SignRequest_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_signverify_SignResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_signverify_SignResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_signverify_SignResponse_descriptor,
        new java.lang.String[] { "Signature", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
