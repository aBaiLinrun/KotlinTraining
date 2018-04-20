package io.access.kotlintraining

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
