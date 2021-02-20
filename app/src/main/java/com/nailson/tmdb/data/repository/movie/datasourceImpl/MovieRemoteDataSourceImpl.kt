package com.nailson.tmdb.data.repository.movie.datasourceImpl

import com.nailson.tmdb.data.api.TMDBService
import com.nailson.tmdb.data.model.movie.MovieList
import com.nailson.tmdb.data.repository.movie.datasource.MovieRemoteDatasource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)
}