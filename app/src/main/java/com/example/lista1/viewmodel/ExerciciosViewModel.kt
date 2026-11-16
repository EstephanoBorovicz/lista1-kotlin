package com.example.lista1.viewmodel

import androidx.compose.runtime.Composable
@Composable
fun exercicio1 (): String {

    val parOuImpar = (0..10).random()

    return when {
        parOuImpar % 2 == 0 -> "O número $parOuImpar é par!"
        else -> {
            "O número $parOuImpar é ímpar!"
        }
    }
}


fun exercicio2(): String {

    val positivoOuNegativo = (-10..10).random()

    return when {
        positivoOuNegativo > 0 -> "O número $positivoOuNegativo é positivo!"
        positivoOuNegativo < 0 -> "O número $positivoOuNegativo é negativo!"
        else -> {
            "O número $positivoOuNegativo é neutro!"
        }
    }
}

fun exercicio3(): String {

    val idade = (0..100).random()
    return when {
        idade in (0..<12) -> "Uma pessoa com $idade anos é criança!"
        idade in (12..17) -> "Uma pessoa com $idade anos é adolescente!"
        idade in (18..59) -> "Uma pessoa com $idade anos é adulta!"
        idade > 60 -> "Uma pessoa com $idade anos é idosa!"
        else -> {}
    } as String
}

fun exercicio4(): String {

    val multiplicador = (1..100).random()
    var linhas = ""

    for (i in (1..100)){
        val multiplicacao = multiplicador * i
        val linha = "$multiplicador x $i = $multiplicacao"
        linhas = linha
    }
    return linhas

}
fun exercicio5(): String {

    return String()
}

fun exercicio6(): String {

    return String()
}

fun exercicio7(): String {

    return String()
}

fun exercicio8(): String {

    return String()
}

fun exercicio9(): String {

    return String()
}

fun exercicio10(): String {

    return String()
}

fun exercicio11(): String {

    return String()
}
