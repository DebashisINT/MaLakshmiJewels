package com.breezefieldsalesmalaxmi.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldsalesmalaxmi.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldsalesmalaxmi.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}