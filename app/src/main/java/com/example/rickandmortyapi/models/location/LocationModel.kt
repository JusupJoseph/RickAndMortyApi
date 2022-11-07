package com.example.rickandmortyapi.models.location

import com.example.rickandmortyapi.base.IBaseDiffModel
import com.google.gson.annotations.SerializedName

data class LocationModel(
    override val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
) : IBaseDiffModel<Int>