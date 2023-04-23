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
    solveABC159C()
}

fun solveABC159C() {
    val l = readDouble()

    val length = l / 3.0
    val res = length * length * (l - 2 * length)

    println(res)
}

fun solveABC159B() {
    val s = readString()

    if (s == s.reversed()) {
        // ok
    } else {
        println("No")
        return
    }

    val sLeft = s.substring(0..((s.length - 1 / 2)) - 1)
    if (sLeft == sLeft.reversed()) {
        // ok
    } else {
        println("No")
        return
    }

    val sRight = s.substring((s.length + 3) / 2 - 1..s.length - 1)
    if (sRight == sRight.reversed()) {
        // ok
    } else {
        println("No")
        return
    }

    println("Yes")
}

fun solveABC159A() {
    val (n, m) = readLongs()

    println(n * (n - 1) / 2 + m * (m - 1) / 2)
}