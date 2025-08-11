package com.example.composeactivity.ejercicios

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Preview(showBackground = true)
@Composable
fun EjercicioConstraintLayout(){
    val big = 160
    val small = 75

    Column(Modifier.fillMaxSize()) {
        Spacer(Modifier.height(100.dp).fillMaxWidth())
        ConstraintLayout(Modifier.fillMaxSize()) {
            val (boxCyan, boxBlack, boxDarkGrey, boxMagenta, boxGreen, boxGrey, boxYellow, boxBlue, boxRed) = createRefs()

            Box(Modifier.height(big.dp).width(big.dp).background(Color.Cyan).constrainAs(boxCyan){
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            })

            Box(Modifier.height(big.dp).width(big.dp).background(Color.Gray).constrainAs(boxDarkGrey){
                top.linkTo(parent.top)
                end.linkTo(parent.end)
            })

            Box(Modifier.height(small.dp).width(small.dp).background(Color.Black).constrainAs(boxBlack){
                top.linkTo(parent.top/*, margin = 50.dp*/)
                start.linkTo(boxCyan.end)
                end.linkTo(boxDarkGrey.start)
                bottom.linkTo(boxCyan.bottom)
                //width = Dimension.fillToConstraints
                //height = Dimension.fillToConstraints.atMost(75.dp).atLeast(75.dp)
            })

            Box(Modifier.height(small.dp).width(small.dp).background(Color.Magenta).constrainAs(boxMagenta){
                top.linkTo(boxCyan.bottom)
                end.linkTo(boxCyan.end)
            })

            Box(Modifier.height(small.dp).width(small.dp).background(Color.Green).constrainAs(boxGreen){
                top.linkTo(boxDarkGrey.bottom)
                start.linkTo(boxDarkGrey.start)
            })

            Box(Modifier.height(small.dp).width(small.dp).background(Color.Yellow).constrainAs(boxYellow){
                top.linkTo(boxMagenta.bottom)
                top.linkTo(boxGreen.bottom)
                start.linkTo(boxMagenta.end)
                end.linkTo(boxGreen.start)
            })

            Box(Modifier.height(big.dp).width(big.dp).background(Color.Blue).constrainAs(boxBlue){
                top.linkTo(boxYellow.bottom)
                start.linkTo(boxGrey.end)
                end.linkTo(boxRed.start)
            })

            Box(Modifier.height(small.dp).width(small.dp).background(Color.Gray).constrainAs(boxGrey){
                top.linkTo(boxYellow.bottom)
                end.linkTo(boxYellow.start)
            })

            Box(Modifier.height(small.dp).width(small.dp).background(Color.Red).constrainAs(boxRed){
                top.linkTo(boxYellow.bottom)
                start.linkTo(boxYellow.end)
            })
        }
    }
}