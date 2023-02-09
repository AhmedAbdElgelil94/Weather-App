package com.example.data.repoImp.forecastweatherrepoImp

import com.example.data.remote.ApiServices
import com.example.domain.entity.request.WeatherRequest
import com.example.domain.entity.response.forecastweatherresponse.ForeCastWeather
import com.example.domain.repo.forecastweatherrepo.ForecastWeatherRepo

class ForecastWeatherRepoImp (private  val apiServices: ApiServices): ForecastWeatherRepo {
    override fun getForecastWeather(weatherRequest: WeatherRequest): ForeCastWeather {
        return apiServices.getForecastWeatherData(
            weatherRequest.lat,
            weatherRequest.lon,
            weatherRequest.appid,
            weatherRequest.q,
            weatherRequest.units,
            weatherRequest.cnt
        )
    }
}