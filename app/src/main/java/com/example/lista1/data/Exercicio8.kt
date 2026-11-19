package com.example.lista1.data

import com.example.lista1.model.Exercicio

class Exercicio8: Exercicio {
    override val id = 8
    override val title =  "Soma de pares de um array"
    override fun run(): String {
        val array = IntArray(10){(1..100).random()}
        return "A soma dos pares do array ${array.contentToString()} é " +
                "${array.filter { it % 2 ==0 }.sum()}"
    }
}