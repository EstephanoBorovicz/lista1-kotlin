package com.example.lista1.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Exercicio(
    numeroExercicio: Int,
    atualizarValor: (String) -> Unit,
) {
    var respostaExercicio: (String) -> Unit by remember { mutableStateOf(atualizarValor) }
    Row(
        modifier = Modifier
            .background(Color.Red),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Text("Exercício $numeroExercicio:")

        Text("$atualizarValor")

        Button(
            onClick = {respostaExercicio},
            colors= ButtonDefaults.buttonColors(Color.Green)

        ) {
            Text("RNG")
        }
    }
}