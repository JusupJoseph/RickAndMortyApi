package com.example.rickandmortyapi.ui.fragments.episode

import com.example.rickandmortyapi.base.BaseViewModel
import com.example.rickandmortyapi.data.repositories.EpisodeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class EpisodeViewModel @Inject constructor(private val repository: EpisodeRepository) :
    BaseViewModel() {

        fun fetchEpisode(page: Int) = repository.fetchEpisode(page)
}