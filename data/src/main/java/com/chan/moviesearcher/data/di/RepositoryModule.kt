package com.chan.moviesearcher.data.di

import com.chan.moviesearcher.data.repository.MovieSearchRepositoryImpl
import com.chan.moviesearcher.data.source.MovieDataSource
import com.chan.moviesearcher.domain.repository.MovieSearchRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    internal fun provideMovieSearchRepository(dataSource: MovieDataSource): MovieSearchRepository =
        MovieSearchRepositoryImpl(dataSource)

}