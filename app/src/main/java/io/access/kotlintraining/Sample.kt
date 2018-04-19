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

fun printLeapYear(y: Int) {
    // TODO: 実装する
    val result: String = if (isLeapYear(y)) "definitely" else "NOT"
    println("year $y is $result leap year! ")
}

fun Int.isOdd() = this%2 != 0

fun Int.isEven() = this%2 == 0

fun Int.isOddEx() { if (this%2 != 0) println("$this is an Odd!") else println("$this is NOT an Odd!")}

fun Int.isEvenEx() { if (this%2 == 0) println("$this is an Even!") else println("$this is NOT an Even!")}

class Dice (val maxdice: Int = 100, var counter: Int = 0) {

    fun roll() {
        counter++
        if (counter in 1..100) {
            val random = Random()
            val n = random.nextInt(maxdice) // 0〜max までの範囲の値がランダムで返る
            println(n)
        } else {
            println("I was broken !")
        }
    }

}

class NabeAtsu {
    // TODO: 実装する
    var counter: Int = 0

    fun next(): String {
        // TODO: 実装する
        counter++
        return when {
            counter%3 == 0 -> "Aho"
            counter.toString().indexOf("3") > -1  -> "Aho"
            else -> "$counter"
        }
    }

    fun nextFree(n: Int): String {
        // TODO: 実装する
        return when {
            n%3 == 0 -> "Aho"
            n.toString().indexOf("3") > -1  -> "Aho"
            else -> "$n"
        }
    }
}


