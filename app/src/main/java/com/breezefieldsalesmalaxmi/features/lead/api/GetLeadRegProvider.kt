package com.breezefieldsalesmalaxmi.features.lead.api

import com.breezefieldsalesmalaxmi.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldsalesmalaxmi.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}