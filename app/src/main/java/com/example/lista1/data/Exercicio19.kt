package com.example.lista1.data

import com.example.lista1.model.ContaBancaria
import com.example.lista1.model.Exercicio
import java.util.Locale
import kotlin.String

class Exercicio19: Exercicio {
    override val id = 19
    override val title = "Conta bancária"

    override fun run(): String {
        val contaBancaria = ContaBancaria()
        return "Nome do titular: ${contaBancaria.nomeTitular} \n " +
                contaBancaria.consultarSaldo()
    }
}