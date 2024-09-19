package com.breezefieldsalesmalaxmi.features.activities.api

import com.breezefieldsalesmalaxmi.features.member.api.TeamApi
import com.breezefieldsalesmalaxmi.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}