package com.example.corrutinas.usecases

import com.example.corrutinas.data.ExampleRepository
import com.example.corrutinas.data.retrofit.Result
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(
    private val exampleRepository: ExampleRepository
) {

    suspend fun invoke(): Result<List<String>> =
        exampleRepository.getQuoteList()

}