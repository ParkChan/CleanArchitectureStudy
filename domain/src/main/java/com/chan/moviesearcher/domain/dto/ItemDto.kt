package com.chan.moviesearcher.domain.dto

data class ItemDto(
    val actor: String = "",
    val director: String = "",
    val image: String = "",
    val link: String = "",
    val pubDate: String = "",
    val subtitle: String = "",
    val title: String = "",
    val userRating: Double = 0.0
)