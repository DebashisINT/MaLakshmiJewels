package com.breezefieldsalesmalaxmi.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldsalesmalaxmi.app.FileUtils
import com.breezefieldsalesmalaxmi.app.Pref
import com.breezefieldsalesmalaxmi.base.BaseResponse
import com.breezefieldsalesmalaxmi.features.addshop.model.AddLogReqData
import com.breezefieldsalesmalaxmi.features.addshop.model.AddShopRequestData
import com.breezefieldsalesmalaxmi.features.addshop.model.AddShopResponse
import com.breezefieldsalesmalaxmi.features.addshop.model.LogFileResponse
import com.breezefieldsalesmalaxmi.features.addshop.model.UpdateAddrReq
import com.breezefieldsalesmalaxmi.features.contacts.CallHisDtls
import com.breezefieldsalesmalaxmi.features.contacts.CompanyReqData
import com.breezefieldsalesmalaxmi.features.contacts.ContactMasterRes
import com.breezefieldsalesmalaxmi.features.contacts.SourceMasterRes
import com.breezefieldsalesmalaxmi.features.contacts.StageMasterRes
import com.breezefieldsalesmalaxmi.features.contacts.StatusMasterRes
import com.breezefieldsalesmalaxmi.features.contacts.TypeMasterRes
import com.breezefieldsalesmalaxmi.features.dashboard.presentation.DashboardActivity
import com.breezefieldsalesmalaxmi.features.login.model.WhatsappApiData
import com.breezefieldsalesmalaxmi.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}