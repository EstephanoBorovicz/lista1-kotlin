package com.example.lista1.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Exercicio(
    numeroExercicio: Int,
    updateValue: String,
) {
    Row(
        modifier = Modifier
            .background(Color.Red),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Text("Exercício $numeroExercicio:")

        Text(updateValue)

        Button(
            onClick = {updateValue},
            colors= ButtonDefaults.buttonColors(Color.Green)

        ) {
            Text("RNG")
        }
    }
}