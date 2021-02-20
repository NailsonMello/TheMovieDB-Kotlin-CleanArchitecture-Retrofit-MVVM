package com.nailson.tmdb.presentation.di

import com.nailson.tmdb.presentation.di.artist.ArtistSubComponent
import com.nailson.tmdb.presentation.di.movie.MovieSubComponent
import com.nailson.tmdb.presentation.di.tvshow.TvShowSubComponent

interface Injector {
    fun createMovieSubComponent(): MovieSubComponent
    fun createTvShowSubComponent(): TvShowSubComponent
    fun createArtistSubComponent(): ArtistSubComponent
}