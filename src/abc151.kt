private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC151C()
}

fun solveABC151C() {
    val (n, m) = readInts()

    val waCounts = MutableList(n + 1) { 0 }
    val isSolved = MutableList(n + 1) { 0 }
    var acCounts = MutableList(n + 1) { 0 }
    repeat(m) {
        val (pi, si) = readStrings()

        if (isSolved[pi.toInt()] == 0) {
            when (si) {
                "WA" -> {
                    waCounts[pi.toInt()] += 1
                }
                "AC" -> {
                    acCounts[pi.toInt()] = 1
                    isSolved[pi.toInt()] = 1
                }
            }
        }
    }

    var waCountSum = 0
    for (i in 1 .. n) {
        if (isSolved[i] == 1) {
            waCountSum += waCounts[i]
        }
    }

    println("${acCounts.sum()} $waCountSum")
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