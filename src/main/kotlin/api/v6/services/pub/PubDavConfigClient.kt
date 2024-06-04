// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.PubDavConfig in public_webdav.proto
@file:Suppress("DEPRECATION")

package api.v6.services.pub

import com.squareup.wire.GrpcCall
import com.squareup.wire.Service
import kotlin.Suppress
import api.v6.services.pub.common.UserNameValidateResponse

public interface PubDavConfigClient : Service {
  /**
   * rpc Create (DavConfig) returns (DavConfig) {}
   */
  public fun Get(): GrpcCall<DavConfig, DavConfig>

  public fun Update(): GrpcCall<DavConfig, DavConfig>

  public fun Enable(): GrpcCall<DavConfig, DavConfig>

  public fun Disable(): GrpcCall<DavConfig, DavConfig>

  public fun ValidateUserName(): GrpcCall<DavConfig, UserNameValidateResponse>
}
