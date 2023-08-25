package com.example.composeactivity.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.composeactivity.R

@Composable
fun MyAlertDialog(show: Boolean, onDismiss: () -> Unit, onConfirm: () -> Unit) {
    if (show) {
        AlertDialog(
            onDismissRequest = { onDismiss() },
            title = { Text(text = "Titulo") },
            text = { Text(text = "Jose Pedro") },
            confirmButton = {
                TextButton(onClick = { onConfirm() }) {
                    Text(text = "Aceptar")
                }
            },
            dismissButton = {
                TextButton(onClick = { onDismiss() }) {
                    Text(text = "No se")
                }
            }
        )
    }
}

@Composable
fun MySimpleCustomDialog(show: Boolean, onDismiss: () -> Unit) {
    if (show) {
        Dialog(
            onDismissRequest = { onDismiss() },
            properties = DialogProperties(dismissOnBackPress = false, dismissOnClickOutside = false)
        ) {
            Column(
                Modifier
                    .background(Color.Red)
                    .padding(24.dp)
                    .fillMaxWidth()
            ) {
                Text(text = "Ejemplo")
            }
        }
    }
}

@Composable
fun MyCustomDialog(show: Boolean, onDismiss: () -> Unit) {
    Dialog(onDismissRequest = { /*TODO*/ }) {
        Column(
            Modifier
                .background(Color.Red)
                .padding(24.dp)
                .fillMaxWidth()
        ) {
            MyTitleDialog(text = "Pablo")
            AccountItemDialog(email = "pablo@gmail.com", drawable = R.drawable.ic_launcher_background)
            AccountItemDialog(email = "pablo@gmail.com", drawable = R.drawable.ic_launcher_background)
            AccountItemDialog(email = "pablo@gmail.com", drawable = R.drawable.ic_launcher_background)
            AccountItemDialog(email = "Añadir cuenta", drawable = R.drawable.ic_launcher_foreground)
        }
    }
}

@Composable
fun MyConfirmDialog(show: Boolean, onDismiss: () -> Unit) {
    if (show) {
        Dialog(onDismissRequest = { onDismiss() }) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                MyTitleDialog(text = "Phone ringtones", modifier = Modifier.padding(24.dp))
                Divider(Modifier.fillMaxWidth(), color = Color.LightGray)
                var status by remember {
                    mutableStateOf("")
                }
                MyRadioButtonList(name = status, onItemSelected = { status = it })
                Divider(Modifier.fillMaxWidth(), color = Color.LightGray)
                Row(
                    Modifier
                        .align(Alignment.End)
                        .padding(10.dp)){
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(text = "Cancelar")
                    }

                    TextButton(onClick = { /*TODO*/ }) {
                        Text(text = "Aceptar")
                    }
                }
            }
        }
    }
}

@Composable
fun MyTitleDialog(text: String, modifier: Modifier = Modifier.padding(bottom = 12.dp)) {
    Text(
        text = text,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        color = Color.Black,
        modifier = modifier
    )
}

@Composable
fun AccountItemDialog(email: String, @DrawableRes drawable: Int) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = drawable),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(8.dp)
                .size(40.dp)
                .clip(CircleShape)
        )

        Text(text = email, fontSize = 14.sp, color = Color.Gray, modifier = Modifier.padding(8.dp))
    }
}