package com.example.lista1

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
    var parOuImpar by remember { mutableIntStateOf((1..10).random()) }
    var positivoOuNegativo by remember { mutableStateOf((-10..10).random()) }
    var idade by remember { mutableStateOf((0..100).random()) }
    var tabuada by remember { mutableStateOf((1..100).random()) }

    Column(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Row(
            modifier = modifier,
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Text(
                text = "O número $parOuImpar é ",
                fontSize = 20.sp
            )
            Button(
                onClick = {parOuImpar = (1..10).random()}
            ) {
                Text("Gerar número aleatório! [1..10]")
            }
        }
    }
}

fun calcularParOuImpar(){
    val parOuImpar = (1..10).random()
    val respostaParOuImpar = when (parOuImpar%2 == 0) {
        "O número $parOuImpar é par!"
        else -> {}
    }
    return respostaParOuImpar
}