private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC093A()
}

fun solveABC093A() {
    val s = readLn()
    if (s.contains("a") && s.contains("b") && s.contains("c")) {
        println("Yes")
    } else {
        println("No")
    }
}