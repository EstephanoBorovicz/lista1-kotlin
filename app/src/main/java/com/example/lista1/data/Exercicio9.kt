package com.example.lista1.data

import com.example.lista1.model.Exercicio

class Exercicio9: Exercicio {
    override val id = 9
    override val title = "Dobro"
    override fun run(): String {
        val n = (1..1000).random()
        return "O dobro de $n é ${n*2}!"
    }
}