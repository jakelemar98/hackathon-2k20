// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: users.proto

package com.grpc.services.users;

public final class Users {
  private Users() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013users.proto\"\033\n\013UserRequest\022\014\n\004body\030\001 \001" +
      "(\t\";\n\014UserResponse\022\014\n\004body\030\001 \001(\t\022\r\n\005toke" +
      "n\030\002 \001(\t\022\016\n\006status\030\003 \001(\0052\214\001\n\013UserService\022" +
      "*\n\013GetUserData\022\014.UserRequest\032\r.UserRespo" +
      "nse\022\'\n\010GetRoute\022\014.UserRequest\032\r.UserResp" +
      "onse\022(\n\tGetRoutes\022\014.UserRequest\032\r.UserRe" +
      "sponseB\033\n\027com.grpc.services.usersP\001b\006pro" +
      "to3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_UserRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserRequest_descriptor,
        new java.lang.String[] { "Body", });
    internal_static_UserResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_UserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserResponse_descriptor,
        new java.lang.String[] { "Body", "Token", "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
