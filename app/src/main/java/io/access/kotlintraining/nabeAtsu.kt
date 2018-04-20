package io.access.kotlintraining

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
