// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.Meta in slice_svc.proto
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

public class Meta(
  /**
   * identity
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val identity: String = "",
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#BYTES",
    label = WireField.Label.OMIT_IDENTITY,
    declaredName = "data",
    schemaIndex = 1,
  )
  public val data_: ByteString = ByteString.EMPTY,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<Meta, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is Meta) return false
    if (unknownFields != other.unknownFields) return false
    if (identity != other.identity) return false
    if (data_ != other.data_) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + identity.hashCode()
      result = result * 37 + data_.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """identity=${sanitize(identity)}"""
    result += """data_=$data_"""
    return result.joinToString(prefix = "Meta{", separator = ", ", postfix = "}")
  }

  public fun copy(
    identity: String = this.identity,
    data_: ByteString = this.data_,
    unknownFields: ByteString = this.unknownFields,
  ): Meta = Meta(identity, data_, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<Meta> = object : ProtoAdapter<Meta>(
      FieldEncoding.LENGTH_DELIMITED, 
      Meta::class, 
      "type.googleapis.com/v6.services.pub.Meta", 
      PROTO_3, 
      null, 
      "slice_svc.proto"
    ) {
      override fun encodedSize(`value`: Meta): Int {
        var size = value.unknownFields.size
        if (value.identity != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.identity)
        if (value.data_ != ByteString.EMPTY) size += ProtoAdapter.BYTES.encodedSizeWithTag(2,
            value.data_)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: Meta) {
        if (value.identity != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.identity)
        if (value.data_ != ByteString.EMPTY) ProtoAdapter.BYTES.encodeWithTag(writer, 2,
            value.data_)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: Meta) {
        writer.writeBytes(value.unknownFields)
        if (value.data_ != ByteString.EMPTY) ProtoAdapter.BYTES.encodeWithTag(writer, 2,
            value.data_)
        if (value.identity != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.identity)
      }

      override fun decode(reader: ProtoReader): Meta {
        var identity: String = ""
        var data_: ByteString = ByteString.EMPTY
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> identity = ProtoAdapter.STRING.decode(reader)
            2 -> data_ = ProtoAdapter.BYTES.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return Meta(
          identity = identity,
          data_ = data_,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: Meta): Meta = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
