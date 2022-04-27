package com.example.movieapp.data.local

import com.example.movieapp.data.model.Movie
import com.example.movieapp.data.model.MovieEntity
import com.example.movieapp.data.model.MovieList
import com.example.movieapp.data.model.toMovieList

class LocalMovieDataSource(private val movieDao: MovieDao) {

    suspend fun getUpcomingMovies() {
        return movieDao.getAllMovies().filter { it.movie_type == "upcoming" }.toMovieList()
    }

    suspend fun getTopRatedMovies() {
        return movieDao.getAllMovies().filter { it.movie_type == "toprated" }.toMovieList()
    }

    suspend fun getPopularMovies() {
        return movieDao.getAllMovies().filter { it.movie_type == "popular" }.toMovieList()
    }

    suspend fun saveMovie(movie: MovieEntity) {
        movieDao.saveMovie(movie)
    }
}