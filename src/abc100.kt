private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC100A()
}

fun solveABC100A() {
    val (a,b) = readInts()
    if (a <= 8 && b <= 8) {
        println("Yay!")
    } else {
        println(":(")
    }
}