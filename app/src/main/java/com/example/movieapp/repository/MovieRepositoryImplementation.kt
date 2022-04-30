package com.example.movieapp.repository

import com.example.movieapp.core.InternetCheck
import com.example.movieapp.core.InternetCheck.IsNetworkAvailable
import com.example.movieapp.data.local.LocalMovieDataSource
import com.example.movieapp.data.model.MovieList
import com.example.movieapp.data.model.toMovieEntity
import com.example.movieapp.data.remote.RemoteMovieDataSource

class MovieRepositoryImplementation(
    private val datasourceRemote: RemoteMovieDataSource,
    private val dataSourceLocal: LocalMovieDataSource
) : MovieRepository {

    override suspend fun getUpcomingMovies(): MovieList {

        if (InternetCheck.IsNetworkAvailable()) {
            datasourceRemote.getUpcomingMovies().results.forEach { movie ->
                dataSourceLocal.saveMovie(movie.toMovieEntity("upcoming"))
            }
        }
        return dataSourceLocal.getUpcomingMovies()

    }

    override suspend fun getTopRatedMovies(): MovieList {

        if (InternetCheck.IsNetworkAvailable()) {
            datasourceRemote.getTopRatedMovies().results.forEach { movie ->
                dataSourceLocal.saveMovie(movie.toMovieEntity("toprated"))
            }
        }

        return dataSourceLocal.getTopRatedMovies()
    }

    override suspend fun getPopularMovies(): MovieList {

        if (InternetCheck.IsNetworkAvailable()) {
            datasourceRemote.getPopularMovies().results.forEach { movie ->
                dataSourceLocal.saveMovie(movie.toMovieEntity("popular"))
            }
        }

        return dataSourceLocal.getPopularMovies()
    }

}