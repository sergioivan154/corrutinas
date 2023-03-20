package com.example.corrutinas.data

import com.example.corrutinas.data.datasource.ExampleDataSource
import com.example.corrutinas.data.retrofit.Result
import javax.inject.Inject


class ExampleRepository @Inject constructor(
    private val exampleDataSource: ExampleDataSource
) {
    suspend fun getQuoteList(): Result<List<String>> = exampleDataSource.getQuotes()
}
