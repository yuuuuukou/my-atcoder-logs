private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC156B()
}

fun solveABC156C() {
    /*val n = */readLine()!!.toInt()
    val xList = readLine()!!.split(" ").map { it.toInt() }

    var min = Int.MAX_VALUE

    for (p in 1..100) {
        var sum = 0
        for (x in xList) {
            sum += (x - p) * (x - p)
        }
        if (sum < min) {
            min = sum
        }
    }

    print(min)
}

fun solveABC156B() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    println(n.toString(k).length)
}

fun solveABC156A() {
    val (n, r) = readInts()
    if (n >= 10) {
        println(r)
    } else {
        println(r + 100 * (10 - n))
    }
}
