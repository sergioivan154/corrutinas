package com.example.corrutinas.framework.di

import androidx.lifecycle.ViewModel
import com.example.corrutinas.framework.presentation.home.viewModel.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.hilt.migration.DisableInstallInCheck
import dagger.multibindings.IntoMap

@DisableInstallInCheck
@Module
abstract class ExampleModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun provideViewModel(viewModel: HomeViewModel): ViewModel

}

