package com.nailson.tmdb.data.repository.tvshow.datasourceImpl

import com.nailson.tmdb.data.api.TMDBService
import com.nailson.tmdb.data.model.tvshow.TvShowList
import com.nailson.tmdb.data.repository.tvshow.datasource.TvShowRemoteDatasource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): TvShowRemoteDatasource {
    override suspend fun getTvShows()
            : Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)
}