package com.nailson.tmdb.data.repository.artist.datasource

import com.nailson.tmdb.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDatasource {
    suspend fun getArtists(): Response<ArtistList>
}