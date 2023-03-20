package com.example.corrutinas.framework.presentation.home.view

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.corrutinas.databinding.HomeFragmentBinding
import com.example.corrutinas.framework.di.ViewModelFactory
import com.example.corrutinas.framework.presentation.home.viewModel.HomeViewModel
import com.example.corrutinas.utils.extensionFunctions.observe
import javax.inject.Inject


class HomeFragment @Inject constructor(): Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    lateinit var binding: HomeFragmentBinding

    private val viewModel: HomeViewModel by viewModels { viewModelFactory }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = HomeFragmentBinding.inflate(layoutInflater)
        observes()
        setup()
    }

    private fun observes() {
        viewModel.apply {
            observe(result) { processResult() }
        }
    }

    private fun setup() {
        viewModel.setup()
    }

    private fun processResult() {
        Toast.makeText(requireContext(), "response", Toast.LENGTH_SHORT).show()
    }

}