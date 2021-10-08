package com.chan.moviesearcher.data

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class DateJsonAdapter : JsonAdapter<Date?>() {

    private val dateFormat = SimpleDateFormat(NAVER_DATE_FORMAT, Locale.US)

    @Synchronized
    @Throws(IOException::class)
    override fun fromJson(reader: JsonReader): Date? {
        return if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull<Any>() as Date?
        } else {
            val string = reader.nextString()
            return dateFormat.parse(string)
        }
    }

    @Suppress("SimpleDateFormat")
    @Synchronized
    @Throws(IOException::class)
    override fun toJson(writer: JsonWriter, value: Date?) {
        if (value == null) {
            writer.nullValue()
        } else {
            writer.value(value.toString())
        }
    }

    companion object {
        private const val NAVER_DATE_FORMAT = "EEE, dd MMM yyyy HH:mm:ss Z"
    }
}