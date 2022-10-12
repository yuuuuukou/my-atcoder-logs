private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC225A()
}

fun solveABC225A() {
    val s = readString()
    if (s[0] == s[1] && s[1] == s[2]) {
        println(1)
    } else if (s[0] != s[1] && s[1] != s[2] && s[2] != s[0]) {
        println(6)
    } else {
        println(3)
    }
}