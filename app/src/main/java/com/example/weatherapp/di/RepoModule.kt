package com.example.weatherapp.di

import com.example.data.remote.ApiServices
import com.example.data.repoImp.currentweatherrepoImp.CurrentWeatherRepoImp
import com.example.data.repoImp.forecastweatherrepoImp.ForecastWeatherRepoImp
import com.example.domain.repo.currentweatherrepo.CurrentWeatherRepo
import com.example.domain.repo.forecastweatherrepo.ForecastWeatherRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideCurrentWeatherRepo(apiServices: ApiServices) : CurrentWeatherRepo
    {
         return CurrentWeatherRepoImp(apiServices)
    }

    @Provides
    fun provideForecastWeatherRepo(apiServices: ApiServices) : ForecastWeatherRepo
    {
        return ForecastWeatherRepoImp(apiServices)
    }

}