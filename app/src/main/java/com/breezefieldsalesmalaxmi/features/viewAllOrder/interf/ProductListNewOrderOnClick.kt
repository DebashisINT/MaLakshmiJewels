package com.breezefieldsalesmalaxmi.features.viewAllOrder.interf

import com.breezefieldsalesmalaxmi.app.domain.NewOrderGenderEntity
import com.breezefieldsalesmalaxmi.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}