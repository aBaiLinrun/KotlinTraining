package io.access.kotlintraining

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
