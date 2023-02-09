package com.example.domain.repo.forecastweatherrepo

import com.example.domain.entity.request.WeatherRequest
import com.example.domain.entity.response.forecastweatherresponse.ForeCastWeather

interface ForecastWeatherRepo {

    fun getForecastWeather(weatherRequest: WeatherRequest): ForeCastWeather

}