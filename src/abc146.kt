private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC146A()
}

fun solveABC146A() {
    when (readLn()) {
        "SUN" -> println(7)
        "MON" -> println(6)
        "TUE" -> println(5)
        "WED" -> println(4)
        "THU" -> println(3)
        "FRI" -> println(2)
        "SAT" -> println(1)
    }
}
