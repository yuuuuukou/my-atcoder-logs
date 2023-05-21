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
    solveABC223C()
}

fun solveABC223C() {
    val n = readInt()

    val list = mutableListOf<Pair<Double, Double>>()
    var totalTime = 0.0
    repeat(n) {
        val (ai, bi) = readDoubles()
        list.add(Pair(ai, bi))
        totalTime += (ai / bi)
    }

    var currentLength = 0.0
    var currentTime = 0.0
    for (item in list) {
        val length = item.first
        val time = (item.first / item.second)
        if (totalTime / 2 in currentTime..currentTime + time) {
            currentLength += (length * (totalTime / 2 - currentTime) / time)
            println(currentLength)
            return
        } else {
            currentLength += length
            currentTime += time
        }
    }
}

fun solveABC223B() {
    var s = readString()

    val ss = mutableListOf<String>()

    if (s.length == 1) {
        println(s)
        println(s)
        return
    }

    repeat(s.length) {
        ss.add(s)
        s = "${s.substring(1..s.lastIndex)}${s.substring(0..0)}"
    }

    println(ss.min())
    println(ss.max())
}

fun solveABC223A() {
    val x = readInt()
    if (x == 0) {
        println("No")
    } else {
        if (x % 100 == 0) {
            println("Yes")
        } else {
            println("No")
        }
    }
}