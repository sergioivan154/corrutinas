package com.example.corrutinas.framework.di

import com.example.corrutinas.data.retrofit.QuotesApi
import com.example.corrutinas.domain.Constants.Companion.BASE_URL
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@DisableInstallInCheck
@Module
object NetworkModule {

    @Provides
    fun providesApiService (
        gson: Gson
    ): QuotesApi =  Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(QuotesApi::class.java)
}
