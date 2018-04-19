package io.access.kotlintraining

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
        if (isDivideThree(n)) {
            println("Fizz")
        } else if (isDivideFive(n)) {
            println("Buzz")
        } else if (isDivideFifteen(n)) {
            println("FizzBuzz")
        } else {
            println(n)
        }
        // use when
        when {
            isDivideThree(n) -> println("Fizz")
            isDivideFive(n) -> println("Buzz")
            isDivideFifteen(n) -> println("FizzBuzz")
            else -> println(n)
        }
    }
}

fun fizzBuzzFree(n: Int): String {
    // 実装する
    val result: String = when {
        isDivideFifteen(n) -> "FizzBuzz"
        isDivideThree(n) -> "Fizz"
        isDivideFive(n) -> "Buzz"
        else -> "$n" // n.toString()
    }
    return result
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

