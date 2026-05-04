package com.example.anime_catalog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.anime_catalog.ui.theme.Anime_CatalogTheme
import data.Datasource
import model.Anime

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Anime_CatalogTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AnimeCatalogApp()
                }
            }
        }
    }
}
@Composable
fun AnimeCard(anime: Anime,modifier: Modifier= Modifier){
    Card(modifier=modifier){
        Column{
            Image(
                painter = painterResource(anime.imageResourceId),
                contentDescription = stringResource(anime.titleResourceId),
                modifier= Modifier
                    .fillMaxWidth()
                    .height(450.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(anime.titleResourceId),
                modifier= Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = stringResource(anime.descriptionResourceId),
                modifier= Modifier.padding(start=16.dp,end=16.dp, bottom = 16.dp),
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}
@Composable
fun AnimeList(animeList: List<Anime>,modifier: Modifier= Modifier){
    LazyColumn(modifier=modifier) {
        items(animeList){ anime->
            AnimeCard(
                anime = anime,
                modifier= Modifier.padding(8.dp)
            )
        }
    }
}
@Composable
fun AnimeCatalogApp(){
    AnimeList(
        animeList= Datasource().loadAnimeList()
    )
}
@Composable
fun AnimeCardPreview(){
    Anime_CatalogTheme{
        AnimeCard(
            Anime(
                R.string.thefinals1,
                R.string.anime1_description,
                R.drawable.thefinals1
            )
        )
    }
}












