import kotlin.math.max
import kotlin.math.min

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC120C()
}

fun solveABC120C() {
    val s = readLn()
    val left = s.substring(0..s.length / 2 - 1)
    val right = s.substring(s.length / 2..s.lastIndex)

    val leftZero = left.count { it == '0' }
    val leftOne = left.count { it == '1' }
    val rightZero = right.count { it == '0' }
    val rightOne = right.count { it == '1' }

    println((min(leftZero, rightOne) + min(leftOne, rightZero)) * 2)
}

fun solveABC120B() {
    val (a, b, k) = readLine()!!.split(" ").map { it.toInt() }

    val list = mutableListOf<Int>()
    for (i in 1..max(a, b)) {
        if (a % i == 0 && b % i == 0) {
            list.add(i)
        }
    }
    println(list.reversed()[k - 1])
}

fun solveABC120A() {
    val (a, b, c) = readInts()
    println(min(b / a, c))
}
