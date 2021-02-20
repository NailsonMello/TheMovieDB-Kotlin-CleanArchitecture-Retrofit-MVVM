package com.nailson.tmdb.presentation.di.movie

import com.nailson.tmdb.domain.usecase.GetMoviesUseCase
import com.nailson.tmdb.domain.usecase.UpdateMoviesUsecase
import com.nailson.tmdb.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMoviesUsecase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }
}