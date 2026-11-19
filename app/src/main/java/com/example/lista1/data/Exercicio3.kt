package com.example.lista1.data

import com.example.lista1.model.Exercicio

class Exercicio3: Exercicio{
    override val id = 3
    override val title = "Idade"

    override fun run(): String {

        val idade = (0..100).random()
        return when {
            idade in (0..<12) -> "Uma pessoa com $idade anos é criança!"
            idade in (12..17) -> "Uma pessoa com $idade anos é adolescente!"
            idade in (18..59) -> "Uma pessoa com $idade anos é adulta!"
            idade > 60 -> "Uma pessoa com $idade anos é idosa!"
            else -> {""}
        }
    }
}