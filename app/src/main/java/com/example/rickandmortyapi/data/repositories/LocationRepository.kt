package com.example.rickandmortyapi.data.repositories

import com.example.rickandmortyapi.base.BaseRepository
import com.example.rickandmortyapi.data.remote.apiservices.LocationApiService
import javax.inject.Inject

class LocationRepository @Inject constructor(private val service: LocationApiService) :
    BaseRepository() {

    fun fetchLocation(page: Int) = doRequest {
        service.fetchLocation(page)
    }
}