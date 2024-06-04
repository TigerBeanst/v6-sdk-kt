// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.FileListRequest in public_user_file.proto
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

public class FileListRequest(
  @field:WireField(
    tag = 1,
    adapter = "v6.services.pub.File#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val parent: File? = null,
  @field:WireField(
    tag = 2,
    adapter = "v6.services.pub.File#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val filter: File? = null,
  @field:WireField(
    tag = 3,
    adapter = "v6.services.pub.common.ScanListRequest#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "listInfo",
    schemaIndex = 2,
  )
  public val list_info: ScanListRequest? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<FileListRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is FileListRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (parent != other.parent) return false
    if (filter != other.filter) return false
    if (list_info != other.list_info) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (parent?.hashCode() ?: 0)
      result = result * 37 + (filter?.hashCode() ?: 0)
      result = result * 37 + (list_info?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (parent != null) result += """parent=$parent"""
    if (filter != null) result += """filter=$filter"""
    if (list_info != null) result += """list_info=$list_info"""
    return result.joinToString(prefix = "FileListRequest{", separator = ", ", postfix = "}")
  }

  public fun copy(
    parent: File? = this.parent,
    filter: File? = this.filter,
    list_info: ScanListRequest? = this.list_info,
    unknownFields: ByteString = this.unknownFields,
  ): FileListRequest = FileListRequest(parent, filter, list_info, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<FileListRequest> = object : ProtoAdapter<FileListRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      FileListRequest::class, 
      "type.googleapis.com/v6.services.pub.FileListRequest", 
      PROTO_3, 
      null, 
      "public_user_file.proto"
    ) {
      override fun encodedSize(`value`: FileListRequest): Int {
        var size = value.unknownFields.size
        if (value.parent != null) size += File.ADAPTER.encodedSizeWithTag(1, value.parent)
        if (value.filter != null) size += File.ADAPTER.encodedSizeWithTag(2, value.filter)
        if (value.list_info != null) size += ScanListRequest.ADAPTER.encodedSizeWithTag(3,
            value.list_info)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: FileListRequest) {
        if (value.parent != null) File.ADAPTER.encodeWithTag(writer, 1, value.parent)
        if (value.filter != null) File.ADAPTER.encodeWithTag(writer, 2, value.filter)
        if (value.list_info != null) ScanListRequest.ADAPTER.encodeWithTag(writer, 3,
            value.list_info)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: FileListRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.list_info != null) ScanListRequest.ADAPTER.encodeWithTag(writer, 3,
            value.list_info)
        if (value.filter != null) File.ADAPTER.encodeWithTag(writer, 2, value.filter)
        if (value.parent != null) File.ADAPTER.encodeWithTag(writer, 1, value.parent)
      }

      override fun decode(reader: ProtoReader): FileListRequest {
        var parent: File? = null
        var filter: File? = null
        var list_info: ScanListRequest? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> parent = File.ADAPTER.decode(reader)
            2 -> filter = File.ADAPTER.decode(reader)
            3 -> list_info = ScanListRequest.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return FileListRequest(
          parent = parent,
          filter = filter,
          list_info = list_info,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: FileListRequest): FileListRequest = value.copy(
        parent = value.parent?.let(File.ADAPTER::redact),
        filter = value.filter?.let(File.ADAPTER::redact),
        list_info = value.list_info?.let(ScanListRequest.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}