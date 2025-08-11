package com.example.composeactivity.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun MyRow(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.Center,
        Alignment.Top
    ) {
        Text(
            "Hola 1", modifier = Modifier
                .background(Color.Red)
                .weight(1f)
        )
        Text(
            "Hola 2", modifier = Modifier
                .background(Color.Yellow)
                .weight(1f)
        )
        Text(
            "Hola 3", modifier = Modifier
                .background(Color.Blue)
                .weight(1f)
        )
        Text(
            "Hola 4", modifier = Modifier
                .background(Color.Cyan)
                .weight(1f)
        )
    }
}