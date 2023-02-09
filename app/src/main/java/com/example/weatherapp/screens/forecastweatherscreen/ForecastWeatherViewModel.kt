package com.example.weatherapp.screens.forecastweatherscreen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.entity.request.WeatherRequest
import com.example.domain.entity.response.forecastweatherresponse.ForeCastWeather
import com.example.domain.usecase.forecastweatherusecase.ForeCastWeatherUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ForecastWeatherViewModel @Inject constructor(private val foreCastWeatherUseCase: ForeCastWeatherUseCase): ViewModel(){

    private val _forecastWeatherData :MutableStateFlow<ForeCastWeather?> = MutableStateFlow(null)
    val forecastWeatherData :StateFlow<ForeCastWeather?> = _forecastWeatherData

    fun getForeCastWeatherData(weatherRequest: WeatherRequest)
    {
        viewModelScope.launch{
            try {
                foreCastWeatherUseCase.getForecastWeatherUseCase(weatherRequest)
            } catch (e: Exception) {
                Log.e("Error :", e.message.toString())
            }
        }
    }
}