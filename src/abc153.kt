private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC153B()
}

fun solveABC153B() {
    val (h,n) = readInts()
    val a = readInts()

    if (h <= a.sum()) {
        println("Yes")
    } else {
        println("No")
    }
}

fun solveABC153A() {
    val (h, a) = readInts()
    if (h % a == 0) {
        println(h / a)
    } else {
        println(h / a + 1)
    }
}