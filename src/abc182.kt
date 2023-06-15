import kotlin.math.pow
import kotlin.math.min

private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC182C()
}

fun solveABC182C() {
    val n = readString()
    val length = n.length

    var min = Int.MAX_VALUE

    val last = 2.0.pow(length.toDouble()).toInt() - 1
    for (i in 0 until last) {
        val bit = i.toString(2).padStart(length, '0')

        var str = ""
        for (j in bit.indices) {
            if (bit[j] == '0') str += n[j]
        }
        if (str.toLong() % 3 == 0L) min = min(min, length - str.length)
    }

    println(if (min == Int.MAX_VALUE) -1 else min)
}

fun solveABC182B() {
    val n = readInt()
    val a = readInts()

    val array = MutableList(1001) { 0 }
    for (i in 2..1000) {
        for (ai in a) {
            if (ai % i == 0) {
                array[i]++
            }
        }
    }

    println(array.indexOf(array.max()))
}

fun solveABC182A() {
    val (a, b) = readInts()
    val followMax = 2 * a + 100
    println(followMax - b)
}