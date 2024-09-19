package com.breezefieldsalesmalaxmi.features.location.api

import com.breezefieldsalesmalaxmi.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsalesmalaxmi.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}