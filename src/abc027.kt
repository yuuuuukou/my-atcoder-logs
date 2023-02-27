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
    solveABC027B()
}

fun solveABC027B() {
    val n = readInt()
    val a = readInts()

    if (a.sum() % n != 0) {
        println(-1)
        return
    }

    var res = 0
    val avg = a.average().toInt()
    var currentSum = 0
    for ((i, ai) in a.withIndex()) {
        currentSum += ai
        if (currentSum == avg * (i + 1)) {
            // そのままでok
        } else {
            // 橋が必要
            res++
        }
    }

    println(res)
}

fun solveABC027A() {
    val (l1, l2, l3) = readInts()
    if (l1 == l2) {
        println(l3)
    } else if (l2 == l3) {
        println(l1)
    } else {
        println(l2)
    }
}