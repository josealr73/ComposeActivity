package com.example.composeactivity.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showBackground = true)
@Composable
fun MyBasicConstraintLayout(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxRed, boxGreen, boxYellow, boxBlue, boxCyan) = createRefs()

        Box(Modifier
            .size(150.dp)
            .background(Color.Red)
            .constrainAs(boxRed) {
                bottom.linkTo(boxCyan.top)
                end.linkTo(boxCyan.start)
            })
        Box(Modifier
            .size(150.dp)
            .background(Color.Green)
            .constrainAs(boxGreen) {
                top.linkTo(boxCyan.bottom)
                end.linkTo(boxCyan.start)
            })
        Box(Modifier
            .size(150.dp)
            .background(Color.Yellow)
            .constrainAs(boxYellow) {
                top.linkTo(boxCyan.bottom)
                start.linkTo(boxCyan.end)
            })
        Box(Modifier
            .size(150.dp)
            .background(Color.Blue)
            .constrainAs(boxBlue) {
                bottom.linkTo(boxCyan.top)
                start.linkTo(boxCyan.end)
            })
        Box(Modifier
            .size(150.dp)
            .background(Color.Cyan)
            .constrainAs(boxCyan) {
                bottom.linkTo(parent.bottom)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            })
    }
}

@Preview(showBackground = true)
@Composable
fun MyConstraintGuide(modifier: Modifier = Modifier){
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (boxRed, boxYellow, boxCyan) = createRefs()

        // BARRERA (BARRERA VERTICAL)
        val barrier = createEndBarrier(boxRed, boxYellow)

        // GUÍAS (GUÍAS HORIZONTALES)
        // val topGuide = createGuidelineFromTop(25.dp)
        val topGuide = createGuidelineFromTop(0.1f)

        Box(Modifier.size(75.dp).background(Color.Red).constrainAs(boxRed){
            top.linkTo(topGuide)
        })

        Box(Modifier.size(150.dp).background(Color.Yellow).constrainAs(boxYellow){
            top.linkTo(boxRed.bottom)
        })

        Box(Modifier.size(75.dp).background(Color.Cyan).constrainAs(boxCyan){
            start.linkTo(barrier)
        })
    }
}

@Preview(showBackground = true)
@Composable
fun MyConstraintChain(modifier: Modifier = Modifier){
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (boxRed, boxYellow, boxCyan) = createRefs()

        Box(Modifier.size(75.dp).background(Color.Red).constrainAs(boxRed){
            top.linkTo(parent.top)
            end.linkTo(parent.end)
            start.linkTo(parent.start)
            bottom.linkTo(boxYellow.top)
        })

        Box(Modifier.size(150.dp).background(Color.Yellow).constrainAs(boxYellow){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(boxRed.bottom)
            bottom.linkTo(boxCyan.top)
        })

        Box(Modifier.size(75.dp).background(Color.Cyan).constrainAs(boxCyan){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(boxYellow.bottom)
            bottom.linkTo(parent.bottom)
        })

        createVerticalChain(boxRed, boxYellow, boxCyan, chainStyle = ChainStyle.SpreadInside)
        // createHorizontalChain(boxRed, boxYellow, boxCyan, chainStyle = ChainStyle.SpreadInside)
    }


}