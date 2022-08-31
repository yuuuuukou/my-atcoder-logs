private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC073A()
}

fun solveABC073A() {
    val n = readLn()

    for (ni in n) {
        if (ni.toString() == "9") {
            println("Yes")
            return
        }
    }
    println("No")
}
