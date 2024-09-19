package com.breezefieldsalesmalaxmi.features.weather.api

import com.breezefieldsalesmalaxmi.features.task.api.TaskApi
import com.breezefieldsalesmalaxmi.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}