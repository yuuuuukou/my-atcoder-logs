private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC106A()
}

fun solveABC106B() {
    val n = readLine()!!.toInt()

    var res = 0
    for (i in 1..n) {
        if (i % 2 != 0) {
            var cnt = 0
            for (j in 1..i) {
                if (i % j == 0) {
                    cnt++
                }
            }
            if (cnt == 8) {
                res++
            }
        }
    }
    println(res)
}

fun solveABC106A() {
    val (a, b) = readInts()
    println(a * b - a - b + 1)
}