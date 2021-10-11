package com.chan.moviesearcher.domain

import com.chan.moviesearcher.domain.dto.MovieDto

interface MovieSearchUseCase {
    suspend fun request(start: Int, query: String): Result<MovieDto>
}