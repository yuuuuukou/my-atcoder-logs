private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC055B()
}

fun solveABC055B() {
    val n = readInt()

    var res = 1L
    for (i in 1..n) {
        res *= i
        res %= 1000000007
    }

    println(res)
}

fun solveABC055A() {
    val n = readInt()

    println(800 * n - (n / 15) * 200)
}