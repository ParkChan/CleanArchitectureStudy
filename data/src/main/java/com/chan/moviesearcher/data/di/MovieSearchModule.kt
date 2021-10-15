package com.chan.moviesearcher.data.di

import com.chan.moviesearcher.data.repository.MovieSearchRepositoryImpl
import com.chan.moviesearcher.data.source.MovieDataSource
import com.chan.moviesearcher.data.source.MovieDataSourceImpl
import com.chan.moviesearcher.domain.repository.MovieSearchRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class MovieSearchModule {

    @Binds
    @Singleton
    abstract fun bindsMovieDataSource(
        movieDataSource: MovieDataSourceImpl
    ): MovieDataSource

    @Binds
    @Singleton
    abstract fun bindsMovieSearchRepository(
        movieSearchRepositoryImpl: MovieSearchRepositoryImpl
    ): MovieSearchRepository

}