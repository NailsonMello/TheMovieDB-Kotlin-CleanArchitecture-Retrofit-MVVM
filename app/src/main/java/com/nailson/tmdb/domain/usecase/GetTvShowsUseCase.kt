package com.nailson.tmdb.domain.usecase

import com.nailson.tmdb.data.model.tvshow.TvShow
import com.nailson.tmdb.domain.repository.TvShowRepository

class GetTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>?=tvShowRepository.getTvShows()
}