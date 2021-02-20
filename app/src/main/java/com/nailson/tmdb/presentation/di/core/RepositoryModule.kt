package com.nailson.tmdb.presentation.di.core

import com.nailson.tmdb.data.repository.artist.ArtistRepositoryImpl
import com.nailson.tmdb.data.repository.artist.datasource.ArtistCacheDataSource
import com.nailson.tmdb.data.repository.artist.datasource.ArtistLocalDataSource
import com.nailson.tmdb.data.repository.artist.datasource.ArtistRemoteDatasource
import com.nailson.tmdb.data.repository.movie.MovieRepositoryImpl
import com.nailson.tmdb.data.repository.movie.datasource.MovieCacheDataSource
import com.nailson.tmdb.data.repository.movie.datasource.MovieLocalDataSource
import com.nailson.tmdb.data.repository.movie.datasource.MovieRemoteDatasource
import com.nailson.tmdb.data.repository.tvshow.TvShowRepositoryImpl
import com.nailson.tmdb.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.nailson.tmdb.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.nailson.tmdb.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.nailson.tmdb.domain.repository.ArtistRepository
import com.nailson.tmdb.domain.repository.MovieRepository
import com.nailson.tmdb.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )
    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDatasource: TvShowRemoteDatasource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {

        return TvShowRepositoryImpl(
            tvShowRemoteDatasource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )
    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDatasource: ArtistRemoteDatasource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {

        return ArtistRepositoryImpl(
            artistRemoteDatasource,
            artistLocalDataSource,
            artistCacheDataSource
        )
    }
}