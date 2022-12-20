import kotlin.math.max
import kotlin.math.pow

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
    solveABC238B()
}

fun solveABC238B() {
    val n = readInt()
    val a = readInts()

    val list = MutableList(360) { 0 }
    list[0] = 1
    var current = 0
    for (ai in a) {
        current = ((current + ai) % 360)
        list[current] = 1
    }

    var res = 0
    var tmp = 1
    for (item in list) {
        if (item == 1) {
            tmp = 1
        } else {
            tmp++
        }
        res = max(res, tmp)
    }

    println(res)
}

fun solveABC238A() {
    val n = readInt()
    if (2.0.pow(n.toDouble()).toInt() > n * n) {
        println("Yes")
    } else {
        println("No")
    }
}