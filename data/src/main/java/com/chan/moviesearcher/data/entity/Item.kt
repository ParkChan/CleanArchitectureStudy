package com.chan.moviesearcher.data.entity

import com.chan.moviesearcher.domain.dto.ItemDto
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class Item(
    @Json(name = "actor")
    val actor: String = "",
    @Json(name = "director")
    val director: String = "",
    @Json(name = "image")
    val image: String = "",
    @Json(name = "link")
    val link: String = "",
    @Json(name = "pubDate")
    val pubDate: String = "",
    @Json(name = "subtitle")
    val subtitle: String = "",
    @Json(name = "title")
    val title: String = "",
    @Json(name = "userRating")
    val userRating: Double = 0.0
) {

    companion object {
        fun mapToDto(item: Item): ItemDto =
            ItemDto(
                actor = item.actor,
                director = item.director,
                image = item.image,
                link = item.link,
                pubDate = item.pubDate,
                subtitle = item.subtitle,
                title = item.title,
                userRating = item.userRating
            )
    }
}