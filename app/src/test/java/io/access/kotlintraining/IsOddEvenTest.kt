package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals

class IsOddEvenTest {

    @Test
    fun testIsOddEven() {
        // TODO: implement to call isOddEven function
        5.isEvenEx()
        5.isOddEx()

        // TODO: テストを書く
        /*
        var expected = true
        var actual = 3.isOdd()
        assertEquals(expected, actual, "[want] $expected [got] $actual")

        expected = true
        actual = 2.isEven()
        assertEquals(expected, actual, "[want] $expected [got] $actual")

        expected = false
        actual = 5.isEven()
        assertEquals(expected, actual, "[want] $expected [got] $actual")
        */

        val listOfOdd = listOf<Int>(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29)
        for (num in 1..30) {
            val actual: Boolean = num.isOdd()
            val expected: Boolean = (num in listOfOdd)
            assertEquals(expected, actual, "[want] $num.isOdd() as $expected [got] $actual")
        }

        val listOfEven = listOf<Int>(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30)
        for (num in 1..30) {
            val actual: Boolean = num.isEven()
            val expected: Boolean = (num in listOfEven)
            assertEquals(expected, actual, "[want] $num.isOdd() as $expected [got] $actual")
        }
    }

}