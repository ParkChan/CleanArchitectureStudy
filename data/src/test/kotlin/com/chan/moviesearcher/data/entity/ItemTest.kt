package com.chan.moviesearcher.data.entity

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ItemTest {

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()
    private lateinit var jsonAdapter: JsonAdapter<Item>

    @BeforeEach
    fun setup() {
        jsonAdapter = moshi.adapter(Item::class.java)
    }

    @Test
    fun `영화 Item 관련 Json을 엔티티로 변환합니다`() {
        val response = jsonAdapter.fromJson(ITEM_JSON) ?: Item()

        assertEquals("보이나로비치", response.title)
        assertEquals("https://movie.naver.com/movie/bi/mi/basic.nhn?code=193591", response.link)
        assertEquals(0.00, response.userRating)
    }

    @Test
    fun `Json 엔티티를 Dto로 변환합니다`() {
        val dto = (jsonAdapter.fromJson(ITEM_JSON) ?: Item()).mapToDto()

        assertEquals("보이나로비치", dto.title)
        assertEquals("https://movie.naver.com/movie/bi/mi/basic.nhn?code=193591", dto.link)
        assertEquals(0.00, dto.userRating)
    }

    companion object {
        private const val ITEM_JSON =
            """
                {
                    "title": "보이나로비치",
                    "link": "https://movie.naver.com/movie/bi/mi/basic.nhn?code=193591",
                    "image": "https://ssl.pstatic.net/imgmovie/mdi/mit110/1935/193591_P01_130234.JPG",
                    "subtitle": "Wojnarowicz",
                    "pubDate": "2020",
                    "director": "크리스 맥킴|",
                    "actor": "",
                    "userRating": "0.00"
                }
            """
    }
}