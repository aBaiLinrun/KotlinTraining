package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertTrue

class DiceRollingTest {

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

}