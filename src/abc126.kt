private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC126A()
}

fun solveABC126A() {
    val (n, k) = readInts()
    val s = readLn()
    if (k == s.length) {
        println(s.substring(0 until k - 1) + s.substring(k - 1..k - 1).toLowerCase())
    } else {
        println(s.substring(0 until k - 1) + s.substring(k - 1..k - 1).toLowerCase() + s.substring(k..s.lastIndex))
    }

}