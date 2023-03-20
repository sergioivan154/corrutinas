package com.example.corrutinas.data.datasource

import com.example.corrutinas.data.retrofit.Result

interface ExampleDataSource {
    suspend fun getQuotes(): Result<List<String>>
}
