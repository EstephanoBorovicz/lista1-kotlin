package com.example.lista1

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CheckboxDefaults.colors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lista1.components.Exercicio
import com.example.lista1.ui.theme.Lista1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lista1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Exercicios(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Exercicios(
    modifier: Modifier = Modifier
) {
    var parOuImpar by remember { mutableStateOf("") }
    var positivoOuNegativo by remember { mutableStateOf("") }
    var idade by remember { mutableStateOf("") }
    var tabuada by remember { mutableStateOf("") }
    var somaArray by remember { mutableStateOf("") }
    var maiorNumeroArray by remember { mutableStateOf("") }
    var contagemRegressiva by remember { mutableStateOf("") }
    var numeroDobrado by remember { mutableStateOf("") }
    var mediaAluno by remember { mutableStateOf("") }
    var temperaturaFahrenheit by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Exercicio(1,calcularParouImpar())

fun calcularParOuImpar (): String {

    val parOuImpar = (0..10).random()

    return when {
        parOuImpar % 2 == 0 -> "O número $parOuImpar é par!"
        else -> {
            "O número $parOuImpar é ímpar!"
        }
    }
}

fun calcularPositivoOuNegativo (): String {

    val positivoOuNegativo = (-10..10).random()

    return when {
        positivoOuNegativo > 0 -> "O número $positivoOuNegativo é positivo!"
        positivoOuNegativo < 0 -> "O número $positivoOuNegativo é negativo!"
        else -> {
            "O número $positivoOuNegativo é neutro!"
        }
    }
}

fun classificarIdade (): String {

    val idade = (0..100).random()
    return when {
        idade in (0..<12) -> "Uma pessoa com $idade anos é criança!"
        idade in (12..17) -> "Uma pessoa com $idade anos é adolescente!"
        idade in (18..59) -> "Uma pessoa com $idade anos é adulta!"
        idade > 60 -> "Uma pessoa com $idade anos é idosa!"
        else -> {}
    } as String
}