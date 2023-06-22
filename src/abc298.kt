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
    solveABC298B()
}

fun solveABC298B() {
    val n = readInt()
    val a = mutableListOf<MutableList<Int>>()
    val b = mutableListOf<MutableList<Int>>()
    repeat(n) { a.add(readInts()) }
    repeat(n) { b.add(readInts()) }

    var res1 = true
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (b[i][j] != a[i][j] && a[i][j] == 1) {
                res1 = false
            }
        }
    }

    var res2 = true
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (b[i][j] != a[n - 1 - j][i] && a[n - 1 - j][i] == 1) {
                res2 = false
            }
        }
    }

    var res3 = true
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (b[i][j] != a[n - 1 - i][n - 1 - j] && a[n - 1 - i][n - 1 - j] == 1) {
                res3 = false
            }
        }
    }

    var res4 = true
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (b[i][j] != a[n - 1 - (n - 1 - j)][n - 1 - i] && a[n - 1 - (n - 1 - j)][n - 1 - i] == 1) {
                res4 = false
            }
        }
    }

    if (res1 || res2 || res3 || res4) {
        println("Yes")
    } else {
        println("No")
    }
}

fun solveABC298A() {
    val n = readInt()
    val s = readString()

    val set = mutableSetOf<Char>()
    for (si in s) {
        set.add(si)
    }

    if (set.contains('o') && !set.contains('x')) {
        println("Yes")
    } else {
        println("No")
    }
}