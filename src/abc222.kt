private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC222B()
}

fun solveABC222B() {
    val (n, p) = readInts()
    val a = readInts()

    var res = 0
    for (ai in a) {
        if (ai < p) {
            res++
        }
    }

    println(res)
}

fun solveABC222A() {
    val n = readString()
    println(n.padStart(4, '0'))
}