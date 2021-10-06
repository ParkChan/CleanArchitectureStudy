package com.chan.moviesearcher.data.source

import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
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
        movieDataSourceImpl.fetchMovies(1, "a")
        coVerify {
            movieApi.fetchMovies(1, "a")
        }
    }

}