package com.nailson.tmdb.presentation.di.artist

import com.nailson.tmdb.domain.usecase.GetArtistsUseCase
import com.nailson.tmdb.domain.usecase.UpdateArtistsUseCase
import com.nailson.tmdb.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase,
            updateArtistsUseCase
        )
    }
}