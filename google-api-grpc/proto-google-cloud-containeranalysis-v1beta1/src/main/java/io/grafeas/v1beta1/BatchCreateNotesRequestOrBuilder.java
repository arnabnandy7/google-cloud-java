// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/grafeas/grafeas.proto

package io.grafeas.v1beta1;

public interface BatchCreateNotesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.BatchCreateNotesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the notes are to be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the notes are to be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The notes to create.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1beta1.Note&gt; notes = 2;</code>
   */
  int getNotesCount();
  /**
   * <pre>
   * The notes to create.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1beta1.Note&gt; notes = 2;</code>
   */
  boolean containsNotes(
      java.lang.String key);
  /**
   * Use {@link #getNotesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.grafeas.v1beta1.Note>
  getNotes();
  /**
   * <pre>
   * The notes to create.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1beta1.Note&gt; notes = 2;</code>
   */
  java.util.Map<java.lang.String, io.grafeas.v1beta1.Note>
  getNotesMap();
  /**
   * <pre>
   * The notes to create.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1beta1.Note&gt; notes = 2;</code>
   */

  io.grafeas.v1beta1.Note getNotesOrDefault(
      java.lang.String key,
      io.grafeas.v1beta1.Note defaultValue);
  /**
   * <pre>
   * The notes to create.
   * </pre>
   *
   * <code>map&lt;string, .grafeas.v1beta1.Note&gt; notes = 2;</code>
   */

  io.grafeas.v1beta1.Note getNotesOrThrow(
      java.lang.String key);
}
