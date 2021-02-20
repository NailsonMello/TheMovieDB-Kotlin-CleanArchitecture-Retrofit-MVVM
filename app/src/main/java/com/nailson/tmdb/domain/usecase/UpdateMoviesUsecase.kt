package com.nailson.tmdb.domain.usecase

import com.nailson.tmdb.data.model.movie.Movie
import com.nailson.tmdb.domain.repository.MovieRepository

class UpdateMoviesUsecase(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>? = movieRepository.updateMovies()
}