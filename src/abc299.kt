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
    solveABC299B()
}

fun solveABC299B() {
    val (n, t) = readInts()
    val c = readInts()
    val r = readInts()

    val tt = if (c.contains(t)) {
        t
    } else {
        c[0]
    }

    var res = 0
    var max = 0
    for (i in 0 until n) {
        if (c[i] == tt) {
            if (r[i] > max) {
                max = r[i]
                res = i + 1
            }
        }
    }

    println(res)
}

fun solveABC299A() {
    val n = readInt()
    val s = readString()

    var leftIndex: Int? = null
    var rightIndex: Int? = null
    for ((i, si) in s.withIndex()) {
        if (si == '|') {
            if (leftIndex == null) {
                leftIndex = i
            } else {
                rightIndex = i
            }
        } else if (si == '*') {
            if (leftIndex == null) {
                println("out")
            } else {
                if (rightIndex == null) {
                    println("in")
                } else {
                    println("out")
                }
            }
        }
    }
}