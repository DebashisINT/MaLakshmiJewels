package com.breezefieldsalesmalaxmi.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezefieldsalesmalaxmi.app.FileUtils
import com.breezefieldsalesmalaxmi.base.BaseResponse
import com.breezefieldsalesmalaxmi.features.NewQuotation.model.*
import com.breezefieldsalesmalaxmi.features.addshop.model.AddShopRequestData
import com.breezefieldsalesmalaxmi.features.addshop.model.AddShopResponse
import com.breezefieldsalesmalaxmi.features.damageProduct.model.DamageProductResponseModel
import com.breezefieldsalesmalaxmi.features.damageProduct.model.delBreakageReq
import com.breezefieldsalesmalaxmi.features.damageProduct.model.viewAllBreakageReq
import com.breezefieldsalesmalaxmi.features.login.model.userconfig.UserConfigResponseModel
import com.breezefieldsalesmalaxmi.features.myjobs.model.WIPImageSubmit
import com.breezefieldsalesmalaxmi.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}