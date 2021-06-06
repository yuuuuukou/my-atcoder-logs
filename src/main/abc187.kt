package main

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    solveABC187C()
}

fun solveABC187C() {
    val n = readLine()!!.toInt()
    val map = mutableMapOf<String, String>()
    for (i in 0 until n) {
        val s = readLine()!!
        map[s] = "1"

        val s2 = if (s.startsWith("!")) s.replace("!", "") else "!$s"

        if (map.containsKey(s) && map.containsKey(s2)) {
            println(s.replace("!", ""))
            exitProcess(0)
        }
    }

    println("satisfiable")
}

fun solveABC187B() {
    val n = readLine()!!.toInt()
    val x = mutableListOf<Int>()
    val y = mutableListOf<Int>()

    for (i in 0 until n) {
        val (xi, yi) = readLine()!!.split(" ").map { it.toInt() }
        x.add(xi)
        y.add(yi)
    }

    var cnt = 0

    for (i in 0 until n) {
        val xi = x[i]
        val yi = y[i]

        for (j in (i + 1) until n) {
            val xj = x[j]
            val yj = y[j]

            // 2点を通る直線の方程式
            // y - y1 = (y2 - y1) / (x2 - x1) * (x - x1)
            val a: Double = (yj.toDouble() - yi.toDouble()) / (xj.toDouble() - xi.toDouble())

            // -1以上 1以下
            if (a >= -1 && a <= 1) {
                cnt++
            }
        }
    }

    println(cnt)
}

fun solveABC187A() {
    val (sa, sb) = readLine()!!.split(" ")

    val a = sa[0].toString().toInt() + sa[1].toString().toInt() + sa[2].toString().toInt()
    val b = sb[0].toString().toInt() + sb[1].toString().toInt() + sb[2].toString().toInt()

    if (a < b) {
        println(b)
    } else {
        println(a)
    }
}
