package com.chan.moviesearcher.data.repository

import com.chan.moviesearcher.data.entity.MovieResponse
import com.chan.moviesearcher.data.source.MovieDataSource
import com.chan.moviesearcher.domain.dto.MovieDto
import com.chan.moviesearcher.domain.repository.MovieSearchRepository

internal class MovieSearchRepositoryImpl(
    private val source: MovieDataSource,
) : MovieSearchRepository {
    override suspend fun fetchMovies(start: Int, query: String): MovieDto =
        MovieResponse.mapToDto(source.fetchMovies(start = start, query = query))
}

