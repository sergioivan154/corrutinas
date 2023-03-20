package com.example.corrutinas.framework.di

import android.app.Application
import com.google.gson.Gson
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface ExampleModuleDependencies {
    fun appApplication(): Application
    fun gson(): Gson

}
