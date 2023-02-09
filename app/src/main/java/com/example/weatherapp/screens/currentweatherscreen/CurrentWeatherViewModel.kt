package com.example.weatherapp.screens.currentweatherscreen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.entity.request.WeatherRequest
import com.example.domain.entity.response.currentweatherresponse.CurrentWeather
import com.example.domain.usecase.currentweatherusecase.CurrentWeatherUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CurrentWeatherViewModel @Inject constructor(private val currentWeatherUseCase: CurrentWeatherUseCase) :ViewModel(){

    private val _currentWeatherData : MutableStateFlow<CurrentWeather?> = MutableStateFlow(null)
    val currentWeatherData : StateFlow<CurrentWeather?> = _currentWeatherData

    fun getDataCurrentWeather(weatherRequest: WeatherRequest)
    {
        viewModelScope.launch {
            try {
              _currentWeatherData.value = currentWeatherUseCase.getCurrentWeatherUseCase(weatherRequest)
            }
            catch (e:Exception)
            {
                Log.e("Exception Error:",e.message.toString())
            }
        }
    }
}