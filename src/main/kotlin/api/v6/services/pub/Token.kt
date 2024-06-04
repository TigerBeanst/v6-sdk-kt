// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.Token in user_svc.proto
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

public class Token(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val identity: String = "",
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "userIdentity",
    schemaIndex = 1,
  )
  public val user_identity: String = "",
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 2,
  )
  public val device: String = "",
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 3,
  )
  public val version: Int = 0,
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "accessToken",
    schemaIndex = 4,
  )
  public val access_token: String = "",
  @field:WireField(
    tag = 6,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "refreshToken",
    schemaIndex = 5,
  )
  public val refresh_token: String = "",
  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.ProtoAdapter#INT64",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "updateTs",
    schemaIndex = 6,
  )
  public val update_ts: Long = 0L,
  @field:WireField(
    tag = 8,
    adapter = "com.squareup.wire.ProtoAdapter#INT64",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "accessTokenExpireTs",
    schemaIndex = 7,
  )
  public val access_token_expire_ts: Long = 0L,
  @field:WireField(
    tag = 9,
    adapter = "com.squareup.wire.ProtoAdapter#INT64",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "refreshTokenExpireTs",
    schemaIndex = 8,
  )
  public val refresh_token_expire_ts: Long = 0L,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<Token, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is Token) return false
    if (unknownFields != other.unknownFields) return false
    if (identity != other.identity) return false
    if (user_identity != other.user_identity) return false
    if (device != other.device) return false
    if (version != other.version) return false
    if (access_token != other.access_token) return false
    if (refresh_token != other.refresh_token) return false
    if (update_ts != other.update_ts) return false
    if (access_token_expire_ts != other.access_token_expire_ts) return false
    if (refresh_token_expire_ts != other.refresh_token_expire_ts) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + identity.hashCode()
      result = result * 37 + user_identity.hashCode()
      result = result * 37 + device.hashCode()
      result = result * 37 + version.hashCode()
      result = result * 37 + access_token.hashCode()
      result = result * 37 + refresh_token.hashCode()
      result = result * 37 + update_ts.hashCode()
      result = result * 37 + access_token_expire_ts.hashCode()
      result = result * 37 + refresh_token_expire_ts.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """identity=${sanitize(identity)}"""
    result += """user_identity=${sanitize(user_identity)}"""
    result += """device=${sanitize(device)}"""
    result += """version=$version"""
    result += """access_token=${sanitize(access_token)}"""
    result += """refresh_token=${sanitize(refresh_token)}"""
    result += """update_ts=$update_ts"""
    result += """access_token_expire_ts=$access_token_expire_ts"""
    result += """refresh_token_expire_ts=$refresh_token_expire_ts"""
    return result.joinToString(prefix = "Token{", separator = ", ", postfix = "}")
  }

  public fun copy(
    identity: String = this.identity,
    user_identity: String = this.user_identity,
    device: String = this.device,
    version: Int = this.version,
    access_token: String = this.access_token,
    refresh_token: String = this.refresh_token,
    update_ts: Long = this.update_ts,
    access_token_expire_ts: Long = this.access_token_expire_ts,
    refresh_token_expire_ts: Long = this.refresh_token_expire_ts,
    unknownFields: ByteString = this.unknownFields,
  ): Token = Token(identity, user_identity, device, version, access_token, refresh_token, update_ts,
      access_token_expire_ts, refresh_token_expire_ts, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<Token> = object : ProtoAdapter<Token>(
      FieldEncoding.LENGTH_DELIMITED, 
      Token::class, 
      "type.googleapis.com/v6.services.pub.Token", 
      PROTO_3, 
      null, 
      "user_svc.proto"
    ) {
      override fun encodedSize(`value`: Token): Int {
        var size = value.unknownFields.size
        if (value.identity != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.identity)
        if (value.user_identity != "") size += ProtoAdapter.STRING.encodedSizeWithTag(2,
            value.user_identity)
        if (value.device != "") size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.device)
        if (value.version != 0) size += ProtoAdapter.INT32.encodedSizeWithTag(4, value.version)
        if (value.access_token != "") size += ProtoAdapter.STRING.encodedSizeWithTag(5,
            value.access_token)
        if (value.refresh_token != "") size += ProtoAdapter.STRING.encodedSizeWithTag(6,
            value.refresh_token)
        if (value.update_ts != 0L) size += ProtoAdapter.INT64.encodedSizeWithTag(7, value.update_ts)
        if (value.access_token_expire_ts != 0L) size += ProtoAdapter.INT64.encodedSizeWithTag(8,
            value.access_token_expire_ts)
        if (value.refresh_token_expire_ts != 0L) size += ProtoAdapter.INT64.encodedSizeWithTag(9,
            value.refresh_token_expire_ts)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: Token) {
        if (value.identity != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.identity)
        if (value.user_identity != "") ProtoAdapter.STRING.encodeWithTag(writer, 2,
            value.user_identity)
        if (value.device != "") ProtoAdapter.STRING.encodeWithTag(writer, 3, value.device)
        if (value.version != 0) ProtoAdapter.INT32.encodeWithTag(writer, 4, value.version)
        if (value.access_token != "") ProtoAdapter.STRING.encodeWithTag(writer, 5,
            value.access_token)
        if (value.refresh_token != "") ProtoAdapter.STRING.encodeWithTag(writer, 6,
            value.refresh_token)
        if (value.update_ts != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 7, value.update_ts)
        if (value.access_token_expire_ts != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 8,
            value.access_token_expire_ts)
        if (value.refresh_token_expire_ts != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 9,
            value.refresh_token_expire_ts)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: Token) {
        writer.writeBytes(value.unknownFields)
        if (value.refresh_token_expire_ts != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 9,
            value.refresh_token_expire_ts)
        if (value.access_token_expire_ts != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 8,
            value.access_token_expire_ts)
        if (value.update_ts != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 7, value.update_ts)
        if (value.refresh_token != "") ProtoAdapter.STRING.encodeWithTag(writer, 6,
            value.refresh_token)
        if (value.access_token != "") ProtoAdapter.STRING.encodeWithTag(writer, 5,
            value.access_token)
        if (value.version != 0) ProtoAdapter.INT32.encodeWithTag(writer, 4, value.version)
        if (value.device != "") ProtoAdapter.STRING.encodeWithTag(writer, 3, value.device)
        if (value.user_identity != "") ProtoAdapter.STRING.encodeWithTag(writer, 2,
            value.user_identity)
        if (value.identity != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.identity)
      }

      override fun decode(reader: ProtoReader): Token {
        var identity: String = ""
        var user_identity: String = ""
        var device: String = ""
        var version: Int = 0
        var access_token: String = ""
        var refresh_token: String = ""
        var update_ts: Long = 0L
        var access_token_expire_ts: Long = 0L
        var refresh_token_expire_ts: Long = 0L
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> identity = ProtoAdapter.STRING.decode(reader)
            2 -> user_identity = ProtoAdapter.STRING.decode(reader)
            3 -> device = ProtoAdapter.STRING.decode(reader)
            4 -> version = ProtoAdapter.INT32.decode(reader)
            5 -> access_token = ProtoAdapter.STRING.decode(reader)
            6 -> refresh_token = ProtoAdapter.STRING.decode(reader)
            7 -> update_ts = ProtoAdapter.INT64.decode(reader)
            8 -> access_token_expire_ts = ProtoAdapter.INT64.decode(reader)
            9 -> refresh_token_expire_ts = ProtoAdapter.INT64.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return Token(
          identity = identity,
          user_identity = user_identity,
          device = device,
          version = version,
          access_token = access_token,
          refresh_token = refresh_token,
          update_ts = update_ts,
          access_token_expire_ts = access_token_expire_ts,
          refresh_token_expire_ts = refresh_token_expire_ts,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: Token): Token = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
