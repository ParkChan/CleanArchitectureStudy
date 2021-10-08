package com.chan.moviesearcher.data.source

import com.chan.moviesearcher.data.entity.MovieResponse
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@ExperimentalCoroutinesApi
class MovieDataSourceImplTest {

    private val movieApi: MovieApi = mockk(relaxed = true)
    private lateinit var movieDataSourceImpl: MovieDataSourceImpl

    @BeforeEach
    fun setup() {
        movieDataSourceImpl = MovieDataSourceImpl(movieApi)
    }

    @Test
    fun `영화 리스트 가져오기 기능 테스트`() = runBlocking {
        val mockResponse: MovieResponse = mockk()

        coEvery {
            movieApi.fetchMovies(start = 1, query = "a")
        } returns mockResponse

        val result = movieDataSourceImpl
            .fetchMovies(1, "a")

        assertEquals(mockResponse, result)
    }

}