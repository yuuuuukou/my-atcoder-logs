private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC115A()
}

fun solveABC115A() {
    val d = readInt()
    if (d == 25) {
        println("Christmas")
    } else if (d == 24) {
        println("Christmas Eve")
    } else if (d == 23) {
        println("Christmas Eve Eve")
    } else if (d == 22) {
        println("Christmas Eve Eve Eve")
    }
}