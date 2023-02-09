package com.example.data.repoImp.currentweatherrepoImp

import com.example.data.remote.ApiServices
import com.example.domain.entity.request.WeatherRequest
import com.example.domain.entity.response.currentweatherresponse.CurrentWeather
import com.example.domain.repo.currentweatherrepo.CurrentWeatherRepo

class CurrentWeatherRepoImp (private val apiServices: ApiServices): CurrentWeatherRepo {
    override fun getCurrentWeather(weatherRequest: WeatherRequest): CurrentWeather {
       return apiServices.getCurrentWeatherData(
           weatherRequest.lat,
           weatherRequest.lon,
           weatherRequest.appid,
           weatherRequest.q,
           weatherRequest.units
       )
    }
}