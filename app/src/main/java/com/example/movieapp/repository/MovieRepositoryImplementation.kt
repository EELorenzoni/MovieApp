package com.example.movieapp.repository

import com.example.movieapp.data.model.MovieList
import com.example.movieapp.data.remote.MovieDataSource

class MovieRepositoryImplementation(private val datasource: MovieDataSource) : MovieRepository {
    override suspend fun getUpcomingMovies(): MovieList = datasource.getUpcomingMovies()

    override suspend fun getTopRatedMovies(): MovieList = datasource.getTopRatedMovies()

    override suspend fun getPopularMovies(): MovieList = datasource.getPopularMovies()

}