package com.breezefieldsalesmalaxmi.features.viewAllOrder.interf

import com.breezefieldsalesmalaxmi.app.domain.NewOrderProductEntity
import com.breezefieldsalesmalaxmi.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}