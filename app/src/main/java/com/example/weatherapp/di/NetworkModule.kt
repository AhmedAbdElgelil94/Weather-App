package com.example.weatherapp.di

import com.example.data.remote.ApiServices
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideOkHttpClient():OkHttpClient
    {
       return OkHttpClient.Builder()
           .writeTimeout(30,TimeUnit.MILLISECONDS)
           .readTimeout(30,TimeUnit.MILLISECONDS)
           .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient):Retrofit
    {
        return Retrofit.Builder()
            .baseUrl("api.openweathermap.org/data/2.5/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit):ApiServices
    {
        return retrofit.create(ApiServices::class.java)
    }
}