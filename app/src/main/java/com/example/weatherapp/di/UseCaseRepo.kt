package com.example.weatherapp.di

import com.example.domain.repo.currentweatherrepo.CurrentWeatherRepo
import com.example.domain.repo.forecastweatherrepo.ForecastWeatherRepo
import com.example.domain.usecase.currentweatherusecase.CurrentWeatherUseCase
import com.example.domain.usecase.forecastweatherusecase.ForeCastWeatherUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseRepo {

    @Provides
    fun provideCurrentWeatherUseCase(currentWeatherRepo: CurrentWeatherRepo):CurrentWeatherUseCase
    {
        return CurrentWeatherUseCase(currentWeatherRepo)
    }

    @Provides
    fun provideForecastWeatherUseCase(forecastWeatherRepo: ForecastWeatherRepo):ForeCastWeatherUseCase
    {
        return ForeCastWeatherUseCase(forecastWeatherRepo)
    }
}