package com.chan.moviesearcher.domain.di

import com.chan.moviesearcher.domain.repository.MovieSearchRepository
import com.chan.moviesearcher.domain.usecase.MovieSearchUseCase
import com.chan.moviesearcher.domain.usecase.MovieSearchUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MovieSearchUseCaseModule {

    @Provides
    @Singleton
    fun provideMovieSearchUseCase(repository: MovieSearchRepository): MovieSearchUseCase =
        MovieSearchUseCaseImpl(repository)

}