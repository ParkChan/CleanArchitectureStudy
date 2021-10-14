package com.chan.moviesearcher.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.chan.moviesearcher.domain.dto.MovieDto
import com.chan.moviesearcher.domain.usecase.MovieSearchUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class MovieSearchViewModel @Inject constructor(
    private val useCase: MovieSearchUseCase
) : ViewModel() {

    private val _movies = MutableLiveData<MovieDto>()
    val movies: LiveData<MovieDto> get() = _movies

    private val _throwable = MutableLiveData<Throwable>()
    val throwable: LiveData<Throwable> get() = _throwable

    private val handler = CoroutineExceptionHandler { _, exception ->
        Timber.e(exception.message)
    }

    fun getMovieList(start: Int, query: String) = viewModelScope.launch(handler) {
        useCase.request(start, query)
            .onSuccess {
                _movies.value = it
            }.onFailure {
                _throwable.value = it
            }
    }


}