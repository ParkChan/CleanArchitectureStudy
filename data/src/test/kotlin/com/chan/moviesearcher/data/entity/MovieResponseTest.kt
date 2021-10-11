package com.chan.moviesearcher.data.entity

import com.chan.moviesearcher.data.DateJsonAdapter
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.junit.jupiter.api.Assertions.assertEquals
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

        assertEquals(88, response.total)
        assertEquals(2, response.start)
        assertEquals(10, response.display)
    }

    @Test
    fun `Json 엔티티를 Dto로 변환합니다`() {
        val json = File("src/test/resources/api-response/1.json").readText()
        val dto = (jsonAdapter.fromJson(json) ?: MovieResponse()).mapToDto()

        assertEquals(88, dto.total)
        assertEquals(2, dto.start)
        assertEquals(10, dto.display)
    }
}