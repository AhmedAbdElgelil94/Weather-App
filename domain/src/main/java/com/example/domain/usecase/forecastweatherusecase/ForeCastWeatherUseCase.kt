package com.example.domain.usecase.forecastweatherusecase

import com.example.domain.entity.request.WeatherRequest
import com.example.domain.entity.response.forecastweatherresponse.ForeCastWeather
import com.example.domain.repo.forecastweatherrepo.ForecastWeatherRepo

class ForeCastWeatherUseCase (private val forecastWeatherRepo: ForecastWeatherRepo){

   suspend fun getForecastWeatherUseCase(weatherRequest: WeatherRequest) : ForeCastWeather = forecastWeatherRepo.getForecastWeather(weatherRequest)
}