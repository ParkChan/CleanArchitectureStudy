package com.chan.moviesearcher.data.entity

internal interface DataToDomainMapper<T> {
    fun mapToDto(): T
}