// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface CreateStoredInfoTypeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.CreateStoredInfoTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id or
   * organizations/my-org-id.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id or
   * organizations/my-org-id.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Configuration of the storedInfoType to create.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
   */
  boolean hasConfig();
  /**
   * <pre>
   * Configuration of the storedInfoType to create.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
   */
  com.google.privacy.dlp.v2.StoredInfoTypeConfig getConfig();
  /**
   * <pre>
   * Configuration of the storedInfoType to create.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 2;</code>
   */
  com.google.privacy.dlp.v2.StoredInfoTypeConfigOrBuilder getConfigOrBuilder();

  /**
   * <pre>
   * The storedInfoType ID can contain uppercase and lowercase letters,
   * numbers, and hyphens; that is, it must match the regular
   * expression: `[a-zA-Z&#92;&#92;d-]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * </pre>
   *
   * <code>string stored_info_type_id = 3;</code>
   */
  java.lang.String getStoredInfoTypeId();
  /**
   * <pre>
   * The storedInfoType ID can contain uppercase and lowercase letters,
   * numbers, and hyphens; that is, it must match the regular
   * expression: `[a-zA-Z&#92;&#92;d-]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * </pre>
   *
   * <code>string stored_info_type_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getStoredInfoTypeIdBytes();
}
