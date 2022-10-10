private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC154A()
}

fun solveABC154A() {
    val (s, t) = readStrings()
    val (a, b) = readInts()
    val u = readLn()

    val map = mutableMapOf<String, Int>()
    map[s] = a
    map[t] = b
    map[u] = (map[u] ?: 0) - 1

    println("${map[s]} ${map[t]}")
}