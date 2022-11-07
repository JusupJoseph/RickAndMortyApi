package com.example.rickandmortyapi.ui.fragments.location

import com.example.rickandmortyapi.base.BaseViewModel
import com.example.rickandmortyapi.data.repositories.LocationRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LocationViewModel @Inject constructor(private val repository: LocationRepository) :
    BaseViewModel() {

    fun fetchLocation(page: Int) = repository.fetchLocation(page)
}