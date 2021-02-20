package com.nailson.tmdb.presentation.di.core

import com.nailson.tmdb.data.db.ArtistDao
import com.nailson.tmdb.data.db.MovieDao
import com.nailson.tmdb.data.db.TvShowDao
import com.nailson.tmdb.data.repository.artist.datasource.ArtistLocalDataSource
import com.nailson.tmdb.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.nailson.tmdb.data.repository.movie.datasource.MovieLocalDataSource
import com.nailson.tmdb.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.nailson.tmdb.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.nailson.tmdb.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao): TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao : ArtistDao): ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)
    }
}