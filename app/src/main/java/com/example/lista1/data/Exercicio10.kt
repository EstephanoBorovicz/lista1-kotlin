package com.example.lista1.data

import com.example.lista1.model.Exercicio

class Exercicio10: Exercicio {
    override val id = 10
    override val title = "Média do alunos"

    override fun run(): String {
        val notas = IntArray(3){(1..10).random()}
        val media = notas.sum()/notas.size
        return "As notas do aluno são: ${notas[0]},${notas[1]} e ${notas[2]} " +
                "e a média do aluno é: $media"
    }
}