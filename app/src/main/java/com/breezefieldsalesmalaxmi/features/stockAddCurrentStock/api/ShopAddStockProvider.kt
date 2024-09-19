package com.breezefieldsalesmalaxmi.features.stockAddCurrentStock.api

import com.breezefieldsalesmalaxmi.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldsalesmalaxmi.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}