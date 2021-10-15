package com.chan.moviesearcher.data.di

import com.chan.moviesearcher.data.DateJsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal class NetworkModule {

    @Provides
    @Singleton
    fun providesHttpLoggingInterceptor() = HttpLoggingInterceptor()
        .apply {
            level = HttpLoggingInterceptor.Level.BODY
        }

    @Provides
    @Singleton
    fun providesKotlinJsonAdapterFactory() = KotlinJsonAdapterFactory()

    @Provides
    @Singleton
    fun providesDateJsonAdapter() = DateJsonAdapter()

    @Provides
    @Singleton
    fun providesMoshi(
        jsonAdapterFactory: KotlinJsonAdapterFactory,
        dateJsonAdapter: DateJsonAdapter
    ): Moshi =
        Moshi.Builder()
            .add(dateJsonAdapter)
            .add(jsonAdapterFactory)
            .build()

    @Provides
    @Singleton
    fun providesMoshiConverter(moshi: Moshi): MoshiConverterFactory =
        MoshiConverterFactory.create(moshi)

    @Provides
    @Singleton
    fun providesOkHttpClient(
        loggingInterceptor: HttpLoggingInterceptor
    ): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()

    @Provides
    @Singleton
    fun providesRetrofitBuild(
        converterFactory: MoshiConverterFactory,
        client: OkHttpClient
    ): Retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(converterFactory)
            .client(client)
            .build()

    companion object {
        private const val BASE_URL = "https://openapi.naver.com/"
    }

}