package com.example.lista1.data

import androidx.collection.IntList
import com.example.lista1.model.Exercicio

class Exercicio13: Exercicio {
    override val id = 13
    override val title = "Ímpares"
    override fun run(): String {
        val lista = IntList(10) {(1..100).random()}
        val impares = lista.filter { it % 2 != 0 }.toList().sorted()
        return "Lista: ${array.contentToString()} \n Lista de ímpares:  $impares"
    }
}