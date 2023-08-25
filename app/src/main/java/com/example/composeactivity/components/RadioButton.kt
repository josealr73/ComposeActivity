package com.example.composeactivity.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MyRadioButton() {
    Row(Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = false,
            onClick = { /*TODO*/ },
            enabled = false,
            colors = RadioButtonDefaults.colors(
                selectedColor = Color.Red,
                unselectedColor = Color.Yellow,
                disabledSelectedColor = Color.Green
            )
        )

        Text(text = "Ejemplo 1")
    }
}

@Composable
fun MyRadioButtonList(name: String, onItemSelected: (String) -> Unit) {
    Column(Modifier.fillMaxWidth()) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = name == "Ejemplo 1", onClick = { onItemSelected("Ejemplo 1") })
            Text(text = "Ejemplo 1", color = Color.Black)
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = name == "Ejemplo 2", onClick = { onItemSelected("Ejemplo 2") })
            Text(text = "Ejemplo 2", color = Color.Black)
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = name == "Ejemplo 3", onClick = { onItemSelected("Ejemplo 3") })
            Text(text = "Ejemplo 3", color = Color.Black)
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = name == "Ejemplo 4", onClick = { onItemSelected("Ejemplo 4") })
            Text(text = "Ejemplo 4", color = Color.Black)
        }
    }
}