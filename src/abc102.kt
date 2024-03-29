private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC102A()
}

fun solveABC102B() {
    /*val n = */readLine()!!
    val a = readLine()!!.split(" ").map { it.toInt() }

    print(a.max()!! - a.min()!!)
}

fun solveABC102A() {
    val n = readInt()
    if (n % 2 != 0) {
        println(n * 2)
    } else {
        println(n)
    }
}