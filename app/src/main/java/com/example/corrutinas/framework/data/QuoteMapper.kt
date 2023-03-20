package com.example.corrutinas.framework.data

import com.example.corrutinas.data.retrofit.response.Result
import com.example.corrutinas.utils.Mapper
import javax.inject.Inject

class QuoteMapper @Inject constructor() : Mapper<List<Result>, List<String>> {

    override fun map(input: List<Result>): List<String> {
        return input.map { _input-> _input.author }
    }
}
