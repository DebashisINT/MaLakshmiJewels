package com.breezefieldsalesmalaxmi.features.photoReg.present

import com.breezefieldsalesmalaxmi.app.domain.ProspectEntity
import com.breezefieldsalesmalaxmi.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}