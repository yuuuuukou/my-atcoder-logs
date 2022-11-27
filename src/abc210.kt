private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC210B()
}

fun solveABC210B() {
    val n = readInt()
    val s = readString()
    if (s.indexOf("1") % 2 == 0) {
        println("Takahashi")
    } else {
        println("Aoki")
    }
}

fun solveABC210A() {
    val (n, a, x, y) = readInts()
    if (n > a) {
        println(a * x + (n - a) * y)
    } else {
        println(n * x)
    }
}