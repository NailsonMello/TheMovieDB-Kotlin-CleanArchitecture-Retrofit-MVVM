package com.nailson.tmdb.domain.repository

import com.nailson.tmdb.data.model.movie.Movie

interface MovieRepository {
    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?
}