import kotlin.math.absoluteValue

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC074A()
}

fun solveABC074B() {
    /* val n = */readLine()!!.toInt()
    val k = readLine()!!.toInt()
    val x = readLine()!!.split(" ").map { it.toInt() }

    var sum = 0
    for (xi in x) {
        sum += if ((k - xi).absoluteValue < (0 - xi).absoluteValue) {
            2 * (k - xi)
        } else {
            2 * xi
        }
    }
    println(sum)
}

fun solveABC074A() {
    val n = readInt()
    val a = readInt()
    println(n * n - a)
}
