// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/source/source.proto

package io.grafeas.v1beta1.source;

public interface CloudRepoSourceContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.source.CloudRepoSourceContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the repo.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.RepoId repo_id = 1;</code>
   */
  boolean hasRepoId();
  /**
   * <pre>
   * The ID of the repo.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.RepoId repo_id = 1;</code>
   */
  io.grafeas.v1beta1.source.RepoId getRepoId();
  /**
   * <pre>
   * The ID of the repo.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.RepoId repo_id = 1;</code>
   */
  io.grafeas.v1beta1.source.RepoIdOrBuilder getRepoIdOrBuilder();

  /**
   * <pre>
   * A revision ID.
   * </pre>
   *
   * <code>string revision_id = 2;</code>
   */
  java.lang.String getRevisionId();
  /**
   * <pre>
   * A revision ID.
   * </pre>
   *
   * <code>string revision_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getRevisionIdBytes();

  /**
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.AliasContext alias_context = 3;</code>
   */
  boolean hasAliasContext();
  /**
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.AliasContext alias_context = 3;</code>
   */
  io.grafeas.v1beta1.source.AliasContext getAliasContext();
  /**
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.grafeas.v1beta1.source.AliasContext alias_context = 3;</code>
   */
  io.grafeas.v1beta1.source.AliasContextOrBuilder getAliasContextOrBuilder();

  public io.grafeas.v1beta1.source.CloudRepoSourceContext.RevisionCase getRevisionCase();
}
