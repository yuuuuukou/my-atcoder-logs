private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC142A()
}

fun solveABC142C() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }

    val map = mutableMapOf<Int, Int>()

    for ((i, ai) in a.withIndex()) {
        // i+1さん は ai番目
        map[ai] = i + 1
    }

    for (i in 1..n) {
        if (i == n) {
            print("${map[i]}")
        } else {
            print("${map[i]} ")
        }
    }
}

fun solveABC142B() {
    val (n, k) = readInts()
    val h = readInts()

    var cnt = 0
    for (hi in h) {
        if (hi >= k) {
            cnt++
        }
    }

    println(cnt)
}

fun solveABC142A() {
    val n = readDouble()
    val odd = (n.toInt() + 1) / 2
    println(odd / n)
}