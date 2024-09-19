package com.breezefieldsalesmalaxmi.features.viewAllOrder.orderOptimized

import com.breezefieldsalesmalaxmi.app.domain.ProductOnlineRateTempEntity
import com.breezefieldsalesmalaxmi.base.BaseResponse
import com.breezefieldsalesmalaxmi.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}