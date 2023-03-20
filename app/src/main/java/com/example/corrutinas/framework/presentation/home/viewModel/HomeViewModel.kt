package com.example.corrutinas.framework.presentation.home.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.corrutinas.data.retrofit.Result
import com.example.corrutinas.usecases.GetQuotesUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val getQuotesUseCase: GetQuotesUseCase
): ViewModel() {

    private val _resultMLD: MutableLiveData<Unit> = MutableLiveData()
    val result: LiveData<Unit> = _resultMLD

    fun setup() {

        viewModelScope.launch {
            val result = getQuotesUseCase.invoke()
            if (result is Result.Success) {
                _resultMLD.value = Unit
            } else {
                Log.i("log", "error")
            }
        }
    }
}