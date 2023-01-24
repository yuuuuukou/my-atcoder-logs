private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC058B()
}

fun solveABC058B() {
    val o = readLn()
    val e = readLn()

    for (i in 0..o.lastIndex) {
        print(o[i])
        if (i <= e.lastIndex) {
            print(e[i])
        }
    }
    println()
}

fun solveABC058A() {
    val (a, b, c) = readInts()

    if (b - a == c - b) {
        println("YES")
    } else {
        println("NO")
    }
}
