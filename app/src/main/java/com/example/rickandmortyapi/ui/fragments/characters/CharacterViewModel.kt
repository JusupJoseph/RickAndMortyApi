package com.example.rickandmortyapi.ui.fragments.characters

import com.example.rickandmortyapi.base.BaseViewModel
import com.example.rickandmortyapi.data.repositories.CharacterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CharacterViewModel @Inject constructor(private val repository: CharacterRepository) :
    BaseViewModel() {

    fun fetchCharacters(page: Int) = repository.fetchCharacter(page)
}