package com.example.lista1.data

import com.example.lista1.model.Exercicio

class Exercicio7: Exercicio {
    override val id = 7
    override val title = "Contagem regressiva"

    override fun run(): String {
        val n = (1..100).random()
        return (n downTo 0).toList().toString()
    }
}