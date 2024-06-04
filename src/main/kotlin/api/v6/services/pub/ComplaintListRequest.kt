// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.ComplaintListRequest in file_share.proto
@file:Suppress("DEPRECATION")

package api.v6.services.pub

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
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
import api.v6.services.pub.common.ScanListRequest

public class ComplaintListRequest(
  /**
   * string user_identity = 1;
   */
  @field:WireField(
    tag = 3,
    adapter = "v6.services.pub.common.ScanListRequest#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "listInfo",
    schemaIndex = 0,
  )
  public val list_info: ScanListRequest? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<ComplaintListRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is ComplaintListRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (list_info != other.list_info) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (list_info?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (list_info != null) result += """list_info=$list_info"""
    return result.joinToString(prefix = "ComplaintListRequest{", separator = ", ", postfix = "}")
  }

  public fun copy(list_info: ScanListRequest? = this.list_info, unknownFields: ByteString =
      this.unknownFields): ComplaintListRequest = ComplaintListRequest(list_info, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<ComplaintListRequest> = object :
        ProtoAdapter<ComplaintListRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      ComplaintListRequest::class, 
      "type.googleapis.com/v6.services.pub.ComplaintListRequest", 
      PROTO_3, 
      null, 
      "file_share.proto"
    ) {
      override fun encodedSize(`value`: ComplaintListRequest): Int {
        var size = value.unknownFields.size
        if (value.list_info != null) size += ScanListRequest.ADAPTER.encodedSizeWithTag(3,
            value.list_info)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: ComplaintListRequest) {
        if (value.list_info != null) ScanListRequest.ADAPTER.encodeWithTag(writer, 3,
            value.list_info)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: ComplaintListRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.list_info != null) ScanListRequest.ADAPTER.encodeWithTag(writer, 3,
            value.list_info)
      }

      override fun decode(reader: ProtoReader): ComplaintListRequest {
        var list_info: ScanListRequest? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            3 -> list_info = ScanListRequest.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return ComplaintListRequest(
          list_info = list_info,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: ComplaintListRequest): ComplaintListRequest = value.copy(
        list_info = value.list_info?.let(ScanListRequest.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
