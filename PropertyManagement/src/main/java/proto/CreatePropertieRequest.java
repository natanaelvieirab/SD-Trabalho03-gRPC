// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: propertie.proto

package proto;

/**
 * Protobuf type {@code proto.CreatePropertieRequest}
 */
public  final class CreatePropertieRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.CreatePropertieRequest)
    CreatePropertieRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreatePropertieRequest.newBuilder() to construct.
  private CreatePropertieRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreatePropertieRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreatePropertieRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreatePropertieRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            proto.Propertie.Builder subBuilder = null;
            if (propertie_ != null) {
              subBuilder = propertie_.toBuilder();
            }
            propertie_ = input.readMessage(proto.Propertie.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(propertie_);
              propertie_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.PropertieOuterClass.internal_static_proto_CreatePropertieRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.PropertieOuterClass.internal_static_proto_CreatePropertieRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.CreatePropertieRequest.class, proto.CreatePropertieRequest.Builder.class);
  }

  public static final int PROPERTIE_FIELD_NUMBER = 1;
  private proto.Propertie propertie_;
  /**
   * <code>.proto.Propertie propertie = 1;</code>
   * @return Whether the propertie field is set.
   */
  public boolean hasPropertie() {
    return propertie_ != null;
  }
  /**
   * <code>.proto.Propertie propertie = 1;</code>
   * @return The propertie.
   */
  public proto.Propertie getPropertie() {
    return propertie_ == null ? proto.Propertie.getDefaultInstance() : propertie_;
  }
  /**
   * <code>.proto.Propertie propertie = 1;</code>
   */
  public proto.PropertieOrBuilder getPropertieOrBuilder() {
    return getPropertie();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (propertie_ != null) {
      output.writeMessage(1, getPropertie());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (propertie_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPropertie());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof proto.CreatePropertieRequest)) {
      return super.equals(obj);
    }
    proto.CreatePropertieRequest other = (proto.CreatePropertieRequest) obj;

    if (hasPropertie() != other.hasPropertie()) return false;
    if (hasPropertie()) {
      if (!getPropertie()
          .equals(other.getPropertie())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPropertie()) {
      hash = (37 * hash) + PROPERTIE_FIELD_NUMBER;
      hash = (53 * hash) + getPropertie().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto.CreatePropertieRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.CreatePropertieRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.CreatePropertieRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.CreatePropertieRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.CreatePropertieRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.CreatePropertieRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.CreatePropertieRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.CreatePropertieRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.CreatePropertieRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.CreatePropertieRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.CreatePropertieRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.CreatePropertieRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(proto.CreatePropertieRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code proto.CreatePropertieRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.CreatePropertieRequest)
      proto.CreatePropertieRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.PropertieOuterClass.internal_static_proto_CreatePropertieRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.PropertieOuterClass.internal_static_proto_CreatePropertieRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.CreatePropertieRequest.class, proto.CreatePropertieRequest.Builder.class);
    }

    // Construct using proto.CreatePropertieRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (propertieBuilder_ == null) {
        propertie_ = null;
      } else {
        propertie_ = null;
        propertieBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.PropertieOuterClass.internal_static_proto_CreatePropertieRequest_descriptor;
    }

    @java.lang.Override
    public proto.CreatePropertieRequest getDefaultInstanceForType() {
      return proto.CreatePropertieRequest.getDefaultInstance();
    }

    @java.lang.Override
    public proto.CreatePropertieRequest build() {
      proto.CreatePropertieRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.CreatePropertieRequest buildPartial() {
      proto.CreatePropertieRequest result = new proto.CreatePropertieRequest(this);
      if (propertieBuilder_ == null) {
        result.propertie_ = propertie_;
      } else {
        result.propertie_ = propertieBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof proto.CreatePropertieRequest) {
        return mergeFrom((proto.CreatePropertieRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto.CreatePropertieRequest other) {
      if (other == proto.CreatePropertieRequest.getDefaultInstance()) return this;
      if (other.hasPropertie()) {
        mergePropertie(other.getPropertie());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      proto.CreatePropertieRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto.CreatePropertieRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private proto.Propertie propertie_;
    private com.google.protobuf.SingleFieldBuilderV3<
        proto.Propertie, proto.Propertie.Builder, proto.PropertieOrBuilder> propertieBuilder_;
    /**
     * <code>.proto.Propertie propertie = 1;</code>
     * @return Whether the propertie field is set.
     */
    public boolean hasPropertie() {
      return propertieBuilder_ != null || propertie_ != null;
    }
    /**
     * <code>.proto.Propertie propertie = 1;</code>
     * @return The propertie.
     */
    public proto.Propertie getPropertie() {
      if (propertieBuilder_ == null) {
        return propertie_ == null ? proto.Propertie.getDefaultInstance() : propertie_;
      } else {
        return propertieBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto.Propertie propertie = 1;</code>
     */
    public Builder setPropertie(proto.Propertie value) {
      if (propertieBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        propertie_ = value;
        onChanged();
      } else {
        propertieBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.proto.Propertie propertie = 1;</code>
     */
    public Builder setPropertie(
        proto.Propertie.Builder builderForValue) {
      if (propertieBuilder_ == null) {
        propertie_ = builderForValue.build();
        onChanged();
      } else {
        propertieBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.proto.Propertie propertie = 1;</code>
     */
    public Builder mergePropertie(proto.Propertie value) {
      if (propertieBuilder_ == null) {
        if (propertie_ != null) {
          propertie_ =
            proto.Propertie.newBuilder(propertie_).mergeFrom(value).buildPartial();
        } else {
          propertie_ = value;
        }
        onChanged();
      } else {
        propertieBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.proto.Propertie propertie = 1;</code>
     */
    public Builder clearPropertie() {
      if (propertieBuilder_ == null) {
        propertie_ = null;
        onChanged();
      } else {
        propertie_ = null;
        propertieBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.proto.Propertie propertie = 1;</code>
     */
    public proto.Propertie.Builder getPropertieBuilder() {
      
      onChanged();
      return getPropertieFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto.Propertie propertie = 1;</code>
     */
    public proto.PropertieOrBuilder getPropertieOrBuilder() {
      if (propertieBuilder_ != null) {
        return propertieBuilder_.getMessageOrBuilder();
      } else {
        return propertie_ == null ?
            proto.Propertie.getDefaultInstance() : propertie_;
      }
    }
    /**
     * <code>.proto.Propertie propertie = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        proto.Propertie, proto.Propertie.Builder, proto.PropertieOrBuilder> 
        getPropertieFieldBuilder() {
      if (propertieBuilder_ == null) {
        propertieBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            proto.Propertie, proto.Propertie.Builder, proto.PropertieOrBuilder>(
                getPropertie(),
                getParentForChildren(),
                isClean());
        propertie_ = null;
      }
      return propertieBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto.CreatePropertieRequest)
  }

  // @@protoc_insertion_point(class_scope:proto.CreatePropertieRequest)
  private static final proto.CreatePropertieRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.CreatePropertieRequest();
  }

  public static proto.CreatePropertieRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreatePropertieRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreatePropertieRequest>() {
    @java.lang.Override
    public CreatePropertieRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreatePropertieRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreatePropertieRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreatePropertieRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.CreatePropertieRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

