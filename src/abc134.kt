private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC134C()
}

fun solveABC134C() {
    val n = readInt()
    val a = mutableListOf<Int>()
    repeat(n) {
        val ai = readInt()
        a.add(ai)
    }

    val aSorted = a.toList().sortedDescending()
    val max = aSorted[0]
    val next = aSorted[1]

    for (ai in a) {
        if (ai == max) {
            if (max == next) {
                println(max)
            } else {
                println(next)
            }
        } else {
            println(max)
        }
    }
}

fun solveABC134B() {
    val (n, d) = readInts()

    // 一人が監視可能な数
    val num = d * 2 + 1

    if (n % num == 0) {
        println(n / num)
    } else {
        println(n / num + 1)
    }
}

fun solveABC134A() {
    val r = readInt()

    println(3 * r * r)
}