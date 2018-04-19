package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals

class SampleTest {

    @Test
    fun testHello() {
        // TODO: implement to call hello function
        hello()
    }

    @Test
    fun testWelcome() {
        welcome()

        // Example of test
        val expected = 1
        val actual = 1
        assertEquals(expected, actual, "[want] $expected [got] $actual")
    }

    @Test
    fun testFizzBuzz() {
        // TODO: implement to call fizzBuzzFree function
        fizzBuzz()

        // TODO: テストを書く
        // assertEquals 等の assert 系 function を使おう
        // 以下の kotlin.test パッケージのリファレンスも参照のこと
        // https://kotlinlang.org/api/latest/kotlin.test/kotlin.test/index.html
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
    }

    @Test
    fun testIsLeapRYear() {
        // TODO: implement to call isLeapYear function
        //isLeapYear(y = readLine()!!.split(' ').map(String::toInt))
        printLeapYear(2020)
    }

    @Test
    fun testIsOddEven() {
        // TODO: implement to call isOddEven function
        5.isEvenEx()
        5.isOddEx()

        // TODO: テストを書く
        var expected = true
        var actual = 3.isOdd()
        assertEquals(expected, actual, "[want] $expected [got] $actual")

        expected = true
        actual = 2.isEven()
        assertEquals(expected, actual, "[want] $expected [got] $actual")
    }

}