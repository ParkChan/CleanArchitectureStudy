package com.chan.moviesearcher.data.entity

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class MovieReponse(
    @Json(name = "display")
    val display: Int,
    @Json(name = "items")
    val items: List<Item>,
    @Json(name = "lastBuildDate")
    val lastBuildDate: String,
    @Json(name = "start")
    val start: Int,
    @Json(name = "total")
    val total: Int
)