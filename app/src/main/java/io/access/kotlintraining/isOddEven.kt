package io.access.kotlintraining

fun Int.isOdd() = this%2 != 0

fun Int.isEven() = this%2 == 0

fun Int.isOddEx() { if (this%2 != 0) println("$this is an Odd!") else println("$this is NOT an Odd!")}

fun Int.isEvenEx() { if (this%2 == 0) println("$this is an Even!") else println("$this is NOT an Even!")}
