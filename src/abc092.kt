import kotlin.math.min

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC092B()
}

fun solveABC092B() {
    val n = readInt()
    val (d, x) = readInts()

    var cnt = 0
    repeat(n) {
        val ai = readInt()

        var next = 1
        while (next <= d) {
            cnt++

            next += ai
        }
    }

    println(cnt + x)
}

fun solveABC092A() {
    val a = readInt()
    val b = readInt()
    val c = readInt()
    val d = readInt()
    println(min(a, b) + min(c, d))
}