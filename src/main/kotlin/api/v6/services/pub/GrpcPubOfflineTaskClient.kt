// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.PubOfflineTask in public_user_offline.proto
@file:Suppress("DEPRECATION")

package api.v6.services.pub

import com.squareup.wire.GrpcCall
import com.squareup.wire.GrpcClient
import com.squareup.wire.GrpcMethod
import kotlin.Suppress

public class GrpcPubOfflineTaskClient(
  private val client: GrpcClient,
) : PubOfflineTaskClient {
  override fun Parse(): GrpcCall<TaskParseRequest, TaskParseResponse> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubOfflineTask/Parse",
      requestAdapter = TaskParseRequest.ADAPTER,
      responseAdapter = TaskParseResponse.ADAPTER
  ))

  override fun Add(): GrpcCall<UserTask, UserTask> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubOfflineTask/Add",
      requestAdapter = UserTask.ADAPTER,
      responseAdapter = UserTask.ADAPTER
  ))

  override fun List(): GrpcCall<OfflineTaskListRequest, OfflineTaskListResponse> =
      client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubOfflineTask/List",
      requestAdapter = OfflineTaskListRequest.ADAPTER,
      responseAdapter = OfflineTaskListResponse.ADAPTER
  ))

  override fun Delete(): GrpcCall<OfflineTaskDeleteRequest, OfflineTaskDeleteResponse> =
      client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubOfflineTask/Delete",
      requestAdapter = OfflineTaskDeleteRequest.ADAPTER,
      responseAdapter = OfflineTaskDeleteResponse.ADAPTER
  ))
}
