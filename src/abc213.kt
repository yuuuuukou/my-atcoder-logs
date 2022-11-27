private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC213B()
}

fun solveABC213B() {
    val n = readInt()
    val a = readInts()
    val aSortedDesc = a.sortedDescending()

    for ((i, ai) in a.withIndex()) {
        if (aSortedDesc[1] == ai) {
            println(i + 1)
            return
        }
    }
}

fun solveABC213A() {
    val (a, b) = readInts()
    print(a xor b)
}