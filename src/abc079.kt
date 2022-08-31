private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC079A()
}

fun solveABC079A() {
    val n = readLn()
    if (n[0] == n[1] && n[1] == n[2] || n[1] == n[2] && n[2] == n[3]) {
        println("Yes")
    } else {
        println("No")
    }
}