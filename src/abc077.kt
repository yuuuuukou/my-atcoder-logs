import kotlin.math.absoluteValue

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC077A()
}

fun solveABC077A() {
    val c1 = readLn()
    val c2 = readLn()

    if (c1[0] == c2[2] && c1[1] == c2[1] && c1[2] == c2[0]) {
        println("YES")
    } else {
        println("NO")
    }
}