package com.breezefieldsalesmalaxmi.features.stock.model

import com.breezefieldsalesmalaxmi.base.BaseResponse


/**
 * Created by Saikat on 17-09-2019.
 */
class NewStockListResponseModel : BaseResponse() {
    var stock_list: ArrayList<StockListDataModel>? = null
}