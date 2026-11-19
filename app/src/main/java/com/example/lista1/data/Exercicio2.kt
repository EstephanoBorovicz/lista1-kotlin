package com.example.lista1.data

import com.example.lista1.model.Exercicio

class Exercicio2: Exercicio {
    override val id = 2
    override val title = "Positivo ou Negativo"

    override fun run(): String {

        val positivoOuNegativo = (-100..100).random()

        return when {
            positivoOuNegativo > 0 -> "O número $positivoOuNegativo é positivo!"
            positivoOuNegativo < 0 -> "O número $positivoOuNegativo é negativo!"
            else -> {
                "O número $positivoOuNegativo é neutro!"
            }
        }
    }
}