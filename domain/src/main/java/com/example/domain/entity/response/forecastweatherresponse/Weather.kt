package com.example.domain.entity.response.forecastweatherresponse

data class Weather(
    val description: String,
    val icon: String,
    val id: Int,
    val main: String
)