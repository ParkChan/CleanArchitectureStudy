package com.chan.moviesearcher.domain.repository

import com.chan.moviesearcher.domain.dto.MovieDto

interface MovieSearchRepository {
    suspend fun fetchMovies(start: Int, query: String): MovieDto
}