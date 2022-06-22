package com.infnet.at_interfaces_a.ui.experiencia

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExperienciaViewModel : ViewModel() {

    private val _experiencia = MutableLiveData<String>().apply {
        value = "Backend developer na Empresa X desde 2020"
    }
    val experiencia: LiveData<String> = _experiencia
}