package com.breezefieldsalesmalaxmi.features.viewAllOrder.interf

import com.breezefieldsalesmalaxmi.app.domain.NewOrderGenderEntity
import com.breezefieldsalesmalaxmi.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}