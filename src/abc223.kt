private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC223A()
}

fun solveABC223A() {
    val x = readInt()
    if (x == 0) {
        println("No")
    } else {
        if (x % 100 == 0) {
            println("Yes")
        } else {
            println("No")
        }
    }
}