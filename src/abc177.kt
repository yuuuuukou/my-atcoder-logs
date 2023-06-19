import java.math.BigDecimal
import kotlin.math.min

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readBigDecimal() = readLn().toBigDecimal()
private fun readBigDecimals() = readLn().split(" ").map { it.toBigDecimal() }.toMutableList()

fun main(args: Array<String>) {
    solveABC177C()
}

fun solveABC177C() {
    val n = readInt()
    val a = readBigDecimals()

    val list = mutableListOf<BigDecimal>()
    for (ai in a) {
        if (list.isEmpty()) {
            list.add(ai)
        } else {
            val tmp = list[list.lastIndex] + ai
            list.add(tmp)
        }
    }

    var sum = 0.toBigDecimal()
    for ((i, ai) in a.withIndex()) {
        sum += ai * (list[list.lastIndex] - list[i])
    }

    println(sum.remainder(1000000007.toBigDecimal()))
}

fun solveABC177B() {
    val s = readLn()
    val t = readLn()

    var res = Int.MAX_VALUE
    for (i in 0..s.length - t.length) {
        var distance = 0
        for (j in 0 until t.length) {
            if (s[i + j] == t[j]) {
                // match
            } else {
                distance++
            }
        }
        res = min(res, distance)
    }

    println(res)
}

fun solveABC177A() {
    val (d, t, s) = readInts()

    if (d <= t * s) {
        println("Yes")
    } else {
        println("No")
    }
}