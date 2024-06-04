// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.p2p.SendPeerIceCandidateRequest in webrtc_manager.proto
@file:Suppress("DEPRECATION")

package api.v6.services.p2p

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.Suppress
import okio.ByteString

public class SendPeerIceCandidateRequest(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "clientIdentity",
    schemaIndex = 0,
  )
  public val client_identity: String = "",
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val candidate: String = "",
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<SendPeerIceCandidateRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is SendPeerIceCandidateRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (client_identity != other.client_identity) return false
    if (candidate != other.candidate) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + client_identity.hashCode()
      result = result * 37 + candidate.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """client_identity=${sanitize(client_identity)}"""
    result += """candidate=${sanitize(candidate)}"""
    return result.joinToString(prefix = "SendPeerIceCandidateRequest{", separator = ", ", postfix =
        "}")
  }

  public fun copy(
    client_identity: String = this.client_identity,
    candidate: String = this.candidate,
    unknownFields: ByteString = this.unknownFields,
  ): SendPeerIceCandidateRequest = SendPeerIceCandidateRequest(client_identity, candidate,
      unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<SendPeerIceCandidateRequest> = object :
        ProtoAdapter<SendPeerIceCandidateRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      SendPeerIceCandidateRequest::class, 
      "type.googleapis.com/v6.services.p2p.SendPeerIceCandidateRequest", 
      PROTO_3, 
      null, 
      "webrtc_manager.proto"
    ) {
      override fun encodedSize(`value`: SendPeerIceCandidateRequest): Int {
        var size = value.unknownFields.size
        if (value.client_identity != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1,
            value.client_identity)
        if (value.candidate != "") size += ProtoAdapter.STRING.encodedSizeWithTag(3,
            value.candidate)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: SendPeerIceCandidateRequest) {
        if (value.client_identity != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.client_identity)
        if (value.candidate != "") ProtoAdapter.STRING.encodeWithTag(writer, 3, value.candidate)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: SendPeerIceCandidateRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.candidate != "") ProtoAdapter.STRING.encodeWithTag(writer, 3, value.candidate)
        if (value.client_identity != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.client_identity)
      }

      override fun decode(reader: ProtoReader): SendPeerIceCandidateRequest {
        var client_identity: String = ""
        var candidate: String = ""
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> client_identity = ProtoAdapter.STRING.decode(reader)
            3 -> candidate = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return SendPeerIceCandidateRequest(
          client_identity = client_identity,
          candidate = candidate,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: SendPeerIceCandidateRequest): SendPeerIceCandidateRequest =
          value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}