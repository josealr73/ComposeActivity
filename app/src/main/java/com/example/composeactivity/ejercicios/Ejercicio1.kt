package com.example.composeactivity.ejercicios

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Ejercicio1() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .background(Color.Cyan), Alignment.Center
        ) {
            Text(
                text = "Ejemplo 1", fontSize = 30.sp, fontWeight = Bold
            )
        }

        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Red)
                    .weight(1f), Alignment.Center
            ) {
                Text("Ejemplo 2", fontSize = 30.sp, fontWeight = Bold)
            }

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Green)
                    .weight(1f), Alignment.Center
            ) {
                Text("Ejemplo 3", fontSize = 30.sp, fontWeight = Bold)
            }
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .background(Color.Magenta), Alignment.Center
        ) {
            Text("Ejemplo 4", fontSize = 30.sp, fontWeight = Bold)
        }
    }
}