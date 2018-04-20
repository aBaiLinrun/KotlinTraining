package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals

class IsLeapYearTest {

    @Test
    fun testIsLeapYear() {
        // TODO: implement to call isLeapYear function
        //isLeapYear(y = readLine()!!.split(' ').map(String::toInt))
        //println(isLeapYearFree(2022))

        val mapOfLeapYear = mapOf<Int, String>(2020 to "year 2020 is definitely leap year!", 2000 to "year 2000 is definitely leap year!")
        for (item in mapOfLeapYear) {
            val expected: String = item.value
            val actual: String = isLeapYearFree(item.key)
            assertEquals(expected, actual, "[want] $expected [got] $actual")
        }

        val mapOfNotLeapYear = mapOf<Int, String>(2022 to "year 2022 is NOT leap year!", 2018 to "year 2018 is NOT leap year!")
        for (item in mapOfNotLeapYear) {
            val expected: String = item.value
            val actual: String = isLeapYearFree(item.key)
            assertEquals(expected, actual, "[want] $expected [got] $actual")
        }
    }

}