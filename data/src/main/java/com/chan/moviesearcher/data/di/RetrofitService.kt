package com.chan.moviesearcher.data.di

import com.chan.moviesearcher.data.source.MovieApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal class RetrofitService {

    @Provides
    @Singleton
    internal fun provideMovieService(retrofit: Retrofit): MovieApi =
        retrofit.create(MovieApi::class.java)
}