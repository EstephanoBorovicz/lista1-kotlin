package com.example.lista1.data

import com.example.lista1.model.Exercicio

class Exercicio15: Exercicio {
    override val id = 15
    override val title = "Média dos maiores de Idade"

    override fun run(): String {
        val listaDeIdades = List(10,{(0..100).random()})

        val listaDeMaioresDeIdade = listaDeIdades.filter { it>18 }

        val mediaDeMaioresDeIdade = listaDeMaioresDeIdade.sum()/listaDeMaioresDeIdade.size
        return "Lista de Idades: $listaDeIdades \n Lista de maiores de idade: " +
                "$listaDeMaioresDeIdade \n Média de idade dos maiores de idade: $mediaDeMaioresDeIdade"
    }
}