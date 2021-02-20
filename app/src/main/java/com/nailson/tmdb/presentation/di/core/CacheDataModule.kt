package com.nailson.tmdb.presentation.di.core

import com.nailson.tmdb.data.repository.artist.datasource.ArtistCacheDataSource
import com.nailson.tmdb.data.repository.artist.datasourceImpl.ArtistCacheDataSourceImpl
import com.nailson.tmdb.data.repository.movie.datasource.MovieCacheDataSource
import com.nailson.tmdb.data.repository.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.nailson.tmdb.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.nailson.tmdb.data.repository.tvshow.datasourceImpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }
}