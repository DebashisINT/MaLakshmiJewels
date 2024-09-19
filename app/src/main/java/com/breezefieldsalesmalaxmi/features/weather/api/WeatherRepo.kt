package com.breezefieldsalesmalaxmi.features.weather.api

import com.breezefieldsalesmalaxmi.base.BaseResponse
import com.breezefieldsalesmalaxmi.features.task.api.TaskApi
import com.breezefieldsalesmalaxmi.features.task.model.AddTaskInputModel
import com.breezefieldsalesmalaxmi.features.weather.model.ForeCastAPIResponse
import com.breezefieldsalesmalaxmi.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}