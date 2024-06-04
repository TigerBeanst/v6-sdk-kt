// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.ManageRTCResponse in public_user_file.proto
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

public class ManageRTCResponse(
  /**
   * string content_identity = 1;
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#INT64",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "fileSize",
    schemaIndex = 0,
  )
  public val file_size: Long = 0L,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "encodeKey",
    schemaIndex = 1,
  )
  public val encode_key: String = "",
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 2,
  )
  public val sdp: String = "",
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 3,
  )
  public val name: String = "",
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 4,
  )
  public val connection: String = "",
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<ManageRTCResponse, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is ManageRTCResponse) return false
    if (unknownFields != other.unknownFields) return false
    if (file_size != other.file_size) return false
    if (encode_key != other.encode_key) return false
    if (sdp != other.sdp) return false
    if (name != other.name) return false
    if (connection != other.connection) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + file_size.hashCode()
      result = result * 37 + encode_key.hashCode()
      result = result * 37 + sdp.hashCode()
      result = result * 37 + name.hashCode()
      result = result * 37 + connection.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """file_size=$file_size"""
    result += """encode_key=${sanitize(encode_key)}"""
    result += """sdp=${sanitize(sdp)}"""
    result += """name=${sanitize(name)}"""
    result += """connection=${sanitize(connection)}"""
    return result.joinToString(prefix = "ManageRTCResponse{", separator = ", ", postfix = "}")
  }

  public fun copy(
    file_size: Long = this.file_size,
    encode_key: String = this.encode_key,
    sdp: String = this.sdp,
    name: String = this.name,
    connection: String = this.connection,
    unknownFields: ByteString = this.unknownFields,
  ): ManageRTCResponse = ManageRTCResponse(file_size, encode_key, sdp, name, connection,
      unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<ManageRTCResponse> = object : ProtoAdapter<ManageRTCResponse>(
      FieldEncoding.LENGTH_DELIMITED, 
      ManageRTCResponse::class, 
      "type.googleapis.com/v6.services.pub.ManageRTCResponse", 
      PROTO_3, 
      null, 
      "public_user_file.proto"
    ) {
      override fun encodedSize(`value`: ManageRTCResponse): Int {
        var size = value.unknownFields.size
        if (value.file_size != 0L) size += ProtoAdapter.INT64.encodedSizeWithTag(1, value.file_size)
        if (value.encode_key != "") size += ProtoAdapter.STRING.encodedSizeWithTag(2,
            value.encode_key)
        if (value.sdp != "") size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.sdp)
        if (value.name != "") size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.name)
        if (value.connection != "") size += ProtoAdapter.STRING.encodedSizeWithTag(5,
            value.connection)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: ManageRTCResponse) {
        if (value.file_size != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 1, value.file_size)
        if (value.encode_key != "") ProtoAdapter.STRING.encodeWithTag(writer, 2, value.encode_key)
        if (value.sdp != "") ProtoAdapter.STRING.encodeWithTag(writer, 3, value.sdp)
        if (value.name != "") ProtoAdapter.STRING.encodeWithTag(writer, 4, value.name)
        if (value.connection != "") ProtoAdapter.STRING.encodeWithTag(writer, 5, value.connection)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: ManageRTCResponse) {
        writer.writeBytes(value.unknownFields)
        if (value.connection != "") ProtoAdapter.STRING.encodeWithTag(writer, 5, value.connection)
        if (value.name != "") ProtoAdapter.STRING.encodeWithTag(writer, 4, value.name)
        if (value.sdp != "") ProtoAdapter.STRING.encodeWithTag(writer, 3, value.sdp)
        if (value.encode_key != "") ProtoAdapter.STRING.encodeWithTag(writer, 2, value.encode_key)
        if (value.file_size != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 1, value.file_size)
      }

      override fun decode(reader: ProtoReader): ManageRTCResponse {
        var file_size: Long = 0L
        var encode_key: String = ""
        var sdp: String = ""
        var name: String = ""
        var connection: String = ""
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> file_size = ProtoAdapter.INT64.decode(reader)
            2 -> encode_key = ProtoAdapter.STRING.decode(reader)
            3 -> sdp = ProtoAdapter.STRING.decode(reader)
            4 -> name = ProtoAdapter.STRING.decode(reader)
            5 -> connection = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return ManageRTCResponse(
          file_size = file_size,
          encode_key = encode_key,
          sdp = sdp,
          name = name,
          connection = connection,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: ManageRTCResponse): ManageRTCResponse = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
