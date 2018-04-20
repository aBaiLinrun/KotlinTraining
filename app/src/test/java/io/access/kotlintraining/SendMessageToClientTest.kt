package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals

class SendMessageToClientTest {

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