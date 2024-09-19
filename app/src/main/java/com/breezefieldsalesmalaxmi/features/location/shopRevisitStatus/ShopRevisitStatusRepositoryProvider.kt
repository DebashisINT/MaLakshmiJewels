package com.breezefieldsalesmalaxmi.features.location.shopRevisitStatus

import com.breezefieldsalesmalaxmi.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsalesmalaxmi.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}