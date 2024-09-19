package com.breezefieldsalesmalaxmi.features.viewAllOrder.model

import com.breezefieldsalesmalaxmi.app.domain.NewOrderColorEntity
import com.breezefieldsalesmalaxmi.app.domain.NewOrderGenderEntity
import com.breezefieldsalesmalaxmi.app.domain.NewOrderProductEntity
import com.breezefieldsalesmalaxmi.app.domain.NewOrderSizeEntity
import com.breezefieldsalesmalaxmi.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

