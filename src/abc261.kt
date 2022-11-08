import kotlin.math.max

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
    solveABC261B()
}

fun solveABC261B() {
    val n = readInt()
    val matrix = mutableListOf<String>()
    for (i in 0 until n) {
        matrix.add(readString())
    }
    var res = "correct"
    for (i in 0 until n) {
        for (j in 0 until n) {
            val ij = matrix[i][j].toString()
            val ji = matrix[j][i].toString()
            if (ij == ji) {
                if (ij == "D" || i == j) {
                    // ok
                } else {
                    res = "incorrect"
                }
            } else {
                if (ij == "W" && ji == "L" || ij == "L" && ji == "W") {
                    // ok
                } else {
                    res = "incorrect"
                }
            }
        }
    }
    println(res)
}

fun solveABC261A() {
    val (l1, r1, l2, r2) = readInts()
    var length = 0
    for (i in 0..100) {
        if (i in l1..r1 && i in l2..r2) {
            length++
        }
    }
    println(max(length - 1, 0))
}