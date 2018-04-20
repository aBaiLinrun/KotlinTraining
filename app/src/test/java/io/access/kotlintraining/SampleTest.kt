package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

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

    @Test
    fun testDiceRolling() {
        // TODO: implement to call diceRolling function
        val d = Dice(16)
        /*
        for (i in 1..100) {
            println(d.roll()) // 1〜16 までの数字
        }
        println(d.roll()) // Exception
        */

        // TODO: テストを書く
        /*
        var expected = "I was broken !"
        var actual = println(d.roll()).toString()
        */
        for (i in 1..101) {
            try {
                val result: Int = d.roll()
                println("$i: $result")
                assertTrue(result in 1..16, "[want] roll($i) [got] $result")
                assertTrue(i <= 100, "[want] i <= 100 [got] $i")
            } catch (e: Exception) {
                println(e.message)
            }
        }
    }

    @Test
    fun testNabeAtsu() {
        val n = NabeAtsu()
        for (i in 1..100) {
            println(n.next())
        }

        // TODO: テストを書く
        /*
        var expected = "Aho"
        var actual = n.nextFree(13)
        assertEquals(expected, actual, "[want] $expected [got] $actual")

        expected = "Aho"
        actual = n.nextFree(21)
        assertEquals(expected, actual, "[want] $expected [got] $actual")

        expected = "22"
        actual = n.nextFree(22)
        assertEquals(expected, actual, "[want] $expected [got] $actual")
        */

        val mapOfNabeAtsu = mapOf<Int, String>(13 to "Aho", 21 to "Aho", 22 to "22", 7 to "7", 15 to "Aho")
        for (item in mapOfNabeAtsu) {
            val expected: String = item.value
            val actual: String = n.nextFree(item.key)
            assertEquals(expected, actual, "[want] $expected [got] $actual")
        }
    }


    @Test
    fun testSendMessageToClient() {

        val emailOfGod = PersonalInfo(email = "top Secret!")
        val sumomo = Client(personalInfo = emailOfGod)
        val sumomoMailer = SuperMailer()

        //sendMessageToClient(sumomo, "we are here", sumomoMailer)

        // TODO: テストを書く
        var expected = "Hello, top Secret!, we are here!"
        var actual = sendMessageToClient(sumomo, "we are here", sumomoMailer).toString()
        assertEquals(expected, actual, "[want] $expected [got] $actual")

        expected = "Hello, top Secret!, we are everywhere!"
        actual = sendMessageToClient(sumomo, "we are everywhere", sumomoMailer).toString()
        assertEquals(expected, actual, "[want] $expected [got] $actual")

        expected = "Hello, top Secret!, !"
        actual = sendMessageToClient(sumomo, "", sumomoMailer).toString()
        assertEquals(expected, actual, "[want] $expected [got] $actual")

    }

}