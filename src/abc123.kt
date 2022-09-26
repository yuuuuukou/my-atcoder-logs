import kotlin.math.absoluteValue

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC123A()
}

fun solveABC123A() {
    val a = readInt()
    val b = readInt()
    val c = readInt()
    val d = readInt()
    val e = readInt()
    val k = readInt()

    if ((a - b).absoluteValue <= k
        && (a - c).absoluteValue <= k
        && (a - d).absoluteValue <= k
        && (a - e).absoluteValue <= k
        && (b - c).absoluteValue <= k
        && (b - d).absoluteValue <= k
        && (b - e).absoluteValue <= k
        && (c - d).absoluteValue <= k
        && (c - e).absoluteValue <= k
        && (d - e).absoluteValue <= k
    ) {
        println("Yay!")
    } else {
        println(":(")
    }
}