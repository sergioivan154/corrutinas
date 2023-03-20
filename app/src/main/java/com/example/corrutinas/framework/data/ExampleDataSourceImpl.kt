package com.example.corrutinas.framework.data

import com.example.corrutinas.data.datasource.ExampleDataSource
import com.example.corrutinas.data.retrofit.QuotesApi
import com.example.corrutinas.data.retrofit.Result
import javax.inject.Inject

class ExampleDataSourceImpl @Inject constructor(
    private val quotesApi: QuotesApi,
    private val quoteMapper: QuoteMapper
) : ExampleDataSource {

    override suspend fun getQuotes(): Result<List<String>> {
        return try {
            val carsResult = quotesApi.getQuotes().await()
            Result.Success(quoteMapper.map(carsResult.results))
        } catch (e: Exception) {
            Result.Error(e)
        }
    }

}
