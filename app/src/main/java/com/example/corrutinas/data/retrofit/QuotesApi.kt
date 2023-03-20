package com.example.corrutinas.data.retrofit

import com.example.corrutinas.data.retrofit.response.QuoteList
import kotlinx.coroutines.Deferred
import retrofit2.http.GET

interface QuotesApi {

    @GET("/quotes")
    suspend fun getQuotes() : Deferred<QuoteList>
}