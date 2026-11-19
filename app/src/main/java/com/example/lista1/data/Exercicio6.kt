package com.example.lista1.data

import com.example.lista1.model.Exercicio

class Exercicio6: Exercicio {
    override val id = 6
    override val title = "Maior número em um array"
    override fun run(): String {
        val array = IntArray(10){(1..100).random()}
        return "O maior número no array ${array.contentToString()} é ${array.maxOrNull()}"
    }
}