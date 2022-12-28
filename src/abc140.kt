private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC140B()
}

fun solveABC140B() {
    val n = readInt()
    val a = readInts()
    val b = readInts()
    val c = readInts()

    var manzoku = 0
    for (i in 0 until n) {
        manzoku += b[a[i] - 1]
        if (i > 0 && a[i - 1] + 1 == a[i]) {
            manzoku += c[a[i] - 1 - 1]
        }
    }
    println(manzoku)
}

fun solveABC140A() {
    val n = readInt()
    println(n * n * n)
}
