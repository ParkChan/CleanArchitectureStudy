package com.chan.moviesearcher.domain.dto

import java.util.*

data class MovieDto(
    val display: Int = 0,
    val items: List<ItemDto> = emptyList(),
    val lastBuildDate: Date = Date(0),
    val start: Int = 0,
    val total: Int = 0
)