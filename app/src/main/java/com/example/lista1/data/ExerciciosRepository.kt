package com.example.lista1.data

import com.example.lista1.model.Exercicio

class ExerciciosRepository {

    val exericios: List<Exercicio> = listOf(
        Exercicio1(),
        Exercicio2(),
        Exercicio3(),
        Exercicio4(),
        Exercicio5(),
        Exercicio6(),
        Exercicio7(),
        Exercicio8(),
        Exercicio9(),
        Exercicio10(),
        Exercicio11(),
        Exercicio12(),
        Exercicio13(),
        Exercicio14()
    ).sortedBy{it.id}

    fun buscarPorId(id: Int): Exercicio? =
        exericios.firstOrNull { it.id == id }
}