package com.chan.moviesearcher.data.repository

import com.chan.moviesearcher.data.entity.MovieResponse
import com.chan.moviesearcher.data.source.MovieDataSourceImpl
import com.chan.moviesearcher.domain.dto.MovieDto
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MovieSearchRepositoryImplTest {

    private val movieDataSourceImpl: MovieDataSourceImpl = mockk(relaxed = true)
    private lateinit var repositoryImpl: MovieSearchRepositoryImpl

    @BeforeEach
    fun setup() {
        repositoryImpl = MovieSearchRepositoryImpl(movieDataSourceImpl)
    }

    @Test
    fun `영화 리스트 가져오기 기능 테스트`() = runBlocking {
        val mockResponse: MovieResponse = mockk(relaxed = true)

        coEvery {
            movieDataSourceImpl.fetchMovies(start = 1, query = "a")
        } returns mockResponse

        val result: MovieDto = repositoryImpl
            .fetchMovies(start = 1, query = "a")

        assertEquals(mockResponse.mapToDto(), result)
    }
}