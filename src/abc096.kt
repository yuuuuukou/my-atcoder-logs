import kotlin.math.max

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC096B()
}

fun solveABC096B() {
    var (a, b, c) = readInts()
    val k = readInt()

    repeat(k) {
        when (max(max(a, b), c)) {
            a -> a *= 2
            b -> b *= 2
            c -> c *= 2
        }
    }

    println(a + b + c)
}

fun solveABC096A() {
    val (a, b) = readInts()

    if (a <= b) {
        println(a)
    } else {
        println(a - 1)
    }
}