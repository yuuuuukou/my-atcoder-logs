private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC164B()
}

fun solveABC164B() {
    var (a, b, c, d) = readInts()

    while (a > 0 || c > 0) {
        c -= b
        if (c <= 0) {
            println("Yes")
            return
        }

        a -= d
        if (a <= 0) {
            println("No")
            return
        }
    }
}

fun solveABC164A() {
    val (s, w) = readInts()
    if (s <= w) {
        println("unsafe")
    } else {
        println("safe")
    }
}