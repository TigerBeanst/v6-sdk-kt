// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.PubSftpConfig in public_sftp.proto
@file:Suppress("DEPRECATION")

package api.v6.services.pub

import com.squareup.wire.GrpcCall
import com.squareup.wire.Service
import kotlin.Suppress
import api.v6.services.pub.common.UserNameValidateResponse

public interface PubSftpConfigClient : Service {
  /**
   * rpc Create (DavConfig) returns (DavConfig) {}
   */
  public fun Get(): GrpcCall<SftpConfig, SftpConfig>

  public fun Update(): GrpcCall<SftpConfig, SftpConfig>

  public fun Enable(): GrpcCall<SftpConfig, SftpConfig>

  public fun Disable(): GrpcCall<SftpConfig, SftpConfig>

  public fun UpdateKeys(): GrpcCall<SftpConfig, SftpConfig>

  public fun ValidateUserName(): GrpcCall<SftpConfig, UserNameValidateResponse>
}
