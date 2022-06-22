package com.infnet.at_interfaces_a.ui.informacoesPessoais

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InfomacoesViewModel : ViewModel() {

    private val _nome = MutableLiveData<String>().apply {
        value = "João dos Santos"
    }
    val nome: LiveData<String> = _nome

    private val _idade = MutableLiveData<String>().apply {
        value = "24 anos"
    }
    val idade: LiveData<String> = _idade

    private val _email = MutableLiveData<String>().apply {
        value = "joãozinho@gmail.com"
    }
    val email: LiveData<String> = _email
}