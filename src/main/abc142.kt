package main

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }

    val map = mutableMapOf<Int, Int>()

    for ((i, ai) in a.withIndex()) {
        // i+1さん は ai番目
        map[ai] = i + 1
    }

    for (i in 1..n) {
        if (i==n) {
            print("${map[i]}")
        } else {
            print("${map[i]} ")
        }
    }
}