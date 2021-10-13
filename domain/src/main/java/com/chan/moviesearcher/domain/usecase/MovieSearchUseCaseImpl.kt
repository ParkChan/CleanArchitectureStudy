package com.chan.moviesearcher.domain.usecase

import com.chan.moviesearcher.domain.dto.MovieDto
import com.chan.moviesearcher.domain.repository.MovieSearchRepository
import javax.inject.Inject

class MovieSearchUseCaseImpl @Inject constructor(
    private val repository: MovieSearchRepository
) : MovieSearchUseCase {
    override suspend fun request(start: Int, query: String): Result<MovieDto> =
        runCatching {
            repository.fetchMovies(start, query)
        }
}