private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC056A()
}

fun solveABC056A() {
    val (a, b) = readStrings()

    if (a == "H") {
        println(b)
    } else {
        if (b == "H") {
            println("D")
        } else {
            println("H")
        }
    }
}