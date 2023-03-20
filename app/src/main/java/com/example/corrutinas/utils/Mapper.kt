package com.example.corrutinas.utils

interface Mapper<I, O> {
    fun map(input: I): O
}
