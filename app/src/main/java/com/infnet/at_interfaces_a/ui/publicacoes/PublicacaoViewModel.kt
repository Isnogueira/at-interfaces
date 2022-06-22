package com.infnet.at_interfaces_a.ui.publicacoes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PublicacaoViewModel : ViewModel() {

    private val _publicacao = MutableLiveData<String>().apply {
        value = "Artigo sobre Java - Escrito por João dos Santos"
    }
    val publicacao: LiveData<String> = _publicacao
}