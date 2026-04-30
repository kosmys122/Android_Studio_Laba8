package data
import model.Anime
import com.example.anime_catalog.R
//import com.example.anime_catalog.model.Anime

class Datasource {
    fun loadAnimeList(): List<Anime>{
        return listOf(
            Anime(
                titleResourceId = R.string.TheFinals1,
                description = R.string.anime1_description,
                imageResourceId = R.drawable.TheFinals1
            ),
            Anime(
                titleResourceId = R.string.TheFinals2,
                description = R.string.anime2_description,
                imageResourceId = R.drawable.TheFinals2
            ),
            Anime(
                titleResourceId = R.string.TheFinals3,
                description = R.string.anime3_description,
                imageResourceId = R.drawable.TheFinals3
            ),
            Anime(
                titleResourceId = R.string.TheFinals4,
                description = R.string.anime4_description,
                imageResourceId = R.drawable.TheFinals4
            ),
            Anime(
                titleResourceId = R.string.TheFinals5,
                description = R.string.anime5_description,
                imageResourceId = R.drawable.TheFinals5
            ),
            Anime(
                titleResourceId = R.string.TheFinals6,
                description = R.string.anime6_description,
                imageResourceId = R.drawable.TheFinals6
            ),
            Anime(
                titleResourceId = R.string.TheFinals7,
                description = R.string.anime7_description,
                imageResourceId = R.drawable.TheFinals7
            ),
            Anime(
                titleResourceId = R.string.TheFinals8,
                description = R.string.anime8_description,
                imageResourceId = R.drawable.TheFinals8
            ),
            Anime(
                titleResourceId = R.string.TheFinals9,
                description = R.string.anime9_description,
                imageResourceId = R.drawable.TheFinals9
            ),
            Anime(
                titleResourceId = R.string.TheFinals10,
                description = R.string.anime10_description,
                imageResourceId = R.drawable.TheFinals10
            ),
        )
    }
}