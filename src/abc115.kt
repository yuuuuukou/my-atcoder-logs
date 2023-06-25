private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC115C()
}

fun solveABC115C() {
    val (n, k) = readInts()
    val h = mutableListOf<Int>()
    repeat(n) {
        h.add(readInt())
    }
    h.sort()

    val differences = mutableListOf<Int>()
    for (i in 0..h.lastIndex - (k - 1)) {
        differences.add(h[i + (k - 1)] - h[i])
    }
    println(differences.min())
}

fun solveABC115B() {
    val n = readInt()

    var max = 0
    var sum = 0
    repeat(n) {
        val pi = readInt()
        max = kotlin.math.max(max, pi)
        sum += pi
    }
    sum -= (max / 2)

    println(sum)
}

fun solveABC115A() {
    val d = readInt()
    if (d == 25) {
        println("Christmas")
    } else if (d == 24) {
        println("Christmas Eve")
    } else if (d == 23) {
        println("Christmas Eve Eve")
    } else if (d == 22) {
        println("Christmas Eve Eve Eve")
    }
}