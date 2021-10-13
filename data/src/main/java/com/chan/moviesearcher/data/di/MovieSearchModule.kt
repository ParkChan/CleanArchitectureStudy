package com.chan.moviesearcher.data.di

import com.chan.moviesearcher.data.repository.MovieSearchRepositoryImpl
import com.chan.moviesearcher.data.source.MovieApi
import com.chan.moviesearcher.data.source.MovieDataSource
import com.chan.moviesearcher.data.source.MovieDataSourceImpl
import com.chan.moviesearcher.domain.repository.MovieSearchRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal class MovieSearchModule {

    @Provides
    @Singleton
    internal fun provideMovieDataSource(movieApi: MovieApi): MovieDataSource =
        MovieDataSourceImpl(movieApi)

    @Provides
    @Singleton
    internal fun provideMovieSearchRepository(dataSource: MovieDataSource): MovieSearchRepository =
        MovieSearchRepositoryImpl(dataSource)


}