package com.example.domain.entity.response.forecastweatherresponse



data class DataWeather(
    val clouds: Clouds,
    val dt:Int,
    val dt_txt:String,
    val main: Main,
    val pop:Double,
    val snow: Snow,
    val sys: Sys,
    val visibility: Int,
    val weather : List<Weather>,
    val wind: Wind
)
