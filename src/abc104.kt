private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC104A()
}

fun solveABC104A() {
    val r = readInt()
    if (r < 1200) {
        println("ABC")
    } else if (r < 2800) {
        println("ARC")
    } else {
        println("AGC")
    }
}