import kotlin.math.absoluteValue
import kotlin.math.max
import kotlin.math.min

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
    solveABC305C()
}

fun solveABC305C() {
    val (h, w) = readInts()

    val s = mutableListOf<String>()
    repeat(h) {
        s.add(readString())
    }

    var left = Int.MAX_VALUE
    var right = Int.MIN_VALUE
    var top = Int.MAX_VALUE
    var buttom = Int.MIN_VALUE
    for (i in 0 until h) {
        for (j in 0 until w) {
            if (s[i][j] == '#') {
                left = min(left, j)
                right = max(right, j)
                top = min(top, i)
                buttom = max(buttom, i)
            }
        }
    }

    for (i in top..buttom) {
        for (j in left..right) {
            if (s[i][j] === '.') {
                println("${i + 1} ${j + 1}")
                return
            }
        }
    }
}

fun solveABC305B() {
    val (p, q) = readStrings()
    val pp = when (p) {
        "A" -> 0
        "B" -> 1
        "C" -> 2
        "D" -> 3
        "E" -> 4
        "F" -> 5
        "G" -> 6
        else -> 0
    }
    val qq = when (q) {
        "A" -> 0
        "B" -> 1
        "C" -> 2
        "D" -> 3
        "E" -> 4
        "F" -> 5
        "G" -> 6
        else -> 0
    }

    val list = arrayOf(0, 3, 1, 4, 1, 5, 9)
    val sumList = mutableListOf<Int>()
    for (item in list) {
        if (sumList.isEmpty()) {
            sumList.add(item)
        } else {
            sumList.add(sumList[sumList.lastIndex] + item)
        }
    }

    println((sumList[qq] - sumList[pp]).absoluteValue)
}

fun solveABC305A() {
    val n = readInt()

    when (n % 5) {
        0 -> println(n)
        1 -> println(n - 1)
        2 -> println(n - 2)
        3 -> println(n + 2)
        4 -> println(n + 1)
    }
}