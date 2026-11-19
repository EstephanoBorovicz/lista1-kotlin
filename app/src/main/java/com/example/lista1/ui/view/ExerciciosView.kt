package com.example.lista1.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.lista1.ui.viewmodel.ExerciciosViewModel

@Composable
fun ExerciciosScreen(
    modifier: Modifier
) {
    val viewModel: ExerciciosViewModel = viewModel()
    val respostas by viewModel.respostas.collectAsState()

    LazyColumn(modifier = modifier.fillMaxSize().padding(16.dp)) {
        items(viewModel.exercicios, key = { it.id }) { ex ->
            Column(Modifier.fillMaxWidth().padding(vertical = 8.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        "Exercício ${ex.id}: ${ex.title}",
                        modifier = Modifier.weight(1f)
                    )
                    Button(onClick = { viewModel.executar(ex.id) }) {
                        Text("RNG")
                    }
                }
                respostas[ex.id]?.let {
                    Text(it, color = MaterialTheme.colorScheme.primary)
                }
                HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)
            }
        }
    }
}