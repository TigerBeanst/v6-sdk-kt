// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.OauthTokenResponse in user_svc.proto
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

public class OauthTokenResponse(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val url: String = "",
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val addon: String = "",
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 2,
  )
  public val input: String = "",
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 3,
  )
  public val type: String = "",
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 4,
  )
  public val callback: String = "",
  @field:WireField(
    tag = 6,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "returnUrl",
    schemaIndex = 5,
  )
  public val return_url: String = "",
  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "returnType",
    schemaIndex = 6,
  )
  public val return_type: Int = 0,
  @field:WireField(
    tag = 8,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 7,
  )
  public val captcha: String = "",
  @field:WireField(
    tag = 9,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 8,
  )
  public val state: String = "",
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<OauthTokenResponse, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is OauthTokenResponse) return false
    if (unknownFields != other.unknownFields) return false
    if (url != other.url) return false
    if (addon != other.addon) return false
    if (input != other.input) return false
    if (type != other.type) return false
    if (callback != other.callback) return false
    if (return_url != other.return_url) return false
    if (return_type != other.return_type) return false
    if (captcha != other.captcha) return false
    if (state != other.state) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + url.hashCode()
      result = result * 37 + addon.hashCode()
      result = result * 37 + input.hashCode()
      result = result * 37 + type.hashCode()
      result = result * 37 + callback.hashCode()
      result = result * 37 + return_url.hashCode()
      result = result * 37 + return_type.hashCode()
      result = result * 37 + captcha.hashCode()
      result = result * 37 + state.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """url=${sanitize(url)}"""
    result += """addon=${sanitize(addon)}"""
    result += """input=${sanitize(input)}"""
    result += """type=${sanitize(type)}"""
    result += """callback=${sanitize(callback)}"""
    result += """return_url=${sanitize(return_url)}"""
    result += """return_type=$return_type"""
    result += """captcha=${sanitize(captcha)}"""
    result += """state=${sanitize(state)}"""
    return result.joinToString(prefix = "OauthTokenResponse{", separator = ", ", postfix = "}")
  }

  public fun copy(
    url: String = this.url,
    addon: String = this.addon,
    input: String = this.input,
    type: String = this.type,
    callback: String = this.callback,
    return_url: String = this.return_url,
    return_type: Int = this.return_type,
    captcha: String = this.captcha,
    state: String = this.state,
    unknownFields: ByteString = this.unknownFields,
  ): OauthTokenResponse = OauthTokenResponse(url, addon, input, type, callback, return_url,
      return_type, captcha, state, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<OauthTokenResponse> = object :
        ProtoAdapter<OauthTokenResponse>(
      FieldEncoding.LENGTH_DELIMITED, 
      OauthTokenResponse::class, 
      "type.googleapis.com/v6.services.pub.OauthTokenResponse", 
      PROTO_3, 
      null, 
      "user_svc.proto"
    ) {
      override fun encodedSize(`value`: OauthTokenResponse): Int {
        var size = value.unknownFields.size
        if (value.url != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.url)
        if (value.addon != "") size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.addon)
        if (value.input != "") size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.input)
        if (value.type != "") size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.type)
        if (value.callback != "") size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.callback)
        if (value.return_url != "") size += ProtoAdapter.STRING.encodedSizeWithTag(6,
            value.return_url)
        if (value.return_type != 0) size += ProtoAdapter.INT32.encodedSizeWithTag(7,
            value.return_type)
        if (value.captcha != "") size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.captcha)
        if (value.state != "") size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.state)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: OauthTokenResponse) {
        if (value.url != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.url)
        if (value.addon != "") ProtoAdapter.STRING.encodeWithTag(writer, 2, value.addon)
        if (value.input != "") ProtoAdapter.STRING.encodeWithTag(writer, 3, value.input)
        if (value.type != "") ProtoAdapter.STRING.encodeWithTag(writer, 4, value.type)
        if (value.callback != "") ProtoAdapter.STRING.encodeWithTag(writer, 5, value.callback)
        if (value.return_url != "") ProtoAdapter.STRING.encodeWithTag(writer, 6, value.return_url)
        if (value.return_type != 0) ProtoAdapter.INT32.encodeWithTag(writer, 7, value.return_type)
        if (value.captcha != "") ProtoAdapter.STRING.encodeWithTag(writer, 8, value.captcha)
        if (value.state != "") ProtoAdapter.STRING.encodeWithTag(writer, 9, value.state)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: OauthTokenResponse) {
        writer.writeBytes(value.unknownFields)
        if (value.state != "") ProtoAdapter.STRING.encodeWithTag(writer, 9, value.state)
        if (value.captcha != "") ProtoAdapter.STRING.encodeWithTag(writer, 8, value.captcha)
        if (value.return_type != 0) ProtoAdapter.INT32.encodeWithTag(writer, 7, value.return_type)
        if (value.return_url != "") ProtoAdapter.STRING.encodeWithTag(writer, 6, value.return_url)
        if (value.callback != "") ProtoAdapter.STRING.encodeWithTag(writer, 5, value.callback)
        if (value.type != "") ProtoAdapter.STRING.encodeWithTag(writer, 4, value.type)
        if (value.input != "") ProtoAdapter.STRING.encodeWithTag(writer, 3, value.input)
        if (value.addon != "") ProtoAdapter.STRING.encodeWithTag(writer, 2, value.addon)
        if (value.url != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.url)
      }

      override fun decode(reader: ProtoReader): OauthTokenResponse {
        var url: String = ""
        var addon: String = ""
        var input: String = ""
        var type: String = ""
        var callback: String = ""
        var return_url: String = ""
        var return_type: Int = 0
        var captcha: String = ""
        var state: String = ""
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> url = ProtoAdapter.STRING.decode(reader)
            2 -> addon = ProtoAdapter.STRING.decode(reader)
            3 -> input = ProtoAdapter.STRING.decode(reader)
            4 -> type = ProtoAdapter.STRING.decode(reader)
            5 -> callback = ProtoAdapter.STRING.decode(reader)
            6 -> return_url = ProtoAdapter.STRING.decode(reader)
            7 -> return_type = ProtoAdapter.INT32.decode(reader)
            8 -> captcha = ProtoAdapter.STRING.decode(reader)
            9 -> state = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return OauthTokenResponse(
          url = url,
          addon = addon,
          input = input,
          type = type,
          callback = callback,
          return_url = return_url,
          return_type = return_type,
          captcha = captcha,
          state = state,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: OauthTokenResponse): OauthTokenResponse = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
