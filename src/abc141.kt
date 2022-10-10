private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC141A()
}

fun solveABC141A() {
    val s = readLn()
    if (s == "Sunny") {
        println("Cloudy")
    } else if (s == "Cloudy") {
        println("Rainy")
    } else if (s == "Rainy") {
        println("Sunny")
    }
}
