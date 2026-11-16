package com.example.lista1.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.lista1.viewmodel.exercicio1
import com.example.lista1.viewmodel.exercicio10
import com.example.lista1.viewmodel.exercicio11
import com.example.lista1.viewmodel.exercicio2
import com.example.lista1.viewmodel.exercicio3
import com.example.lista1.viewmodel.exercicio4
import com.example.lista1.viewmodel.exercicio5
import com.example.lista1.viewmodel.exercicio6
import com.example.lista1.viewmodel.exercicio7
import com.example.lista1.viewmodel.exercicio8
import com.example.lista1.viewmodel.exercicio9

@Composable
fun Exercicios(
    modifier: Modifier
) {

    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Exercicio(1, exercicio1())
        Exercicio(2, exercicio2())
        Exercicio(3, exercicio3())
        Exercicio(4, exercicio4())
        Exercicio(5, exercicio5())
        Exercicio(6, exercicio6())
        Exercicio(7, exercicio7())
        Exercicio(8, exercicio8())
        Exercicio(9, exercicio9())
        Exercicio(10, exercicio10())
        Exercicio(11, exercicio11())

    }

}