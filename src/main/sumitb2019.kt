package main

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    solveSumitb2019B()
}

private fun solveSumitb2019B() {
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        val x = (i * 1.08).toInt()
        if (n == x) {
            print(i)
            exitProcess(0)
        }
    }
    print(":(")
}