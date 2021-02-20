package com.nailson.tmdb.data.repository.artist.datasource

import com.nailson.tmdb.data.model.artist.Artist

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache():List<Artist>
    suspend fun saveArtistsToCache(artists:List<Artist>)
}