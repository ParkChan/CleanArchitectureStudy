package com.chan.moviesearcher.data.entity

import com.chan.moviesearcher.data.DateJsonAdapter
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.File
import java.util.*


class MovieResponseTest {

    private val moshi = Moshi.Builder()
        .add(Date::class.java, DateJsonAdapter().nullSafe())
        .add(KotlinJsonAdapterFactory())
        .build()

    private lateinit var jsonAdapter: JsonAdapter<MovieResponse>

    @BeforeEach
    fun setup() {
        jsonAdapter = moshi.adapter(MovieResponse::class.java)
    }

    @Test
    fun `json 파일을 읽어와서 엔티티로 변환합니다`() {
        val json = File("src/test/resources/api-response/1.json").readText()
        val response = jsonAdapter.fromJson(json) ?: MovieResponse()

        assertThat(response.total).isEqualTo(88)
        assertThat(response.start).isEqualTo(2)
        assertThat(response.display).isEqualTo(10)
    }
}