private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC109A()
}

fun solveABC109A() {
    val (a, b) = readInts()
    if ((a * b * 1) % 2 == 1 || (a * b * 2) % 2 == 1 || (a * b * 3) % 2 == 1) {
        println("Yes")
    } else {
        println("No")
    }
}