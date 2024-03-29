private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC069A()
}

fun solveABC069B() {
    val s = readLine()!!

    println("${s[0]}${s.length - 2}${s[s.length - 1]}")
}

fun solveABC069A() {
    val (n, m) = readInts()
    println((n - 1) * (m - 1))
}