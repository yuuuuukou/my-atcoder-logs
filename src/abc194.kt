import kotlin.math.*

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
    solveABC194C()
}

fun solveABC194C() {
    val n = readInt()
    val a = readInts()

    val map = mutableMapOf<Int, Long>().toSortedMap()
    for (ai in a) {
        map[ai] = (map[ai] ?: 0) + 1
    }

    var res = 0L
//    for (item1 in map) {
//        for (item2 in map) {
//            if (item1.key >= item2.key) continue
//
//            res += (item1.key - item2.key) * (item1.key - item2.key) * item1.value * item2.value
//        }
//    }
    for (i in -200..200) {
        for (j in i + 1..200) {
            if (map[i] == null || map[j] == null) continue

            res += (i - j).toLong() * (i - j).toLong() * map[i]!! * map[j]!!
        }
    }

    println(res)
}

fun solveABC194B() {
    val n = readLine()!!.toInt()

    val aList = mutableListOf<Int>()
    val bList = mutableListOf<Int>()

    for (i in 0 until n) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        aList.add(a)
        bList.add(b)
    }

    var minTime = Int.MAX_VALUE
    for (ai in 0 until n) {
        for (bi in 0 until n) {
            val time = if (ai == bi) {
                aList[ai] + bList[bi]
            } else {
                max(aList[ai], bList[bi])
            }

            minTime = min(minTime, time)
        }
    }
    println(minTime)
}

fun solveABC194A() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    if (a + b >= 15 && b >= 8) {
        println("1")
    } else if (a + b >= 10 && b >= 3) {
        println("2")
    } else if (a + b >= 3) {
        println("3")
    } else {
        println("4")
    }
}
