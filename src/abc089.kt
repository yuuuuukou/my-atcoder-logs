private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC089B()
}

fun solveABC089B() {
    val n = readInt()
    val s = readStrings()

    val map = mutableMapOf<String, Int>()
    for (si in s) {
        map[si] = 1
    }

    when (map.count()) {
        3 -> println("Three")
        4 -> println("Four")
    }
}

fun solveABC089A() {
    var n = readInt()
    var ans = 0
    while (n >= 3) {
        ans++
        n -= 3
    }
    println(ans)
}
