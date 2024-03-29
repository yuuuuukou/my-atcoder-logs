private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC100C()
}

fun solveABC100C() {
    val n = readInt()
    val a = readInts()

    var cnt = 0
    for (ai in a) {
        if (ai%2 != 0) continue

        var tmp = ai
        while (tmp % 2 == 0) {
            tmp /= 2
            cnt++
        }
    }
    println(cnt)
}

fun solveABC100B() {
    val (d, n) = readInts()

    var counter = 0
    when (d) {
        0 -> counter = 1
        1 -> counter = 100
        2 -> counter = 10000
    }

    when (n) {
        100 -> println(counter * n + counter)
        else -> println(counter * n)
    }
}

fun solveABC100A() {
    val (a, b) = readInts()
    if (a <= 8 && b <= 8) {
        println("Yay!")
    } else {
        println(":(")
    }
}