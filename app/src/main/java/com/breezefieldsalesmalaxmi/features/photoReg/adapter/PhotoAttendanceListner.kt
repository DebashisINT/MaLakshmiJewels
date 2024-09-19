package com.breezefieldsalesmalaxmi.features.photoReg.adapter

import com.breezefieldsalesmalaxmi.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}