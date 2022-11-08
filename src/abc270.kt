import kotlin.math.absoluteValue
import kotlin.math.sign

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
    solveABC270B()
}

fun solveABC270B() {
    val (x, y, z) = readInts()

    if (x.sign == y.sign) {
        val xGaChikai = if (x.sign == 1) x < y else x > y
        if (xGaChikai) {
            println(x.absoluteValue)
        } else {
            // 壁にひっかかるのでハンマー取りに行く
            if (y.sign == z.sign) {
                val yGaChikai = if (y.sign == 1) y < z else y > z
                if (yGaChikai) {
                    println("-1")
                } else {
                    println(x.absoluteValue)
                }
            } else {
                println(x.absoluteValue + z.absoluteValue * 2)
            }
        }
    } else {
        println(x.absoluteValue)
    }
}

fun solveABC270A() {
    val (a, b) = readInts()

    var score = 0
    // q1
    if ((a == 1 || a == 3 || a == 5 || a == 7) || (b == 1 || b == 3 || b == 5 || b == 7)) {
        score += 1
    }
    // q2
    if ((a == 2 || a == 3 || a == 6 || a == 7) || (b == 2 || b == 3 || b == 6 || b == 7)) {
        score += 2
    }
    // q3
    if ((a == 4 || a == 5 || a == 6 || a == 7) || (b == 4 || b == 5 || b == 6 || b == 7)) {
        score += 4
    }

    println(score)
}