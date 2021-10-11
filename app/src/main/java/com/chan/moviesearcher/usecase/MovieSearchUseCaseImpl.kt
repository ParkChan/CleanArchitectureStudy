package com.chan.moviesearcher.usecase

import com.chan.moviesearcher.domain.MovieSearchUseCase
import com.chan.moviesearcher.domain.dto.MovieDto
import com.chan.moviesearcher.domain.repository.MovieSearchRepository

class MovieSearchUseCaseImpl(private val repository: MovieSearchRepository) : MovieSearchUseCase {
    override suspend fun request(start: Int, query: String): MovieDto =
        repository.fetchMovies(start, query)
}