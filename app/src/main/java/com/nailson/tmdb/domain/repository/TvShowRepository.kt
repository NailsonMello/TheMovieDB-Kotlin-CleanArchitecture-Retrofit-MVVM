package com.nailson.tmdb.domain.repository

import com.nailson.tmdb.data.model.tvshow.TvShow

interface TvShowRepository {
    suspend fun getTvShows():List<TvShow>?
    suspend fun updateTvShows():List<TvShow>?
}