package com.example.lista1.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.lista1.model.Exercicio
import com.example.lista1.data.ExerciciosRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ExerciciosViewModel(
    private val repository: ExerciciosRepository = ExerciciosRepository()
) : ViewModel() {

    private val _respostas = MutableStateFlow<Map<Int, String>>(emptyMap())
    val respostas: StateFlow<Map<Int, String>> = _respostas.asStateFlow()

    val exercicios: List<Exercicio> get() = repository.exericios

    fun executar(id: Int) {
        val ex = repository.buscarPorId(id) ?: return
        _respostas.update { it + (id to ex.run()) }
    }
}