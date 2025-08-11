package com.example.composeactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices.NEXUS_5X
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeactivity.components.MyButton
import com.example.composeactivity.ejercicios.Ejercicio1
import com.example.composeactivity.ejercicios.EjercicioConstraintLayout
import com.example.composeactivity.ejercicios.TuitComponent
import com.example.composeactivity.layouts.MyBasicConstraintLayout
import com.example.composeactivity.layouts.MyColumn
import com.example.composeactivity.layouts.MyComplexLayout
import com.example.composeactivity.layouts.MyRow
import com.example.composeactivity.logininsta.ui.LoginViewModel
import com.example.composeactivity.ui.theme.ComposeActivityTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposeActivityTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    /** LAYOUTS **/
                        /** BOX **/
                        // MyBox()

                        /** COLUMN/ROW **/
                        // MyColumn()
                        // MyRow()
                        // MyComplexLayout()

                        /** CONSTRAINT LAYOUT **/
                        // MyBasicConstraintLayout()

                    /** EJERCICIOS **/
                    // Ejercicio1()
                    // TuitComponent()
                    // EjercicioConstraintLayout()

                    /** COMPONENTS **/
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

                        /** COMPONENTS 2 **/
                        // MyScaffold()
                        // MyBottomNavigation()


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
                        } */
                        // }
                        // Fin COMPONENTS.KT

                        /** LOGIN INSTAGRAM **/
                        val loginViewModel: LoginViewModel by viewModels()
                        // LoginScreen(loginViewModel)

                        /** RECYCLER VIEW **/
                        // SimpleRecyclerView()
                        // SuperHeroView()
                        // SuperHeroGridView()
                        // SuperHeroStickyView()
                        // SuperHeroSpecialControlView()



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

                        /** ANIMATION **/
                        // ColorAnimationSingle()
                        // SizeAnimation()
                        // VisibilityAnimation()
                        // CrossfadeExampleAnimation()
                    }
                }
            }
        }
    }

    /** PREVIEWS **/
    /*@Preview(
        widthDp = 50,
        heightDp = 50,
        showBackground = true,
        showSystemUi = true,
        device = NEXUS_5X
    )
    @Composable
    fun PreviewExample() {
        Box(
            modifier = Modifier
                // ¿? .padding(start = 50.dp)
                .fillMaxSize(),
            contentAlignment = Alignment.Center,
        ) {
            Text("Ejemplo Pablo", Modifier.fillMaxSize())
        }
    }*/

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        ComposeActivityTheme {
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