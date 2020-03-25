package com.artemis.software.kotlintutorial.stdlib

data class Track(val title: String, val durationInSeconds: Int)

data class Album(val title: String, val year: Int, val chartUK: Int, val chartUs: Int, val tracks: List<Track> = listOf())

val albums = listOf(

    Album("The Dark side of the moon", 1973, 2, 1, listOf(Track("Speak to me", 90),Track("Speak to me", 190))),
    Album("The wall", 1979, 3, 1),
    Album("Wish you were here", 1975, 1, 1)
)


fun albumAndTrackLowerThanXSeconds(durationInSeconds: Int, albums: List<Album>): List<Pair<String, String>>{

    return albums.flatMap {
        val albumTitle = it.title
        it.tracks.filter {
            it.durationInSeconds <= durationInSeconds
        }.map {
            Pair(albumTitle, it.title)
        }
    }
}

fun main(args: Array<String>){

    for(album in albums){
        if(album.chartUK == 1){
            println("Found: ${album.title}")
        }
    }

    albums.forEach{
        if(it.chartUK == 1) println("Found it  ${it.title}")
    }

   albums.filter { it.chartUK == 1 }
       .forEach{
            println("Found it  ${it.title}")
        }


   val titles = albums.filter { it.chartUK == 1 }
        .map{ it.title }

    titles.forEach{ println("Title: ${it}")}


    val titlesPair = albums.filter { it.chartUK == 1 }
        .map{ Pair(it.title, it.year) }

    titlesPair.forEach{ println("Title + Year: ${it}")}

    albumAndTrackLowerThanXSeconds(200, albums).forEach{ println(it.first)}
}