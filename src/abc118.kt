private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC118B()
}

fun solveABC118B() {
    val (n, m) = readInts()

    val tmp = readInts()
    tmp.removeAt(0)
    var set = tmp.toMutableSet()
    repeat(n - 1) {
        val tmpI = readInts()
        tmpI.removeAt(0)
        val ki = tmpI.toMutableSet()
        set = (set intersect ki).toMutableSet()
    }

    println(set.count())
}

fun solveABC118A() {
    val (a, b) = readInts()
    if (b % a == 0) {
        println(a + b)
    } else {
        println(b - a)
    }
}