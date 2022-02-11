package com.openclassrooms.realestatemanager.utils

import java.text.DateFormat
import java.util.*

fun formatTimestampToString(time : Long) : String {
    val date = Date(time)
    return DateFormat.getDateInstance(DateFormat.LONG).format(date)
}