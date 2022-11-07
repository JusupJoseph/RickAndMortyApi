package com.example.rickandmortyapi.data.remote.apiservices

import com.example.rickandmortyapi.models.RickAndMortyResponse
import com.example.rickandmortyapi.models.location.LocationModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface LocationApiService {

    @GET("location")
    suspend fun fetchLocation(
        @Query("page") page: Int
    ): Response<RickAndMortyResponse<LocationModel>>

}