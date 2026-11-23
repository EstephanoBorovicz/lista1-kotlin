package com.example.lista1.data

import com.example.lista1.model.Exercicio

class Exercicio16: Exercicio {
    override val id = 16
    override val title = "Fatorial de uma variável numérica"

    override fun run(): String {
        val n = (1..12).random() //máximo para int
        var fatorial = 1

        for (i in 1..n) {
            fatorial *= i
        }
        return "Variável numérica: $n  \n Fatorial: $fatorial"
    }
}