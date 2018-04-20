package io.access.kotlintraining
import java.util.Random
import kotlin.math.max

fun welcome() {
    println("welcome to ACCESS!")
}

// TODO: declare hello function

fun hello() {
    println("Hello World!")
}

fun isDivideThree(n: Int): Boolean {
    return n%3 == 0
}


fun isDivideFive(n: Int): Boolean {
    return n%5 == 0
}

fun isDivideFifteen(n: Int): Boolean {
    return n%15 == 0
}

fun fizzBuzz() {
    for (n in 1..100) {
        // 実装する
        // use if
        println(if (isDivideThree(n)) {
                "Fizz"
            } else if (isDivideFive(n)) {
                "Buzz"
            } else if (isDivideFifteen(n)) {
                "FizzBuzz"
            } else {
                "$n"
            })
        // use when
        println(when {
            isDivideThree(n) -> "Fizz"
            isDivideFive(n) -> "Buzz"
            isDivideFifteen(n) -> "FizzBuzz"
            else -> "$n"
        })
    }
}

fun fizzBuzzFree(n: Int): String {
    // 実装する
    return when {
        isDivideFifteen(n) -> "FizzBuzz"
        isDivideThree(n) -> "Fizz"
        isDivideFive(n) -> "Buzz"
        else -> "$n" // n.toString()
    }
}

// うるう年かどうかを判定する関数
fun isLeapYear(y: Int): Boolean {
    // TODO: 実装する
    return y % 400 == 0 || y % 4 == 0 && y % 100 != 0
}

fun isLeapYearFree(y: Int): String {
    // TODO: 実装する
    val result: String = if (isLeapYear(y)) "definitely" else "NOT"
    //println("year $y is $result leap year!")
    return "year $y is $result leap year!"
}

fun Int.isOdd() = this%2 != 0

fun Int.isEven() = this%2 == 0

fun Int.isOddEx() { if (this%2 != 0) println("$this is an Odd!") else println("$this is NOT an Odd!")}

fun Int.isEvenEx() { if (this%2 == 0) println("$this is an Even!") else println("$this is NOT an Even!")}

class Dice (val maxdice: Int = 100, var counter: Int = 0) {

    fun random(from: Int, to: Int) = (Math.random() * (to - from) + from).toInt()

    fun roll(): Int {
        counter++
        if (counter in 1..100) {
            //val random = Random()
            val n = random(from = 1, to = maxdice) // 0〜max までの範囲の値がランダムで返る
            //println(n)
            return n
        } else if (counter > 100) {
            //println("I was broken !")
            throw Exception("I was broken !")
        } else {
            throw Exception("Impossible number !")
        }
    }

}

class NabeAtsu {
    // TODO: 実装する
    private var counter: Int = 0

    fun next(): String {
        // TODO: 実装する
        counter++
        return when {
            counter%3 == 0 -> "Aho"
            counter.toString().contains("3") -> "Aho"
            else -> "$counter"
        }
    }

    fun nextFree(n: Int): String {
        // TODO: 実装する
        return when {
            n%3 == 0 -> "Aho"
            n.toString().contains("3")  -> "Aho"
            else -> "$n"
        }
    }
}

// コンパイル通すための諸々
class Client (val personalInfo: PersonalInfo?)

class PersonalInfo (val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String): String
}

class SuperMailer : Mailer {
    override fun sendMessage(email: String, message: String): String {
        //println("Hello, $email, $message!")
        return "Hello, $email, $message!"
    }
}

fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer): String? {
    /*
    @Nullable Client client,
    @Nullable String message,
    @NonNull Mailer mailer,    */
    if (message == null) return ""

    val personalInfo = client?.personalInfo
    personalInfo ?: return ""

    val email = personalInfo?.email?.let {
        mailer.sendMessage(it, message) }
    return email
}

