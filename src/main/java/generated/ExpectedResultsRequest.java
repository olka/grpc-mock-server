package generated;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speechmockcontroller.proto

/**
 * Protobuf type {@code ExpectedResultsRequest}
 */
public  final class ExpectedResultsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ExpectedResultsRequest)
        ExpectedResultsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExpectedResultsRequest.newBuilder() to construct.
  private ExpectedResultsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExpectedResultsRequest() {
    expectedResult_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExpectedResultsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
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
          default: {
              done = true;
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              expectedResult_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            expectedResult_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        expectedResult_ = expectedResult_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return SpeechMockProto.internal_static_ExpectedResultsRequest_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return SpeechMockProto.internal_static_ExpectedResultsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ExpectedResultsRequest.class, ExpectedResultsRequest.Builder.class);
  }

  public static final int EXPECTEDRESULT_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList expectedResult_;
  /**
   * <code>repeated string expectedResult = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getExpectedResultList() {
    return expectedResult_;
  }
  /**
   * <code>repeated string expectedResult = 1;</code>
   */
  public int getExpectedResultCount() {
    return expectedResult_.size();
  }
  /**
   * <code>repeated string expectedResult = 1;</code>
   */
  public String getExpectedResult(int index) {
    return expectedResult_.get(index);
  }
  /**
   * <code>repeated string expectedResult = 1;</code>
   */
  public com.google.protobuf.ByteString
      getExpectedResultBytes(int index) {
    return expectedResult_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < expectedResult_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, expectedResult_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < expectedResult_.size(); i++) {
        dataSize += computeStringSizeNoTag(expectedResult_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getExpectedResultList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ExpectedResultsRequest)) {
      return super.equals(obj);
    }
    ExpectedResultsRequest other = (ExpectedResultsRequest) obj;

    boolean result = true;
    result = result && getExpectedResultList()
        .equals(other.getExpectedResultList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getExpectedResultCount() > 0) {
      hash = (37 * hash) + EXPECTEDRESULT_FIELD_NUMBER;
      hash = (53 * hash) + getExpectedResultList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ExpectedResultsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ExpectedResultsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ExpectedResultsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ExpectedResultsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ExpectedResultsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ExpectedResultsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ExpectedResultsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ExpectedResultsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ExpectedResultsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ExpectedResultsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ExpectedResultsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ExpectedResultsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ExpectedResultsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ExpectedResultsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ExpectedResultsRequest)
          ExpectedResultsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SpeechMockProto.internal_static_ExpectedResultsRequest_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SpeechMockProto.internal_static_ExpectedResultsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ExpectedResultsRequest.class, ExpectedResultsRequest.Builder.class);
    }

    // Construct using ExpectedResultsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      expectedResult_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return SpeechMockProto.internal_static_ExpectedResultsRequest_descriptor;
    }

    public ExpectedResultsRequest getDefaultInstanceForType() {
      return ExpectedResultsRequest.getDefaultInstance();
    }

    public ExpectedResultsRequest build() {
      ExpectedResultsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ExpectedResultsRequest buildPartial() {
      ExpectedResultsRequest result = new ExpectedResultsRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        expectedResult_ = expectedResult_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.expectedResult_ = expectedResult_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ExpectedResultsRequest) {
        return mergeFrom((ExpectedResultsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ExpectedResultsRequest other) {
      if (other == ExpectedResultsRequest.getDefaultInstance()) return this;
      if (!other.expectedResult_.isEmpty()) {
        if (expectedResult_.isEmpty()) {
          expectedResult_ = other.expectedResult_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureExpectedResultIsMutable();
          expectedResult_.addAll(other.expectedResult_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ExpectedResultsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ExpectedResultsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList expectedResult_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureExpectedResultIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        expectedResult_ = new com.google.protobuf.LazyStringArrayList(expectedResult_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string expectedResult = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getExpectedResultList() {
      return expectedResult_.getUnmodifiableView();
    }
    /**
     * <code>repeated string expectedResult = 1;</code>
     */
    public int getExpectedResultCount() {
      return expectedResult_.size();
    }
    /**
     * <code>repeated string expectedResult = 1;</code>
     */
    public String getExpectedResult(int index) {
      return expectedResult_.get(index);
    }
    /**
     * <code>repeated string expectedResult = 1;</code>
     */
    public com.google.protobuf.ByteString
        getExpectedResultBytes(int index) {
      return expectedResult_.getByteString(index);
    }
    /**
     * <code>repeated string expectedResult = 1;</code>
     */
    public Builder setExpectedResult(
        int index, String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureExpectedResultIsMutable();
      expectedResult_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string expectedResult = 1;</code>
     */
    public Builder addExpectedResult(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureExpectedResultIsMutable();
      expectedResult_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string expectedResult = 1;</code>
     */
    public Builder addAllExpectedResult(
        Iterable<String> values) {
      ensureExpectedResultIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, expectedResult_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string expectedResult = 1;</code>
     */
    public Builder clearExpectedResult() {
      expectedResult_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string expectedResult = 1;</code>
     */
    public Builder addExpectedResultBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureExpectedResultIsMutable();
      expectedResult_.add(value);
      onChanged();
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ExpectedResultsRequest)
  }

  // @@protoc_insertion_point(class_scope:ExpectedResultsRequest)
  private static final ExpectedResultsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ExpectedResultsRequest();
  }

  public static ExpectedResultsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExpectedResultsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ExpectedResultsRequest>() {
    public ExpectedResultsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ExpectedResultsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExpectedResultsRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ExpectedResultsRequest> getParserForType() {
    return PARSER;
  }

  public ExpectedResultsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

