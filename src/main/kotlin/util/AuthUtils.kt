package fail.tiger.util

import fail.tiger.ACCESS_TOKEN

fun getAuth() = if (ACCESS_TOKEN.isEmpty()) "" else "Bearer $ACCESS_TOKEN"