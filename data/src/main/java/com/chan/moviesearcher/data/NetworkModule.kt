package com.chan.moviesearcher.data

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

internal object NetworkModule {

    private const val BASE_URL = "https://openapi.naver.com/"

    internal fun httpLoggingInterceptor() = HttpLoggingInterceptor()
        .apply {
            level = HttpLoggingInterceptor.Level.BODY
        }

    internal fun kotlinJsonAdapterFactory() = KotlinJsonAdapterFactory()

    internal fun moshi(jsonAdapterFactory: KotlinJsonAdapterFactory): Moshi =
        Moshi.Builder()
            .add(jsonAdapterFactory)
            .build()

    internal fun moshiConverter(moshi: Moshi): MoshiConverterFactory =
        MoshiConverterFactory.create(moshi)

    internal fun okHttpClient(
        loggingInterceptor: HttpLoggingInterceptor,
    ): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()

    internal fun retrofitBuild(
        converterFactory: MoshiConverterFactory,
        client: OkHttpClient
    ): Retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(converterFactory)
            .client(client)
            .build()

}