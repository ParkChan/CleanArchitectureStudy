package com.chan.moviesearcher.data

import com.chan.moviesearcher.data.NetworkModule.httpLoggingInterceptor
import com.chan.moviesearcher.data.NetworkModule.kotlinJsonAdapterFactory
import com.chan.moviesearcher.data.NetworkModule.moshi
import com.chan.moviesearcher.data.NetworkModule.moshiConverter
import com.chan.moviesearcher.data.NetworkModule.okHttpClient
import com.chan.moviesearcher.data.NetworkModule.retrofitBuild
import com.chan.moviesearcher.data.source.MovieApi

internal object RetrofitService {

    private fun movieService(): MovieApi =
        retrofitBuild(
            moshiConverter(
                moshi(
                    kotlinJsonAdapterFactory()
                )
            ),
            okHttpClient(httpLoggingInterceptor())
        ).create(MovieApi::class.java)

    internal val movieApi: MovieApi by lazy {
        movieService()
    }
}