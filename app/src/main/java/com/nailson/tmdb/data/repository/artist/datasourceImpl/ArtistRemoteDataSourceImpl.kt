package com.nailson.tmdb.data.repository.artist.datasourceImpl

import com.nailson.tmdb.data.api.TMDBService
import com.nailson.tmdb.data.model.artist.ArtistList
import com.nailson.tmdb.data.repository.artist.datasource.ArtistRemoteDatasource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): ArtistRemoteDatasource {
    override suspend fun getArtists()
            : Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}