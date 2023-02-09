package com.example.data.remote

import com.example.domain.entity.response.currentweatherresponse.CurrentWeather
import com.example.domain.entity.response.forecastweatherresponse.ForeCastWeather
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {

    @GET("weather")
    fun getCurrentWeatherData(
        @Query("lat") lat: Double?,
        @Query("lon") lon:Double?,
        @Query("appid") appid:String,
        @Query("q") q:String?,
        @Query("units") units:String?
    ):CurrentWeather


    @GET("forecast")
    fun getForecastWeatherData(
        @Query("lat") lat: Double?,
        @Query("lon") lon:Double?,
        @Query("appid") appid:String,
        @Query("q") q:String?,
        @Query("units") units:String?,
        @Query("cnt") cnt:Int?
    ):ForeCastWeather


}