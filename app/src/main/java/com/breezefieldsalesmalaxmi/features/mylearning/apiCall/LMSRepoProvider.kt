package com.breezefieldsalesmalaxmi.features.mylearning.apiCall

import com.breezefieldsalesmalaxmi.features.login.api.opportunity.OpportunityListApi
import com.breezefieldsalesmalaxmi.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}