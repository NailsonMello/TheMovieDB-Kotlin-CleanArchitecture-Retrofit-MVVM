package com.nailson.tmdb.domain.repository

import com.nailson.tmdb.data.model.artist.Artist

interface ArtistRepository {
    suspend fun getArtists():List<Artist>?
    suspend fun updateArtists():List<Artist>?
}