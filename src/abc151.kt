private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC151B()
}

fun solveABC151B() {
    val (n, k, m) = readInts()
    val a = readInts()
    val aSum = a.sum()

    for (i in 0..k) {
        if ((aSum + i) / n >= m) {
            println(i)
            return
        }
    }

    println("-1")
}

fun solveABC151A() {
    val c = readLn()
    for (ci in c) {
        val next = ci + 1
        println(next.toString())
    }
}