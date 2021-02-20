package com.nailson.tmdb.presentation.di.tvshow

import com.nailson.tmdb.domain.usecase.GetTvShowsUseCase
import com.nailson.tmdb.domain.usecase.UpdateTvShowsUseCase
import com.nailson.tmdb.presentation.tv.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }
}