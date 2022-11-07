package com.example.rickandmortyapi.data.remote.apiservices

import com.example.rickandmortyapi.models.RickAndMortyResponse
import com.example.rickandmortyapi.models.episode.EpisodeModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface EpisodeApiService {

    @GET("episode")
    suspend fun fetchEpisode(
        @Query("page") page: Int
    ): Response<RickAndMortyResponse<EpisodeModel>>
}