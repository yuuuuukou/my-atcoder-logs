package main

import java.lang.Integer.min
import java.math.BigDecimal
import kotlin.math.max
import kotlin.system.exitProcess

fun main() {
    solveABC189C()
}

fun solveABC189C() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    var ans = 0
    for (l in 0 until n) {
        // xの初期値をl番目の値で設定
        var x = a[l]
        for (r in l until n) {
            // xをminで更新
            x = min(x, a[r])
            // lからrまでの分、xをかける
            ans = max(ans, x * (r - l + 1))
        }
    }
    println(ans)
}

fun solveABC189B() {
    // n杯飲む、許容量はxml
    val (n, x) = readLine()!!.split(" ").map { it.toInt() }

    var current = BigDecimal("0")
    for (i in 0 until n) {
        val (v, p) = readLine()!!.split(" ").map { it.toBigDecimal().setScale(3) }
        val alc = v * p / BigDecimal("100")
        current += alc

        if (current > BigDecimal(x)) {
            println(i + 1)
            exitProcess(0)
        }
    }

    print("-1")
}

fun solveABC189A() {
    val ccc = readLine()!!

    if (ccc[0] == ccc[1] && ccc[0] == ccc[2]) {
        println("Won")
    } else {
        println("Lost")
    }
}