package com.infnet.at_interfaces_a.ui.cursos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CursoViewModel : ViewModel() {

    private val _curso = MutableLiveData<String>().apply {
        value = "Curso complementar de certificado Java"
    }
    val curso: LiveData<String> = _curso
}