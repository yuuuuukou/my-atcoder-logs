private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC158A()
}

fun solveABC158A() {
    val s = readLn()

    if (s[0] == s[1] && s[1] == s[2]) {
        println("No")
    } else {
        println("Yes")
    }
}
