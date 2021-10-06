package com.chan.moviesearcher.data.source

import com.chan.moviesearcher.data.entity.MovieReponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

internal interface MovieApi {

    @Headers(
        "X-Naver-Client-Id: xqdC6fLASTPbv8Wuq6Ht",
        "X-Naver-Client-Secret: _RCz_dz2Ui",
    )
    @GET("/v1/search/movie.json")
    suspend fun fetchMovies(
        @Query("start") start: Int,
        @Query("query") query: String,
        @Query("display") display: Int = DEFAULT_DISPLAY_COUNT
    ): MovieReponse

    companion object {
        const val DEFAULT_DISPLAY_COUNT = 10
    }
}