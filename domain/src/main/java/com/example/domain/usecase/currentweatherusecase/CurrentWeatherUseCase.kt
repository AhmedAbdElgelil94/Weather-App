package com.example.domain.usecase.currentweatherusecase

import com.example.domain.entity.request.WeatherRequest
import com.example.domain.entity.response.currentweatherresponse.CurrentWeather
import com.example.domain.repo.currentweatherrepo.CurrentWeatherRepo

class CurrentWeatherUseCase (private val currentWeatherRepo: CurrentWeatherRepo){

      suspend fun getCurrentWeatherUseCase(weatherRequest: WeatherRequest) : CurrentWeather = currentWeatherRepo.getCurrentWeather(weatherRequest)

}