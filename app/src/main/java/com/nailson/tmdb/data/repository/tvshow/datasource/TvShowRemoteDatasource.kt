package com.nailson.tmdb.data.repository.tvshow.datasource

import com.nailson.tmdb.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {
    suspend fun getTvShows(): Response<TvShowList>
}