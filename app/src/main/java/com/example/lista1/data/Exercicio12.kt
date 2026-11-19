package com.example.lista1.data

import com.example.lista1.model.Exercicio

class Exercicio12: Exercicio {
    override val id = 12
    override val title = "Batata Quente!"

    override fun run(): String {

        val batataQuente =
            (1..100).joinToString(", \n"){
                n -> when {
                    n % 15 == 0 -> "BatataQuente"
                    n % 3  == 0 -> "batata"
                    n % 5  == 0 -> "Quente"
                else -> n.toString()
                }
            }
        return batataQuente
    }
}