package fail.tiger.util

import java.security.MessageDigest

fun String.md5(): String {
    val bytes = MessageDigest.getInstance("MD5").digest(this.toByteArray())
    return bytes.hex()
}

fun ByteArray.hex(): String {
    return joinToString("") { "%02X".format(it) }
}