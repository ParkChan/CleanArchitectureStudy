package com.chan.moviesearcher.data.di

import com.chan.moviesearcher.data.source.MovieApi
import com.chan.moviesearcher.data.source.MovieDataSource
import com.chan.moviesearcher.data.source.MovieDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class SourceModule {

    @Provides
    @Singleton
    internal fun provideMovieDataSource(movieApi: MovieApi): MovieDataSource =
        MovieDataSourceImpl(movieApi)
}