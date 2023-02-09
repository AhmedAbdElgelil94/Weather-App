package com.example.domain.entity.request

data class WeatherRequest(
    var lat: Double?,
    var lon: Double?,
    var appid: String,
    var q: String?,
    var units: String?,
    var cnt: Int?
)
