private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC125B()
}

fun solveABC125B() {
    val n = readInt()
    val v = readInts()
    val c = readInts()

    var sum = 0
    for (i in 0 until n) {
        if (v[i] > c[i]) {
            sum += v[i] - c[i]
        }
    }

    println(sum)
}

fun solveABC125A() {
    val (a, b, t) = readInts()
    println(t / a * b)
}