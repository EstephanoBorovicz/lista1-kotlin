package com.example.lista1.data

import com.example.lista1.model.Exercicio
import java.util.Locale
import kotlin.random.Random.Default.nextFloat

class Exercicio14: Exercicio {
    override val id = 14
    override val title = "Total da compra"

    override fun run(): String {

        val listaDeCompras = List(10)
        {(0..100).random().toFloat() + nextFloat()}

        return listaDeCompras.toString()
    }
}