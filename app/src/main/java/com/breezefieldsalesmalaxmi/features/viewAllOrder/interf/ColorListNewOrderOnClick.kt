package com.breezefieldsalesmalaxmi.features.viewAllOrder.interf

import com.breezefieldsalesmalaxmi.app.domain.NewOrderColorEntity
import com.breezefieldsalesmalaxmi.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}