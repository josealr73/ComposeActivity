package com.example.composeactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.composeactivity.components.MyScaffold
import com.example.composeactivity.components.Screen1
import com.example.composeactivity.components.Screen2
import com.example.composeactivity.components.Screen3
import com.example.composeactivity.components.Screen4
import com.example.composeactivity.components.Screen5
import com.example.composeactivity.logininsta.LoginScreen
import com.example.composeactivity.model.Routes
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
                    LoginScreen()

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

/*                    val navigationController = rememberNavController()
                    NavHost(
                        navController = navigationController,
                        startDestination = Routes.Pantalla1.route
                    ) {
                        composable(Routes.Pantalla1.route) {
                            Screen1(navigationController)
                        }

                        composable(Routes.Pantalla2.route) {
                            Screen2(navigationController)
                        }

                        composable(Routes.Pantalla3.route) {
                            Screen3(navigationController)
                        }

                        composable(
                            Routes.Pantalla4.route,
                            arguments = listOf(navArgument("age") { type = NavType.IntType })
                        ) { backStackEntry ->
                            Screen4(
                                navigationController, backStackEntry.arguments?.getInt("age") ?: 0
                            )
                        }

                        composable(
                            Routes.Pantalla5.route,
                            arguments = listOf(navArgument("name", { defaultValue = "" }))
                        ) { backStackEntry ->
                            Screen5(
                                navigationController,
                                backStackEntry.arguments?.getString("name")
                            )
                        }
                    }
                }*/
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeActivityTheme {
        //LoginScreen()
        /** NAVIGATION **/
        /*
        val navigationController = rememberNavController()
        NavHost(
            navController = navigationController,
            startDestination = Routes.Pantalla1.route
        ) {
            composable(Routes.Pantalla1.route) {
                Screen1(navigationController)
            }

            composable(Routes.Pantalla2.route) {
                Screen2(navigationController)
            }

            composable(Routes.Pantalla3.route) {
                Screen3(navigationController)
            }

            composable(
                Routes.Pantalla4.route,
                arguments = listOf(navArgument("age") { type = NavType.IntType })
            ) { backStackEntry ->
                Screen4(
                    navigationController, backStackEntry.arguments?.getInt("age") ?: 0
                )
            }

            composable(
                Routes.Pantalla5.route,
                arguments = listOf(navArgument("name", { defaultValue = "" }))
            ) { backStackEntry ->
                Screen5(
                    navigationController,
                    backStackEntry.arguments?.getString("name")
                )
            }
            */
        }
    }
}