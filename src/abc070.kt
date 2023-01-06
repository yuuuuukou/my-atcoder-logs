private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC070B()
}

fun solveABC070B() {
    val (a, b, c, d) = readInts()

    var cnt = 0
    for (i in 0..100) {
        if (i in a..b && i in c..d) {
            cnt++
        }
    }

    println(if (cnt > 0) cnt - 1 else cnt)
}

fun solveABC070A() {
    val n = readLn()
    if (n[0] == n[2]) {
        println("Yes")
    } else {
        println("No")
    }
}