package com.chan.moviesearcher.data.source

import com.chan.moviesearcher.data.entity.MovieReponse
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

internal interface MovieDataSource {

    val ioDispatcher: CoroutineDispatcher
        get() = Dispatchers.IO

    suspend fun fetchMovies(page:Int, query: String) : MovieReponse
}