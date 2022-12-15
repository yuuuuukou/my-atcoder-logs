private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC117B()
}

fun solveABC117B() {
    val n = readInt()
    val l = readInts()

    var lMax = l.max() ?: 0
    var lMaxIndex = 0
    for ((i, li) in l.withIndex()) {
        if (li == lMax) {
            lMaxIndex = i
            break
        }
    }

    var otherSum = 0
    for (i in 0 until n) {
        if (i != lMaxIndex) {
            otherSum += l[i]
        }
    }

    if (lMax < otherSum) {
        println("Yes")
    } else {
        println("No")
    }
}

fun solveABC117A() {
    val (t, x) = readDoubles()
    println(t / x)
}