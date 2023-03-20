package com.example.corrutinas.framework.presentation.main.view

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.corrutinas.R
import com.example.corrutinas.databinding.MainActivityBinding

class MainActivity:  AppCompatActivity() {

    lateinit var binding: MainActivityBinding

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = MainActivityBinding.inflate(layoutInflater)

        val navHostFragment = supportFragmentManager.findFragmentById(
            R.id.fragment_container
        ) as NavHostFragment
        navController = navHostFragment.navController

        navController.navInflater.inflate(R.navigation.nav_graph).apply {
            navController.setGraph(this, savedInstanceState)
        }
    }

}