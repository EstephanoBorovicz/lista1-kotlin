package com.example.lista1.model

class Pessoa(var nome: String, var idade: Int, var cidade: String) {

    fun getInfo(): String{

        return "$nome tem $idade anos e mora em $cidade"
    }
}