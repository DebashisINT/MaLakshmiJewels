package com.breezefieldsalesmalaxmi.features.viewAllOrder.interf

import com.breezefieldsalesmalaxmi.app.domain.NewOrderGenderEntity
import com.breezefieldsalesmalaxmi.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}