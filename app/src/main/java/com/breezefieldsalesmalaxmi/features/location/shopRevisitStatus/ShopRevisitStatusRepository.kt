package com.breezefieldsalesmalaxmi.features.location.shopRevisitStatus

import com.breezefieldsalesmalaxmi.base.BaseResponse
import com.breezefieldsalesmalaxmi.features.location.model.ShopDurationRequest
import com.breezefieldsalesmalaxmi.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}