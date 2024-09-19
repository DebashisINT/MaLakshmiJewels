package com.breezefieldsalesmalaxmi.features.menuBeat

import com.breezefieldsalesmalaxmi.app.NetworkConstant
import com.breezefieldsalesmalaxmi.base.BaseResponse
import com.breezefieldsalesmalaxmi.features.addshop.model.AddQuestionSubmitRequestData
import com.breezefieldsalesmalaxmi.features.addshop.model.AddShopRequestData
import com.breezefieldsalesmalaxmi.features.addshop.model.AddShopResponse
import com.breezefieldsalesmalaxmi.features.addshop.model.imageListResponse
import com.breezefieldsalesmalaxmi.features.addshop.presentation.ShopListSubmitResponse
import com.breezefieldsalesmalaxmi.features.addshop.presentation.multiContactRequestData
import com.breezefieldsalesmalaxmi.features.beatCustom.BeatGetStatusModel
import io.reactivex.Observable
import okhttp3.MultipartBody
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

/**
 * Created by Created by saheli on 16-12-2023.
 */
interface MenuBeatApi {
    @FormUrlEncoded
    @POST("AreaRouteBeatRelationInfo/AreaRouteBeatList")
    fun getCurrentTabData(@Field("user_id") user_id: String,@Field("session_token") session_token: String,@Field("beat_id") beat_id: String):
            Observable<MenuBeatResponse>

    @FormUrlEncoded
    @POST("AreaRouteBeatRelationInfo/AreaRouteBeatDetailsList")
    fun getHirerchyTabData(@Field("user_id") user_id: String,@Field("session_token") session_token: String):
            Observable<MenuBeatAreaRouteResponse>


    /**
     * Companion object to create the GithubApiService
     */
    companion object Factory {
        fun create(): MenuBeatApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOut())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.ADD_SHOP_BASE_URL)
                    .build()

            return retrofit.create(MenuBeatApi::class.java)
        }

        fun createWithoutMultipart(): MenuBeatApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOut())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(MenuBeatApi::class.java)
        }
    }
}