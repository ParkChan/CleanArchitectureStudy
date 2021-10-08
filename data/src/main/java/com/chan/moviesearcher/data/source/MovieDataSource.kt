package com.chan.moviesearcher.data.source

import com.chan.moviesearcher.data.entity.MovieResponse

internal interface MovieDataSource {

    suspend fun fetchMovies(page: Int, query: String): MovieResponse
}