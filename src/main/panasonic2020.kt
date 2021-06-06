package main

fun main(args: Array<String>) {
    solvePanasonic2020B()
}

private fun solvePanasonic2020B() {
    val (h, w) = readLine()!!.split(" ").map { it.toLong() }

    if (h == 1L || w == 1L) {
        // 1 * n はどれだけ頑張っても1にしかならない
        println(1)
    } else {
        if (h % 2 != 0L && w % 2 != 0L) {
            println(h * w / 2 + 1)
        } else {
            println(h * w / 2)
        }
    }
}