package com.breezefieldsalesmalaxmi.features.login.model.opportunitymodel

import com.breezefieldsalesmalaxmi.app.domain.OpportunityStatusEntity
import com.breezefieldsalesmalaxmi.app.domain.ProductListEntity
import com.breezefieldsalesmalaxmi.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}