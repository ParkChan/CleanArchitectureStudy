package com.chan.moviesearcher.data.source

import com.chan.moviesearcher.data.entity.MovieResponse
import kotlinx.coroutines.withContext

internal class MovieDataSourceImpl(
    private val movieApi: MovieApi
) : MovieDataSource{
    override suspend fun fetchMovies(page:Int, query: String): MovieResponse =
        withContext(ioDispatcher){
            movieApi.fetchMovies(page, query)
        }
}