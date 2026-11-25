package com.example.lista1.data

import com.example.lista1.model.Exercicio
import com.example.lista1.model.Produto

class Exercicio18: Exercicio {
    override val id = 18
    override val title = "Array de produtos"

    override fun run(): String {

        val arrayDeProdutos = arrayOf( // objeto Produto(nome,preco) na model
            Produto("mouse",75.00),
            Produto("teclado",300.00),
            Produto("monitor", 900.00),
            Produto("cadeira de escritorio",1200.00)
        )

        val produtoMaisCaro = arrayDeProdutos.maxByOrNull { it.preco }

        return "o produto mais caro é o ${produtoMaisCaro?.nome} que custa R$ ${produtoMaisCaro?.preco}"
    }
}