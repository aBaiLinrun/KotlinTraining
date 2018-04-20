package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals

class NabeAtsuTest {

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

}