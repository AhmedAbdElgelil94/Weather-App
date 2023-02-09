package com.example.domain.repo.currentweatherrepo

import com.example.domain.entity.request.WeatherRequest
import com.example.domain.entity.response.currentweatherresponse.CurrentWeather

interface CurrentWeatherRepo {

    fun getCurrentWeather(weatherRequest: WeatherRequest): CurrentWeather
}