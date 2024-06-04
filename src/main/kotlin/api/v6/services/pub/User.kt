// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.User in user_svc.proto
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

public class User(
  /**
   * identity for user, unique in system
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val identity: String = "",
  /**
   * 1: user, 2: admin, 3: super admin
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val type: Int = 0,
  /**
   * 1: normal, 2: disabled, 3: deleted
   */
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 2,
  )
  public val status: Int = 0,
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#INT64",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "updateTs",
    schemaIndex = 3,
  )
  public val update_ts: Long = 0L,
  @field:WireField(
    tag = 6,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 4,
  )
  public val password: String = "",
  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 5,
  )
  public val name: String = "",
  @field:WireField(
    tag = 8,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 6,
  )
  public val addon: String = "",
  @field:WireField(
    tag = 9,
    adapter = "com.squareup.wire.ProtoAdapter#INT64",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "createTs",
    schemaIndex = 7,
  )
  public val create_ts: Long = 0L,
  @field:WireField(
    tag = 10,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 8,
  )
  public val hash: String = "",
  @field:WireField(
    tag = 11,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 9,
  )
  public val icon: String = "",
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<User, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is User) return false
    if (unknownFields != other.unknownFields) return false
    if (identity != other.identity) return false
    if (type != other.type) return false
    if (status != other.status) return false
    if (update_ts != other.update_ts) return false
    if (password != other.password) return false
    if (name != other.name) return false
    if (addon != other.addon) return false
    if (create_ts != other.create_ts) return false
    if (hash != other.hash) return false
    if (icon != other.icon) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + identity.hashCode()
      result = result * 37 + type.hashCode()
      result = result * 37 + status.hashCode()
      result = result * 37 + update_ts.hashCode()
      result = result * 37 + password.hashCode()
      result = result * 37 + name.hashCode()
      result = result * 37 + addon.hashCode()
      result = result * 37 + create_ts.hashCode()
      result = result * 37 + hash.hashCode()
      result = result * 37 + icon.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """identity=${sanitize(identity)}"""
    result += """type=$type"""
    result += """status=$status"""
    result += """update_ts=$update_ts"""
    result += """password=${sanitize(password)}"""
    result += """name=${sanitize(name)}"""
    result += """addon=${sanitize(addon)}"""
    result += """create_ts=$create_ts"""
    result += """hash=${sanitize(hash)}"""
    result += """icon=${sanitize(icon)}"""
    return result.joinToString(prefix = "User{", separator = ", ", postfix = "}")
  }

  public fun copy(
    identity: String = this.identity,
    type: Int = this.type,
    status: Int = this.status,
    update_ts: Long = this.update_ts,
    password: String = this.password,
    name: String = this.name,
    addon: String = this.addon,
    create_ts: Long = this.create_ts,
    hash: String = this.hash,
    icon: String = this.icon,
    unknownFields: ByteString = this.unknownFields,
  ): User = User(identity, type, status, update_ts, password, name, addon, create_ts, hash, icon,
      unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<User> = object : ProtoAdapter<User>(
      FieldEncoding.LENGTH_DELIMITED, 
      User::class, 
      "type.googleapis.com/v6.services.pub.User", 
      PROTO_3, 
      null, 
      "user_svc.proto"
    ) {
      override fun encodedSize(`value`: User): Int {
        var size = value.unknownFields.size
        if (value.identity != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.identity)
        if (value.type != 0) size += ProtoAdapter.INT32.encodedSizeWithTag(2, value.type)
        if (value.status != 0) size += ProtoAdapter.INT32.encodedSizeWithTag(3, value.status)
        if (value.update_ts != 0L) size += ProtoAdapter.INT64.encodedSizeWithTag(5, value.update_ts)
        if (value.password != "") size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.password)
        if (value.name != "") size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.name)
        if (value.addon != "") size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.addon)
        if (value.create_ts != 0L) size += ProtoAdapter.INT64.encodedSizeWithTag(9, value.create_ts)
        if (value.hash != "") size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.hash)
        if (value.icon != "") size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.icon)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: User) {
        if (value.identity != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.identity)
        if (value.type != 0) ProtoAdapter.INT32.encodeWithTag(writer, 2, value.type)
        if (value.status != 0) ProtoAdapter.INT32.encodeWithTag(writer, 3, value.status)
        if (value.update_ts != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 5, value.update_ts)
        if (value.password != "") ProtoAdapter.STRING.encodeWithTag(writer, 6, value.password)
        if (value.name != "") ProtoAdapter.STRING.encodeWithTag(writer, 7, value.name)
        if (value.addon != "") ProtoAdapter.STRING.encodeWithTag(writer, 8, value.addon)
        if (value.create_ts != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 9, value.create_ts)
        if (value.hash != "") ProtoAdapter.STRING.encodeWithTag(writer, 10, value.hash)
        if (value.icon != "") ProtoAdapter.STRING.encodeWithTag(writer, 11, value.icon)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: User) {
        writer.writeBytes(value.unknownFields)
        if (value.icon != "") ProtoAdapter.STRING.encodeWithTag(writer, 11, value.icon)
        if (value.hash != "") ProtoAdapter.STRING.encodeWithTag(writer, 10, value.hash)
        if (value.create_ts != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 9, value.create_ts)
        if (value.addon != "") ProtoAdapter.STRING.encodeWithTag(writer, 8, value.addon)
        if (value.name != "") ProtoAdapter.STRING.encodeWithTag(writer, 7, value.name)
        if (value.password != "") ProtoAdapter.STRING.encodeWithTag(writer, 6, value.password)
        if (value.update_ts != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 5, value.update_ts)
        if (value.status != 0) ProtoAdapter.INT32.encodeWithTag(writer, 3, value.status)
        if (value.type != 0) ProtoAdapter.INT32.encodeWithTag(writer, 2, value.type)
        if (value.identity != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.identity)
      }

      override fun decode(reader: ProtoReader): User {
        var identity: String = ""
        var type: Int = 0
        var status: Int = 0
        var update_ts: Long = 0L
        var password: String = ""
        var name: String = ""
        var addon: String = ""
        var create_ts: Long = 0L
        var hash: String = ""
        var icon: String = ""
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> identity = ProtoAdapter.STRING.decode(reader)
            2 -> type = ProtoAdapter.INT32.decode(reader)
            3 -> status = ProtoAdapter.INT32.decode(reader)
            5 -> update_ts = ProtoAdapter.INT64.decode(reader)
            6 -> password = ProtoAdapter.STRING.decode(reader)
            7 -> name = ProtoAdapter.STRING.decode(reader)
            8 -> addon = ProtoAdapter.STRING.decode(reader)
            9 -> create_ts = ProtoAdapter.INT64.decode(reader)
            10 -> hash = ProtoAdapter.STRING.decode(reader)
            11 -> icon = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return User(
          identity = identity,
          type = type,
          status = status,
          update_ts = update_ts,
          password = password,
          name = name,
          addon = addon,
          create_ts = create_ts,
          hash = hash,
          icon = icon,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: User): User = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}