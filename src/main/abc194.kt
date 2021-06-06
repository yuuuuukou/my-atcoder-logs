package main

import kotlin.math.*

fun main(args: Array<String>) {
    solveABC194C()
}

// FIXME: TLE
fun solveABC194C() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }

    var sum = 0
    for (i in 2..n) {
        for (j in 1..(i - 1)) {
            sum += (a[i - 1] - a[j - 1]).toDouble().pow(2).toInt()
        }
    }

    println(sum)
}

fun solveABC194B() {
    val n = readLine()!!.toInt()

    val aList = mutableListOf<Int>()
    val bList = mutableListOf<Int>()

    for (i in 0 until n) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        aList.add(a)
        bList.add(b)
    }

    var minTime = Int.MAX_VALUE
    for (ai in 0 until n) {
        for (bi in 0 until n) {
            val time = if (ai == bi) {
                aList[ai] + bList[bi]
            } else {
                max(aList[ai], bList[bi])
            }

            minTime = min(minTime, time)
        }
    }
    println(minTime)
}

fun solveABC194A() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    if (a + b >= 15 && b >= 8) {
        println("1")
    } else if (a + b >= 10 && b >= 3) {
        println("2")
    } else if (a + b >= 3) {
        println("3")
    } else {
        println("4")
    }
}
