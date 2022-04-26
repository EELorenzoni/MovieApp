package com.example.movieapp.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

class Movie(
    val id: Int = -1,
    val adult: Boolean = false,
    val genere_ids: List<Int> = listOf(),
    val backdrop_path: String = "",
    val original_title: String = "",
    val original_languague: String = "",
    val overview: String = "",
    val popularity: Double = -1.0,
    val poster_path: String = "",
    val release_date: String = "",
    val title: String = "",
    val video: Boolean = false,
    val vote_average: Double = -1.0,
    val vote_count: Int = -1
) {

}

data class MovieList(val results: List<Movie> = listOf())

@Entity
class MovieEntity(
    @PrimaryKey
    val id: Int = -1,
    @ColumnInfo(name = "adult")
    val adult: Boolean = false,
    @ColumnInfo(name = "backdrop_path")
    val backdrop_path: String = "",
    @ColumnInfo(name = "original_title")
    val original_title: String = "",
    @ColumnInfo(name = "original_languague")
    val original_languague: String = "",
    @ColumnInfo(name = "overview")
    val overview: String = "",
    @ColumnInfo(name = "popularity")
    val popularity: Double = -1.0,
    @ColumnInfo(name = "poster_path")
    val poster_path: String = "",
    @ColumnInfo(name = "release_date")
    val release_date: String = "",
    @ColumnInfo(name = "title")
    val title: String = "",
    @ColumnInfo(name = "video")
    val video: Boolean = false,
    @ColumnInfo(name = "vote_average")
    val vote_average: Double = -1.0,
    @ColumnInfo(name = "vote_count")
    val vote_count: Int = -1
)