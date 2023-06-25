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
    solveABC296C()
}

fun solveABC296C() {
    val (n, x) = readInts()
    val a = readInts()

    /**
     * ref: https://webbibouroku.com/Blog/Article/cs-lowerbound-upperbound
     */
    fun lowerBound(list: List<Int>, value: Int): Int {
        var left = 0
        var right = list.lastIndex
        while (left <= right) {
            val mid = (left + right) / 2
            if (list[mid] < value) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return left
    }

    a.sort()
    for (i in 0 until n) {
        val aj =  a[i] - x
        if (a.binarySearch(aj) >= 0) {
            println("Yes")
            return
        }
    }

    println("No")
}

fun solveABC296B() {
    val s = mutableListOf<String>()
    repeat(8) {
        val si = readString()
        s.add(si)
    }

    for (i in 0 until 8) {
        for (j in 0 until 8) {
            if (s[i][j] == '*') {
                val jj = when (j) {
                    0 -> "a"
                    1 -> "b"
                    2 -> "c"
                    3 -> "d"
                    4 -> "e"
                    5 -> "f"
                    6 -> "g"
                    7 -> "h"
                    else -> ""
                }
                val ii = when (i) {
                    0 -> "8"
                    1 -> "7"
                    2 -> "6"
                    3 -> "5"
                    4 -> "4"
                    5 -> "3"
                    6 -> "2"
                    7 -> "1"
                    else -> ""
                }
                println("$jj$ii")
            }
        }
    }
}

fun solveABC296A() {
    val n = readInt()
    val s = readString()

    var pre = 'N'
    for (si in s) {
        if (si == pre) {
            println("No")
            return
        }

        pre = si
    }

    println("Yes")
}
