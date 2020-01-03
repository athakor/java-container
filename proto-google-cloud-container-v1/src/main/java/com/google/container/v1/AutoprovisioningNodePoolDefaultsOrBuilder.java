/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface AutoprovisioningNodePoolDefaultsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.AutoprovisioningNodePoolDefaults)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Scopes that are used by NAP when creating node pools. If oauth_scopes are
   * specified, service_account should be empty.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 1;</code>
   *
   * @return A list containing the oauthScopes.
   */
  java.util.List<java.lang.String> getOauthScopesList();
  /**
   *
   *
   * <pre>
   * Scopes that are used by NAP when creating node pools. If oauth_scopes are
   * specified, service_account should be empty.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 1;</code>
   *
   * @return The count of oauthScopes.
   */
  int getOauthScopesCount();
  /**
   *
   *
   * <pre>
   * Scopes that are used by NAP when creating node pools. If oauth_scopes are
   * specified, service_account should be empty.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The oauthScopes at the given index.
   */
  java.lang.String getOauthScopes(int index);
  /**
   *
   *
   * <pre>
   * Scopes that are used by NAP when creating node pools. If oauth_scopes are
   * specified, service_account should be empty.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the oauthScopes at the given index.
   */
  com.google.protobuf.ByteString getOauthScopesBytes(int index);

  /**
   *
   *
   * <pre>
   * The Google Cloud Platform Service Account to be used by the node VMs. If
   * service_account is specified, scopes should be empty.
   * </pre>
   *
   * <code>string service_account = 2;</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * The Google Cloud Platform Service Account to be used by the node VMs. If
   * service_account is specified, scopes should be empty.
   * </pre>
   *
   * <code>string service_account = 2;</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();
}