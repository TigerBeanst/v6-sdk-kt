// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.p2p.WebRTCManageService in webrtc_manager.proto
@file:Suppress("DEPRECATION")

package api.v6.services.p2p

import com.squareup.wire.GrpcCall
import com.squareup.wire.GrpcStreamingCall
import com.squareup.wire.Service
import kotlin.Suppress

public interface WebRTCManageServiceClient : Service {
  public fun StartDownload(): GrpcCall<StartDownloadRequest, StartDownloadResponse>

  public fun StopDownload(): GrpcCall<StopDownloadRequest, StopDownloadResponse>

  public fun Disconnect(): GrpcCall<DisconnectRequest, DisconnectResponse>

  public fun SendPeerIceCandidate():
      GrpcCall<SendPeerIceCandidateRequest, SendPeerIceCandidateResponse>

  public fun Receive(): GrpcStreamingCall<ReceiveRequest, ReceiveResponse>
}
