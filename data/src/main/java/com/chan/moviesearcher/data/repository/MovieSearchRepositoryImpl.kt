package com.chan.moviesearcher.data.repository

import com.chan.moviesearcher.data.source.MovieDataSource
import com.chan.moviesearcher.domain.dto.MovieDto
import com.chan.moviesearcher.domain.repository.MovieSearchRepository
import javax.inject.Inject

internal class MovieSearchRepositoryImpl @Inject constructor(
    private val source: MovieDataSource,
) : MovieSearchRepository {
    override suspend fun fetchMovies(start: Int, query: String): MovieDto =
        source.fetchMovies(start = start, query = query).mapToDto()
}