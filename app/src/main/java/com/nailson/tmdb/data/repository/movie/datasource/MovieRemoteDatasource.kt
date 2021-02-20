package com.nailson.tmdb.data.repository.movie.datasource

import com.nailson.tmdb.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
    suspend fun getMovies(): Response<MovieList>
}