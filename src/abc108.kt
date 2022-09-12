private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC108A()
}

fun solveABC108A() {
    val k = MutableList(readInt()) { index -> index }
    val even = k.count { it % 2 == 0 }
    val odd = k.count { it % 2 != 0 }
    println(even * odd)
}