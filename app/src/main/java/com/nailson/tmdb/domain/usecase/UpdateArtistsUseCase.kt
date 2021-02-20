package com.nailson.tmdb.domain.usecase

import com.nailson.tmdb.data.model.artist.Artist
import com.nailson.tmdb.domain.repository.ArtistRepository

class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.updateArtists()
}