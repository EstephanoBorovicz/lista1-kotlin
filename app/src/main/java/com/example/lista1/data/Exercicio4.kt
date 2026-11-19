package com.example.lista1.data

import com.example.lista1.model.Exercicio

class Exercicio4: Exercicio {
    override val id = 4
    override val title = "Tabuada"

    override fun run(): String {
        val multiplicador = (1..100).random()
        val multiplicacao = (1..10).joinToString(", \n")
        {
            "$multiplicador x $it = ${multiplicador*it}"
        }
        return "Tabuada do $multiplicador: \n" +
                multiplicacao
    }
}