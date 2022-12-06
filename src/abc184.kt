import kotlin.math.max

private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC184B()
}

fun solveABC184B() {
    var (n, x) = readInts()
    val s = readString()

    for (si in s) {
        if (si.toString() == "o") {
            x++
        } else {
            x = max(0, x - 1)
        }
    }

    println(x)
}

fun solveABC184A() {
    val (a, b) = readInts()
    val (c, d) = readInts()
    println(a * d - b * c)
}