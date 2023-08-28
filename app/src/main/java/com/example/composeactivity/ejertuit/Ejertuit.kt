package com.example.composeactivity.ejertuit

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeactivity.R
import com.example.composeactivity.ui.theme.ComposeActivityTheme

@Composable
fun TuitComponent() {
    Row(
        Modifier
            .fillMaxWidth()
            .height(400.dp)
            .padding(12.dp),
        horizontalArrangement = Arrangement.SpaceAround
    )
    {
        ProfileAriImage(Modifier.weight(0.8f))

        Column(
            Modifier
                .fillMaxSize()
                .background(Color.Green)
                .padding(start = 12.dp)
                .weight(3f)
        )
        {
            Row(Modifier.fillMaxWidth()) {
                Text(text = "Aris", fontWeight = FontWeight.Bold)
                Text(text = "@AristiDevs", Modifier.padding(horizontal = 12.dp))
                Text(text = "4h")
                DotsImage()
            }

            Text(
                text = "Descripción Id w arga sobre dxd Descripción Id w arga sobre dxd Descripción Id w arga sobre dxd Descripción Id w arga sobre dxd Descripción Id w arga sobre dxd",
                style = LocalTextStyle.current.copy(lineHeight = 17.sp)
            )

            TuitImageAri()
            ActionBarBottom()
        }
    }

    Divider(
        Modifier
            .fillMaxWidth()
            .background(Color(0xFFF9F9F9))
            .height(1.dp)
    )
}

@Composable
fun ProfileAriImage(modifier: Modifier) {
    Image(
        painter = painterResource(id = R.drawable.profile),
        contentDescription = "Ari image",
        modifier = modifier
            .clip(
                CircleShape
            )
            .background(Color.Green)
    )
}

@Composable
fun DotsImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_dots),
        contentDescription = "Filled image",
        Modifier
            .padding(start = 75.dp)
            .size(20.dp)
    )
}

@Composable
fun TuitImageAri() {
    Image(
        painter = painterResource(R.drawable.profile),
        contentDescription = "Tuit image",
        contentScale = ContentScale.FillWidth,
        modifier = Modifier
            .padding(end = 10.dp, top = 8.dp)
            .aspectRatio(13f / 9f)
            .clip(RoundedCornerShape(20.dp))
    )
}

@Composable
fun ActionBarBottom() {
    Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.padding(top = 5.dp)) {
        Row(Modifier.weight(0.1f)) {
            Image(
                painter = painterResource(id = R.drawable.ic_chat),
                contentDescription = "Chat icon"
            )
            Text(text = "0")
        }

        Row(Modifier.weight(0.1f)) {
            Image(
                painter = painterResource(id = R.drawable.ic_rt),
                contentDescription = "Chat icon"
            )
            Text(text = "0")
        }

        Row(Modifier.weight(0.1f)) {
            Image(
                painter = painterResource(id = R.drawable.ic_like),
                contentDescription = "Chat icon"
            )
            Text(text = "0")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeActivityTheme {
        TuitComponent()
    }
}