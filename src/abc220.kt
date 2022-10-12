private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC220A()
}

fun solveABC220A() {
    val (a, b, c) = readInts()
    var res = -1
    for (i in a..b) {
        if (i % c == 0) {
            res = i
            break
        }
    }
    println(res)
}