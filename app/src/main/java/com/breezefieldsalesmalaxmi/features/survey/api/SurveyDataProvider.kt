package com.breezefieldsalesmalaxmi.features.survey.api

import com.breezefieldsalesmalaxmi.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefieldsalesmalaxmi.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}