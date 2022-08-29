private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC060A()
}

fun solveABC060A() {
    val (a, b, c) = readStrings()

    if (a[a.lastIndex] == b[0] && b[b.lastIndex] == c[0]) {
        println("YES")
    } else {
        println("NO")
    }
}