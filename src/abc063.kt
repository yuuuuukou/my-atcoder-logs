private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC063B()
}

fun solveABC063B() {
    val s = readLn()

    val map = mutableMapOf<Char, Int>()
    for (si in s) {
        map[si] = 1
    }

    if (s.length == map.count()) {
        println("yes")
    } else {
        println("no")
    }
}

fun solveABC063A() {
    val (a, b) = readInts()

    if (a + b >= 10) {
        println("error")
    } else {
        println(a + b)
    }
}