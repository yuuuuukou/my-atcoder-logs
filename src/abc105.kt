private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC105A()
}

fun solveABC105B() {
    val n = readLine()!!.toInt()

    var can = false
    for (i in 0..((100 / 4) + 1)) {
        for (j in 0..((100 / 7) + 1)) {
            if (n == 4 * i + 7 * j) {
                can = true
            }
        }
    }

    if (can) {
        println("Yes")
    } else {
        println("No")
    }
}

fun solveABC105A() {
    val (n, k) = readInts()
    if (n % k == 0) {
        println(0)
    } else {
        println(1)
    }
}
