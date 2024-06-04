package fail.tiger.util

import api.v6.services.pub.*
import com.squareup.wire.GrpcClient
import okhttp3.OkHttpClient
import okhttp3.Protocol

lateinit var grpcClient: GrpcClient
lateinit var PubUser: PubUserClient
lateinit var PubUserFile: PubUserClient
lateinit var PubOfflineTask: PubOfflineTaskClient
lateinit var PubFileShare: PubFileShareClient
lateinit var PubDavConfig: PubDavConfigClient
lateinit var PubSftpConfig: PubSftpConfigClient

fun v6Init(baseUrl: String = "https://grpcuserapi.2dland.cn:443") {
    grpcClient = GrpcClient.Builder().minMessageToCompress(Long.MAX_VALUE)
        .client(OkHttpClient.Builder().protocols(listOf(Protocol.HTTP_2, Protocol.HTTP_1_1)).build())
        .baseUrl(baseUrl)
        .build()
    PubUser = grpcClient.create(PubUserClient::class)
    PubUserFile = grpcClient.create(PubUserClient::class)
    PubOfflineTask = grpcClient.create(PubOfflineTaskClient::class)
    PubFileShare = grpcClient.create(PubFileShareClient::class)
    PubDavConfig = grpcClient.create(PubDavConfigClient::class)
    PubSftpConfig = grpcClient.create(PubSftpConfigClient::class)
}