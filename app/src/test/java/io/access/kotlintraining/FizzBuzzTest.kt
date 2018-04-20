package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals

class FizzBuzzTest {

    @Test
    fun testFizzBuzz() {
        // TODO: implement to call fizzBuzzFree function
        fizzBuzz()

        // TODO: テストを書く
        // assertEquals 等の assert 系 function を使おう
        // 以下の kotlin.test パッケージのリファレンスも参照のこと
        // https://kotlinlang.org/api/latest/kotlin.test/kotlin.test/index.html
        /*
        var expected = "Fizz"
        var actual = fizzBuzzFree(3)
        assertEquals(expected, actual, "[want] $expected [got] $actual")

        expected = "Buzz"
        actual = fizzBuzzFree(5)
        assertEquals(expected, actual, "[want] $expected [got] $actual")

        expected = "FizzBuzz"
        actual = fizzBuzzFree(15)
        assertEquals(expected, actual, "[want] $expected [got] $actual")

        expected = "14"
        actual = fizzBuzzFree(14)
        assertEquals(expected, actual, "[want] $expected [got] $actual")
        */

        val mapOfFizzBuzz = mapOf<Int, String>(1 to "1", 3 to "Fizz", 5 to "Buzz", 7 to "7", 15 to "FizzBuzz")
        for (item in mapOfFizzBuzz) {
            val expected: String = item.value
            val actual: String = fizzBuzzFree(item.key)
            assertEquals(expected, actual, "[want] $expected [got] $actual")
        }
    }
}