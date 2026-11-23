package com.example.lista1.data

import com.example.lista1.model.Exercicio
import com.example.lista1.model.Pessoa

class Exercicio17: Exercicio {
    override val id = 17
    override val title = "Objeto pessoa"

    override fun run(): String {

        val pessoa = Pessoa("Maria", 25, "São Paulo").getInfo()

        return pessoa
    }
}