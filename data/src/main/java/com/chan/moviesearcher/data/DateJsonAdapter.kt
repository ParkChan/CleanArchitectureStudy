package com.chan.moviesearcher.data

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class DateJsonAdapter : JsonAdapter<Date?>() {
    @Synchronized
    @Throws(IOException::class)
    override fun fromJson(reader: JsonReader): Date? {
        return if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull<Any>() as Date?
        } else {
            val string = reader.nextString()
            return SimpleDateFormat(NAVER_DATE_FORMAT, Locale.US).parse(string)
        }
    }

    @Suppress("SimpleDateFormat")
    @Synchronized
    @Throws(IOException::class)
    override fun toJson(writer: JsonWriter, value: Date?) {
        if (value == null) {
            writer.nullValue()
        } else {
            val dateFormat = SimpleDateFormat(DATE_FORMAT)
            val string = dateFormat.format(value)
            writer.value(string)
        }
    }

    companion object {
        private const val DATE_FORMAT = "yyyy MM dd"
        private const val NAVER_DATE_FORMAT = "EEE, dd MMM yyyy HH:mm:ss Z"
    }
}