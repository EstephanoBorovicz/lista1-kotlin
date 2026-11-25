package com.example.lista1.model

import java.util.Locale
import kotlin.String

class ContaBancaria{

    val nomeTitular: String = "Patinhas"
    private var saldo: Double = 100000000.00

    fun depositarValor(deposito: Double): Double{
        saldo = saldo + deposito
        return saldo
    }

    fun sacarValor(saque: Double): Double{
        saldo = saldo - saque
        return saldo
    }

    fun consultarSaldo(): String{
        val saldoString = String.format(Locale.forLanguageTag("pt-br"),
        "R$ %.2f", saldo)
        return "Seu saldo é: $saldoString"
    }
}
