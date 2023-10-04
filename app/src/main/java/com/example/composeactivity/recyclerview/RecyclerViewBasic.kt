package com.example.composeactivity.recyclerview

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeactivity.R
import com.example.composeactivity.ui.theme.ComposeActivityTheme
import kotlinx.coroutines.launch

@Composable
fun SimpleRecyclerView() {
    val myList = listOf("Paco", "Manolo", "Pablo")


    LazyColumn(Modifier.fillMaxSize()) {
        /* EJEMPLOS
        item { 
            Text(text = "Hola 1")
        }  
        
        items(7){
            Text(text = "Item nº $it")
        }
        */

        items(myList) {
            Text(text = "Hola me llamo $it", color = Color.Red)
        }
    }
    //LazyColumn(content = )
}

/** SUPERHERO VIEW **/
@Composable
fun SuperHeroView() {
    val context = LocalContext.current

    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        items(getSuperHeroes()) {
            ItemHero(superhero = it) { Toast.makeText(context, it.name, Toast.LENGTH_SHORT).show() }
        }
    }
}

@Composable
fun SuperHeroGridView() {
    val context = LocalContext.current

    LazyVerticalGrid(columns = GridCells.Fixed(3), content = {
        items(getSuperHeroes()) {

            ItemHero(superhero = it) {
                Toast.makeText(context, it.name, Toast.LENGTH_SHORT).show()
            }
        }
    }, contentPadding = PaddingValues(horizontal = 16.dp, vertical = 18.dp))
}

@Composable
fun SuperHeroSpecialControlView() {
    val context = LocalContext.current
    val rvState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()

    Column() {
        LazyColumn(
            state = rvState,
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.weight(1f)
        ) {
            items(getSuperHeroes()) {
                ItemHero(superhero = it) {
                    Toast.makeText(context, it.name, Toast.LENGTH_SHORT).show()
                }
            }
        }

        val showButton by remember {
            derivedStateOf {
                rvState.firstVisibleItemIndex > 0
                // rvState.firstVisibleItemScrollOffset
            }
        }

        if (showButton) {
            Button(
                onClick = {
                    coroutineScope.launch {
                        rvState.animateScrollToItem(0)
                    }
                },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(16.dp)
            ) {
                Text(text = "Soy un botón")
            }
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun SuperHeroStickyView(){
    val context = LocalContext.current
    val superhero: Map<String, List<SuperHeroModel>> = getSuperHeroes().groupBy { it.publisher }

    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        superhero.forEach { (publisher, mySuperHero) ->
            stickyHeader {
                Text(text = publisher, modifier = Modifier.fillMaxWidth().background(Color.Green), fontSize = 16.sp, color = Color.White)
            }

            items(mySuperHero) {
                ItemHero(superhero = it) { Toast.makeText(context, it.name, Toast.LENGTH_SHORT).show() }
            }
        }
    }
}

@Composable
fun ItemHero(superhero: SuperHeroModel, onItemSelected: (SuperHeroModel) -> Unit) {
    Card(
        border = BorderStroke(2.dp, Color.Red),
        modifier = Modifier
            .width(200.dp)
            .clickable { onItemSelected(superhero) }) {
        Column() {
            Image(
                painter = painterResource(id = superhero.photo),
                contentDescription = "Photo",
                Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )

            Text(
                text = "Nombre: ${superhero.name}",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = "Nombre real: ${superhero.realName}",
                modifier = Modifier.align(Alignment.CenterHorizontally),
                fontSize = 12.sp
            )
            Text(
                text = "Creador: ${superhero.publisher}",
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(8.dp),
                fontSize = 10.sp
            )
        }
    }
}

fun getSuperHeroes(): List<SuperHeroModel> {
    return listOf(
        SuperHeroModel("Spiderman", "Peter Parker", "Marvel", R.drawable.spiderman),
        SuperHeroModel("Wolverine", "James Howlett", "Marvel", R.drawable.logan),
        SuperHeroModel("Batman", "Bruce Wayne", "DC", R.drawable.batman),
        SuperHeroModel("Thor", "Thor Odinson", "Marvel", R.drawable.thor),
        SuperHeroModel("Flash", "Jay Garrick", "DC", R.drawable.flash),
        SuperHeroModel("Green Lantern", "Alan Scott", "DC", R.drawable.green_lantern),
        SuperHeroModel("Wonder Woman", "Princess Diana", "DC", R.drawable.wonder_woman)
    )
}

/** FIN SUPERHERO VIEW **/

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeActivityTheme {

    }
}