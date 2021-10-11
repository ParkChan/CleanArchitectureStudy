package com.chan.moviesearcher.data.entity

import com.chan.moviesearcher.domain.dto.MovieDto
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
    val lastBuildDate: Date = Date(0),
    @Json(name = "start")
    val start: Int = 0,
    @Json(name = "total")
    val total: Int = 0
) {
    companion object {
        fun mapToDto(movieResponse: MovieResponse): MovieDto =
            MovieDto(
                display = movieResponse.display,
                items = movieResponse.items.map {
                    Item.mapToDto(it)
                },
                lastBuildDate = movieResponse.lastBuildDate,
                start = movieResponse.start,
                total = movieResponse.total,
            )
    }
}
