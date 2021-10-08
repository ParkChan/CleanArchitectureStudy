package com.chan.moviesearcher.data.source

import com.chan.moviesearcher.data.entity.MovieResponse

internal class MovieDataSourceImpl(
    private val movieApi: MovieApi
) : MovieDataSource {
    override suspend fun fetchMovies(start: Int, query: String): MovieResponse =
        movieApi.fetchMovies(start, query)
}