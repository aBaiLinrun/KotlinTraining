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

fun fizzBuzz() {
    for (n in 1..100) {
        // 実装する
        // use if
        if (isDivideThree(n)) {
            println("Fizz")
        } else if (isDivideFive(n)) {
            println("Buzz")
        } else {
            println("FizzBuzz")
        }
        // use when
        when (true) {
            isDivideThree(n) -> println("Fizz")
            isDivideFive(n) -> println("Buzz")
            else -> println("FizzBuzz")
        }
    }
}

fun fizzBuzzFree() {
    // 実装する
    //val n = nextInt()
    // use when
    when (true) {
        isDivideThree(n) -> println("Fizz")
        isDivideFive(n) -> println("Buzz")
        else -> println("FizzBuzz")
    }
}