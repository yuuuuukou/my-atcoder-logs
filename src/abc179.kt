private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC179A()
}

fun solveABC179A() {
    val s = readString()
    if (s[s.lastIndex].toString() == "s") {
        println("${s}es")
    } else {
        println("${s}s")
    }
}