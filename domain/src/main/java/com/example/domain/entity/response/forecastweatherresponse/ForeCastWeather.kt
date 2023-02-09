package com.example.domain.entity.response.forecastweatherresponse

data class ForeCastWeather(
    val city: City,
    val cnt: Int,
    val cod: String,
    val list: List<DataWeather>,
    val message: Int
)