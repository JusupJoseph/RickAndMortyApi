package com.example.rickandmortyapi.data.repositories

import com.example.rickandmortyapi.base.BaseRepository
import com.example.rickandmortyapi.data.remote.apiservices.EpisodeApiService
import javax.inject.Inject

class EpisodeRepository @Inject constructor(private val service: EpisodeApiService) :
    BaseRepository() {

    fun fetchEpisode(page: Int) = doRequest {
        service.fetchEpisode(page)
    }
}