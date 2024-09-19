package com.breezefieldsalesmalaxmi.features.stockAddCurrentStock.api

import com.breezefieldsalesmalaxmi.base.BaseResponse
import com.breezefieldsalesmalaxmi.features.location.model.ShopRevisitStatusRequest
import com.breezefieldsalesmalaxmi.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldsalesmalaxmi.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefieldsalesmalaxmi.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefieldsalesmalaxmi.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}