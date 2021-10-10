package com.chan.moviesearcher.data.repository

import com.chan.moviesearcher.data.entity.MovieResponse
import com.chan.moviesearcher.data.source.MovieDataSourceImpl
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MovieSearchRepositoryTest {

    private val movieDataSourceImpl: MovieDataSourceImpl = mockk(relaxed = true)
    private lateinit var repository: MovieSearchRepository

    @BeforeEach
    fun setup() {
        repository = MovieSearchRepository(movieDataSourceImpl)
    }

    @Test
    internal fun `영화 리스트 가져오기 기능 테스트`() = runBlocking {
        val mockResponse: MovieResponse = mockk()

        coEvery {
            movieDataSourceImpl.fetchMovies(start = 1, query = "a")
        } returns mockResponse

        val result = repository
            .fetchMovies(start = 1, query = "a")

        assertEquals(mockResponse.display, result.display)
    }
}