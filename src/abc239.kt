import java.math.RoundingMode
import kotlin.math.sqrt

private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readString().toDouble()
private fun readDoubles() = readString().split(" ").map { it.toDouble() }.toMutableList()
private fun readBigDecimal() = readString().toBigDecimal()
private fun readBigDecimals() = readString().split(" ").map { it.toBigDecimal() }.toMutableList()

fun main(args: Array<String>) {
    solveABC239C()
}

fun solveABC239C() {
    val (x1, y1, x2, y2) = readInts()

    // 注記・ユークリッド距離から、(±1, ±2)、(±2, ±1)の8パターンが√5になる座標
    val set1 = mutableSetOf<String>()
    val set2 = mutableSetOf<String>()

    fun addSet(set: MutableSet<String>, x1: Int, y1: Int) {
        set.add("${x1 + 1}_${y1 + 2}")
        set.add("${x1 + 1}_${y1 - 2}")
        set.add("${x1 - 1}_${y1 + 2}")
        set.add("${x1 - 1}_${y1 - 2}")
        set.add("${x1 + 2}_${y1 + 1}")
        set.add("${x1 + 2}_${y1 - 1}")
        set.add("${x1 - 2}_${y1 + 1}")
        set.add("${x1 - 2}_${y1 - 1}")
    }

    addSet(set1, x1, y1)
    addSet(set2, x2, y2)

    if (set1.intersect(set2).isEmpty()) {
        println("No")
    } else {
        println("Yes")
    }
}


fun solveABC239B() {
    val x = readBigDecimal()
    println(x.divide(10.toBigDecimal(), RoundingMode.FLOOR))
}

fun solveABC239A() {
    val h = readInt()
    println(sqrt(h * (12800000 + h).toDouble()))
}