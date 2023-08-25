package com.example.composeactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeactivity.components.MyButton
import com.example.composeactivity.components.MyCheckBoxWithTextCompleted
import com.example.composeactivity.components.MyIcon
import com.example.composeactivity.components.MyImage
import com.example.composeactivity.components.MyImageAdvance
import com.example.composeactivity.components.MyOutlinedButton
import com.example.composeactivity.components.MyProgress
import com.example.composeactivity.components.MyProgressAdvance
import com.example.composeactivity.components.MyRadioButtonList
import com.example.composeactivity.components.MySwitch
import com.example.composeactivity.components.MyTextButton
import com.example.composeactivity.components.MyTextField
import com.example.composeactivity.components.MyTextFieldAdvance
import com.example.composeactivity.components.MyTextFieldOutlined
import com.example.composeactivity.components.MyTriStatusCheckbox
import com.example.composeactivity.components.getOptions
import com.example.composeactivity.ui.theme.ComposeActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            ComposeActivityTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                    // modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        /** TEXT y TEXTFIELD **/
                        // MyText()
                        // MyTextField(name = , onValueChanged = )
                        // MyTextFieldAdvance()
                        // MyTextFieldOutlined()

                        /** BUTTON **/
                        // MyButton()
                        // MyOutlinedButton()
                        // MyTextButton()

                        /** IMAGE **/
                        // MyIcon()
                        // MyImage()
                        // MyImageAdvance()

                        /** PROGRESSBAR **/
                        // MyProgress()
                        // MyProgressAdvance()

                        /** SWITCH **/
                        // MySwitch()

                        /** CHECKBOX **/
                        // MyCheckBox()
                        // MyCheckBoxWithText()
                        // MyTriStatusCheckbox()
                        // ¿? MyCheckBoxWithTextCompleted(getOptions(titles = "Paco"))

                        /** RADIOBUTTON **/
                        var selected by remember {
                            mutableStateOf("Yo")
                        }

                        // MyRadioButton()
                        // MyRadioButtonList(selected) { selected = it }

                        /** OTHER COMPONENTS **/
                        // MyCard()
                        // MyBadgeBox()
                        // MyDivider()
                        // MyDropDownMenu()

                        /** SLIDER **/
                        // MyBasicSlider()
                        // MyAdvancedSlider()

                        /** DIALOGS **/
                        var showAlert by remember {
                            mutableStateOf(false)
                        }

                        /*
                        Button(onClick = { showAlert = true }) {
                            Text(text = "Mostrar")
                            // MyAlertDialog(show = showAlert, onDismiss = { showAlert = false }, onConfirm = { Log.i("pablo", "toquere") })
                            // MySimpleCustomDialog(show = showAlert, onDismiss = { showAlert = false } )
                            // MyCustomDialog(show = showAlert, onDismiss = { showAlert = false })
                            // MyConfirmDialog(show = showAlert, onDismiss = { showAlert = false })
                        }*/
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeActivityTheme {

    }
}