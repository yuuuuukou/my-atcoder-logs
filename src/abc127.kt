private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC127A()
}

fun solveABC127A() {
    val (a, b) = readInts()
    when (a) {
        in 0..5 -> {
            println(0)
        }
        in 6..12 -> {
            println(b / 2)
        }
        else -> {
            println(b)
        }
    }
}