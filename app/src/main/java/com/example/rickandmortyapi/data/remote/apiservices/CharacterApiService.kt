package com.example.rickandmortyapi.data.remote.apiservices

import com.example.rickandmortyapi.models.RickAndMortyResponse
import com.example.rickandmortyapi.models.character.CharacterModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CharacterApiService {

    @GET("character")
    suspend fun fetchCharacter(
        @Query("page")page: Int
    ): Response<RickAndMortyResponse<CharacterModel>>
}