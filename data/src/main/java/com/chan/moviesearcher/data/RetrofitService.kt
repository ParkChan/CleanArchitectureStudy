package com.chan.moviesearcher.data

import com.chan.moviesearcher.data.source.MovieApi
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

internal object RetrofitService {

    private const val BASE_URL = "https://openapi.naver.com/"

    private fun httpLoggingInterceptor() = HttpLoggingInterceptor()
        .apply {
            level = HttpLoggingInterceptor.Level.BODY
        }

    private fun kotlinJsonAdapterFactory() = KotlinJsonAdapterFactory()

    private fun moshi(jsonAdapterFactory: KotlinJsonAdapterFactory): Moshi =
        Moshi.Builder()
            .add(jsonAdapterFactory)
            .build()

    private fun moshiConverter(moshi: Moshi): MoshiConverterFactory =
        MoshiConverterFactory.create(moshi)

    private fun okHttpClient(
        loggingInterceptor: HttpLoggingInterceptor,
    ): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()

    private fun retrofitBuild(
        converterFactory: MoshiConverterFactory,
        client: OkHttpClient
    ): Retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(converterFactory)
            .client(client)
            .build()

    private fun movieService(): MovieApi =
        retrofitBuild(
            moshiConverter(
                moshi(
                    kotlinJsonAdapterFactory()
                )
            ),
            okHttpClient(httpLoggingInterceptor())
        ).create(MovieApi::class.java)

    val movieApi: MovieApi by lazy {
        movieService()
    }
}