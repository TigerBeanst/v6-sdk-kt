package fail.tiger.util

import com.squareup.wire.GrpcCall
import fail.tiger.appId
import fail.tiger.appSecret
import fail.tiger.appVersion


suspend fun <T : Any, Q : Any> v6Request(grpcCall: GrpcCall<T, Q>, request: Any): Q {
    val method = grpcCall.method.path
    val timeStamp = System.currentTimeMillis().toString()
    val authorization = getAuth()
    val sign = (method + timeStamp + appId + appVersion + authorization + appSecret).md5().lowercase()
    grpcCall.requestMetadata = mapOf(
        "method" to method, "timestamp" to timeStamp, "appid" to appId,
        "appversion" to appVersion, "authorization" to authorization, "sign" to sign
    )
    return grpcCall.execute(request as T) as Q
}