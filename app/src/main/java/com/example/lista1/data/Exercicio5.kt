package com.example.lista1.data

import com.example.lista1.model.Exercicio

class Exercicio5: Exercicio {
    override val id = 5
    override val title =  "Soma de um array"
    override fun run(): String {
        val array = IntArray(10){(1..100).random()}
        return "A soma dos números ${array.contentToString()} é ${array.sum()}"
    }
}