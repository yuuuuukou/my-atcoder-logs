import kotlin.math.absoluteValue

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC065B()
}

fun solveABC065B() {
    val n = readInt()
    val a = mutableListOf<Int>()
    repeat(n) {
        a.add(readInt())
    }

    var cnt = 0
    var current = 0
    val seen = mutableMapOf<Int, Int>()
    while (true) {
        cnt++
        val next = a[current] - 1
        if (next == 1) {
            println(cnt)
            return
        }
        if (seen.contains(next)) {
            println(-1)
            return
        }

        seen[current] = 1
        current = next
    }
}

fun solveABC065A() {
    val (x, a, b) = readInts()

    val taste = a - b

    if (taste >= 0) {
        println("delicious")
    } else if (taste.absoluteValue <= x) {
        println("safe")
    } else {
        println("dangerous")
    }
}