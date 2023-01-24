private val reader = System.`in`.bufferedReader()
private fun readString() = reader.readLine()
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
    solveABC044B()
}

fun solveABC044B() {
    val w = readString()
    val map = mutableMapOf<String, Int>()
    for (wi in w) {
        map[wi.toString()] = (map[wi.toString()] ?: 0) + 1
    }
    for (item in map) {
        if (item.value % 2 != 0) {
            println("No")
            return
        }
    }
    println("Yes")
}

fun solveABC044A() {
    val n = readLine()!!.toInt()
    val k = readLine()!!.toInt()
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()

    var cost = 0
    for (i in 0 until n) {
        if (i + 1 <= k) {
            cost += x
        } else {
            cost += y
        }
    }
    println(cost)
}