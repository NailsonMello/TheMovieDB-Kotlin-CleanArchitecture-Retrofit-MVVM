package com.nailson.tmdb.data.repository.tvshow.datasource

import com.nailson.tmdb.data.model.tvshow.TvShow

interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache():List<TvShow>
    suspend fun saveTvShowsToCache(tvShows:List<TvShow>)
}