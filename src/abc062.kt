private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC062A()
}

fun solveABC062A() {
    val xy = readInts()

    val group1 = listOf(1, 3, 5, 7, 8, 10, 12)
    val group2 = listOf(4, 6, 9, 11)
    val group3 = listOf(2)

    if (group1.containsAll(xy) || group2.containsAll(xy) || group3.containsAll(xy)) {
        println("Yes")
    } else {
        println("No")
    }
}