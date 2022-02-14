package com.openclassrooms.realestatemanager.utils

import com.openclassrooms.realestatemanager.utils.Utils.getTodayDate
import junit.framework.TestCase
import org.junit.Test
import java.util.*

class DateFormatTest : TestCase(){

    @Test
    fun testGetTodayDate(){
        val date = Calendar.getInstance().also {
            it.timeInMillis = 0
            it.set(2022, 2, 12) }.timeInMillis

        val formattedDate = getTodayDate(Date(date))

        assertEquals("12/03/2022", formattedDate)
    }

    @Test
    fun testFormatTimestampToString(){
        val formattedDate = formatTimestampToString(1631429951000)

        assertEquals("12 septembre 2021", formattedDate)
    }
}