package com.example.rickandmortyapi.data.repositories

import com.example.rickandmortyapi.base.BaseRepository
import com.example.rickandmortyapi.data.remote.apiservices.CharacterApiService
import javax.inject.Inject

class CharacterRepository @Inject constructor(val service: CharacterApiService) :
    BaseRepository() {

    fun fetchCharacter(page: Int) = doRequest {
        service.fetchCharacter(page)
    }
}