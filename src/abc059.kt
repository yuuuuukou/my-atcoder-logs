private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC059A()
}

fun solveABC059A() {
    val (s1, s2, s3) = readStrings()
    println("${s1.toUpperCase()[0]}${s2.toUpperCase()[0]}${s3.toUpperCase()[0]}")
}
