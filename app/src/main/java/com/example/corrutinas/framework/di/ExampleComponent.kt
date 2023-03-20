package com.example.corrutinas.framework.di

import android.content.Context
import com.example.corrutinas.framework.presentation.home.view.HomeFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [ExampleModuleDependencies::class],
    modules = [
        ExampleModule::class,
        DataSourceModule::class,
        NetworkModule::class
    ]
)
interface ExampleComponent {

    fun injectFragment(fragment: HomeFragment)

    @Component.Builder
    interface Builder {
        fun context(@BindsInstance context: Context): Builder
        fun moduleDependencies(paperWorkModuleDependencies: ExampleModuleDependencies): Builder
        fun build(): ExampleComponent
    }
}
