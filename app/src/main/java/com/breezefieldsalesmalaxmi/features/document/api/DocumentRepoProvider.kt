package com.breezefieldsalesmalaxmi.features.document.api

import com.breezefieldsalesmalaxmi.features.dymanicSection.api.DynamicApi
import com.breezefieldsalesmalaxmi.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}