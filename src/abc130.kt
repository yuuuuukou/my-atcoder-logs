private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC130B()
}

fun solveABC130B() {
    val (n, x) = readInts()
    val l = readInts()

    var current = 0
    var cnt = 1
    for (li in l) {
        val di = current + li
        if (di <= x) {
            cnt++
        }

        current = di
    }

    println(cnt)
}

fun solveABC130A() {
    val (x, a) = readInts()
    if (x < a) {
        println(0)
    } else {
        println(10)
    }
}