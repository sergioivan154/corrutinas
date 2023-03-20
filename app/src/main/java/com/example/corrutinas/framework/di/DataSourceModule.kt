package com.example.corrutinas.framework.di

import com.example.corrutinas.data.datasource.ExampleDataSource
import com.example.corrutinas.framework.data.ExampleDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.migration.DisableInstallInCheck

@DisableInstallInCheck
@Module
abstract class DataSourceModule {

    @Binds
    abstract fun provideExampleDataSource(
        exampleDataSourceImpl: ExampleDataSourceImpl
    ): ExampleDataSource

}
