package com.chan.moviesearcher.data.source

import com.chan.moviesearcher.data.entity.MovieReponse
import kotlinx.coroutines.withContext

internal class MovieDataSourceImpl(
    private val movieApi: MovieApi
) : MovieDataSource{
    override suspend fun fetchMovies(page:Int, query: String): MovieReponse =
        withContext(ioDispatcher){
            movieApi.fetchMovies(page, query)
        }
}