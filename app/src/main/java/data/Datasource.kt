package data
import model.Anime
import com.example.anime_catalog.R
//import com.example.anime_catalog.model.Anime

class Datasource {
    fun loadAnimeList(): List<Anime>{
        return listOf(
            Anime(
                titleResourceId = R.string.thefinals1,
                descriptionResourceId = R.string.anime1_description,
                imageResourceId = R.drawable.thefinals1
            ),
            Anime(
                titleResourceId = R.string.thefinals2,
                descriptionResourceId = R.string.anime2_description,
                imageResourceId = R.drawable.thefinals2
            ),
            Anime(
                titleResourceId = R.string.thefinals3,
                descriptionResourceId = R.string.anime3_description,
                imageResourceId = R.drawable.thefinals3
            ),
            Anime(
                titleResourceId = R.string.thefinals4,
                descriptionResourceId = R.string.anime4_description,
                imageResourceId = R.drawable.thefinals4
            ),
            Anime(
                titleResourceId = R.string.thefinals5,
                descriptionResourceId = R.string.anime5_description,
                imageResourceId = R.drawable.thefinals5
            ),
            Anime(
                titleResourceId = R.string.thefinals6,
                descriptionResourceId = R.string.anime6_description,
                imageResourceId = R.drawable.thefinals6
            ),
            Anime(
                titleResourceId = R.string.thefinals7,
                descriptionResourceId = R.string.anime7_description,
                imageResourceId = R.drawable.thefinals7
            ),
            Anime(
                titleResourceId = R.string.thefinals8,
                descriptionResourceId = R.string.anime8_description,
                imageResourceId = R.drawable.thefinals8
            ),
            Anime(
                titleResourceId = R.string.thefinals9,
                descriptionResourceId = R.string.anime9_description,
                imageResourceId = R.drawable.thefinals9
            ),
            Anime(
                titleResourceId = R.string.thefinals10,
                descriptionResourceId = R.string.anime10_description,
                imageResourceId = R.drawable.thefinals10
            ),
        )
    }
}