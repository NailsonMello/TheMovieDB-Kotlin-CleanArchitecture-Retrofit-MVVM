package com.nailson.tmdb.presentation.di.core

import com.nailson.tmdb.data.api.TMDBService
import com.nailson.tmdb.data.repository.artist.datasource.ArtistRemoteDatasource
import com.nailson.tmdb.data.repository.artist.datasourceImpl.ArtistRemoteDataSourceImpl
import com.nailson.tmdb.data.repository.movie.datasource.MovieRemoteDatasource
import com.nailson.tmdb.data.repository.movie.datasourceImpl.MovieRemoteDataSourceImpl
import com.nailson.tmdb.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.nailson.tmdb.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDatasource {
        return MovieRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

    @Singleton
    @Provides
    fun provideTvRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDatasource {
        return TvShowRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDatasource {
        return ArtistRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }
}