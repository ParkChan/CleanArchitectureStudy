package com.chan.moviesearcher.data.entity

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.util.*

@JsonClass(generateAdapter = true)
internal data class MovieResponse(
    @Json(name = "display")
    val display: Int = 0,
    @Json(name = "items")
    val items: List<Item> = emptyList(),
    @Json(name = "lastBuildDate")
    val lastBuildDate: Date?,
    @Json(name = "start")
    val start: Int = 0,
    @Json(name = "total")
    val total: Int = 0
)