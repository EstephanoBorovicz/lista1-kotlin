package com.example.lista1.data

import com.example.lista1.model.Exercicio

class Exercicio1: Exercicio{
    override val id = 1
    override val title = "Par ou Ímpar"
    override fun run(): String{
        val n = (1..100).random()
        return "O número $n é ${
            if (n%2==0) "par"
            else "ímpar"
        }!"
        }
    }
