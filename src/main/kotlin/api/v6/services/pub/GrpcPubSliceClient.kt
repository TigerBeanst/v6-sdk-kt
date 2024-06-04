// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.PubSlice in slice_svc.proto
@file:Suppress("DEPRECATION")

package api.v6.services.pub

import com.squareup.wire.GrpcCall
import com.squareup.wire.GrpcClient
import com.squareup.wire.GrpcMethod
import kotlin.Suppress

public class GrpcPubSliceClient(
  private val client: GrpcClient,
) : PubSliceClient {
  override fun GetSlice(): GrpcCall<Slice, Slice> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubSlice/GetSlice",
      requestAdapter = Slice.ADAPTER,
      responseAdapter = Slice.ADAPTER
  ))

  override fun CreateSlice(): GrpcCall<Slice, Slice> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubSlice/CreateSlice",
      requestAdapter = Slice.ADAPTER,
      responseAdapter = Slice.ADAPTER
  ))

  override fun GetMeta(): GrpcCall<Meta, Meta> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubSlice/GetMeta",
      requestAdapter = Meta.ADAPTER,
      responseAdapter = Meta.ADAPTER
  ))

  override fun CreateMeta(): GrpcCall<Meta, Meta> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubSlice/CreateMeta",
      requestAdapter = Meta.ADAPTER,
      responseAdapter = Meta.ADAPTER
  ))

  override fun AddFastLookup(): GrpcCall<FastLookup, FastLookup> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubSlice/AddFastLookup",
      requestAdapter = FastLookup.ADAPTER,
      responseAdapter = FastLookup.ADAPTER
  ))

  override fun GetFastLookup(): GrpcCall<FastLookupRequest, FastLookup> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubSlice/GetFastLookup",
      requestAdapter = FastLookupRequest.ADAPTER,
      responseAdapter = FastLookup.ADAPTER
  ))
}
