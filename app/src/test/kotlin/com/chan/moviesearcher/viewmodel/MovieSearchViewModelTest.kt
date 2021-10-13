package com.chan.moviesearcher.viewmodel

import com.chan.moviesearcher.domain.dto.MovieDto
import com.chan.moviesearcher.domain.usecase.MovieSearchUseCaseImpl
import com.chan.moviesearcher.util.InstantTaskExecutorExtension
import com.chan.moviesearcher.util.MainCoroutineRule
import com.chan.moviesearcher.util.getOrAwaitValue
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(InstantTaskExecutorExtension::class)
class MovieSearchViewModelTest {

    @ExperimentalCoroutinesApi
    private lateinit var mainCoroutineRule: MainCoroutineRule
    private val useCase: MovieSearchUseCaseImpl = mockk(relaxed = true)
    private lateinit var viewModel: MovieSearchViewModel

    @ExperimentalCoroutinesApi
    @BeforeEach
    fun setUp() {
        mainCoroutineRule = MainCoroutineRule()
        viewModel = MovieSearchViewModel(useCase)
    }

    @ExperimentalCoroutinesApi
    @Test
    @DisplayName("라이브 데이터 테스트 입니다")
    fun `라이브 데이터 테스트`() = mainCoroutineRule.runBlockingTest {

        val mockRes: MovieDto = mockk(relaxed = true)

        val page = 1
        val query = "a"

        coEvery {
            useCase.request(
                page,
                query
            ).getOrNull()
        } returns mockRes

        viewModel.getMovieList(
            page, query
        )

        assertEquals(
            mockRes,
            viewModel.movies.getOrAwaitValue()
        )
        println("End")
    }
}