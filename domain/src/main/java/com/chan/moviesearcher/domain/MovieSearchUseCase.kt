package com.chan.moviesearcher.domain

import com.chan.moviesearcher.domain.dto.MovieDto

interface MovieSearchUseCase {
    suspend fun fetchMovies(start: Int, query: String): MovieDto
}