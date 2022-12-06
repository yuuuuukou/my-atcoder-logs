private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC159B()
}

fun solveABC159B() {
    val s = readString()

    if (s == s.reversed()) {
        // ok
    } else {
        println("No")
        return
    }

    val sLeft = s.substring(0..((s.length - 1 / 2)) - 1)
    if (sLeft == sLeft.reversed()) {
        // ok
    } else {
        println("No")
        return
    }

    val sRight = s.substring((s.length + 3) / 2 - 1..s.length - 1)
    if (sRight == sRight.reversed()) {
        // ok
    } else {
        println("No")
        return
    }

    println("Yes")
}

fun solveABC159A() {
    val (n, m) = readLongs()

    println(n * (n - 1) / 2 + m * (m - 1) / 2)
}