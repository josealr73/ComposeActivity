package com.example.composeactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composeactivity.components.MyScaffold
import com.example.composeactivity.components.Screen1
import com.example.composeactivity.components.Screen2
import com.example.composeactivity.components.Screen3
import com.example.composeactivity.ui.theme.ComposeActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposeActivityTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    /** COMPONENTS **/
                    //Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
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
                        /*
                        var selected by remember {
                            mutableStateOf("Yo")
                        }
                        */
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
                        /*
                        var showAlert by remember {
                            mutableStateOf(false)
                        }

                        Button(onClick = { showAlert = true }) {
                            Text(text = "Mostrar")
                            // MyAlertDialog(show = showAlert, onDismiss = { showAlert = false }, onConfirm = { Log.i("pablo", "toquere") })
                            // MySimpleCustomDialog(show = showAlert, onDismiss = { showAlert = false } )
                            // MyCustomDialog(show = showAlert, onDismiss = { showAlert = false })
                            // MyConfirmDialog(show = showAlert, onDismiss = { showAlert = false })
                        }*/
                    // }
                    // Fin COMPONENTS.KT

                    /** LOGIN INSTAGRAM **/
                    // LoginScreen()

                    /** EJERCICIO TUITS **/
                    // TuitComponent()

                    /** RECYCLER VIEW **/
                    // SimpleRecyclerView()
                    // SuperHeroView()
                    // SuperHeroGridView()
                    // SuperHeroStickyView()
                    // SuperHeroSpecialControlView()

                    /** COMPONENTS 2 **/
                    // MyScaffold()
                    // MyBottomNavigation()

                    /** NAVIGATION **/
                    // Controla los estados de la navegación
                    val navigationController = rememberNavController()
                    NavHost(navController = navigationController, startDestination = "screen1"){
                        composable("screen1"){
                            Screen1(navigationController)
                        }

                        composable("screen2"){
                            Screen2(navigationController)
                        }

                        composable("screen3"){
                            Screen3(navigationController)
                        }
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