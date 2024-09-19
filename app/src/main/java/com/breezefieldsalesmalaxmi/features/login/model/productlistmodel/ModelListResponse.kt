package com.breezefieldsalesmalaxmi.features.login.model.productlistmodel

import com.breezefieldsalesmalaxmi.app.domain.ModelEntity
import com.breezefieldsalesmalaxmi.app.domain.ProductListEntity
import com.breezefieldsalesmalaxmi.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}