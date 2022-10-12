private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC218A()
}

fun solveABC218A() {
    val n = readInt()
    val s = readString()
    if (s[n - 1].toString() == "o") {
        println("Yes")
    } else {
        println("No")
    }
}