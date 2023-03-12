private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC164C()
}

fun solveABC164C() {
    val n = readInt()

    val set = mutableSetOf<String>()
    repeat(n) {
        set.add(readString())
    }

    println(set.count())
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