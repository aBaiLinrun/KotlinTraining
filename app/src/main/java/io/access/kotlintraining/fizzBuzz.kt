package io.access.kotlintraining


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
