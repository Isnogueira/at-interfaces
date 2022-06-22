package com.infnet.at_interfaces_a.ui.formacao

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FormacaoViewModel : ViewModel() {

    private val _formacao = MutableLiveData<String>().apply {
        value = "Graduado no ano de 2019 em Ciencias da computação pela UFRJ"
    }
    val formacao: LiveData<String> = _formacao
}