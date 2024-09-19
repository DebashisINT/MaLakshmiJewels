package com.breezefieldsalesmalaxmi.features.nearbyuserlist.api

import com.breezefieldsalesmalaxmi.app.Pref
import com.breezefieldsalesmalaxmi.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldsalesmalaxmi.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldsalesmalaxmi.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}