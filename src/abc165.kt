private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC165A()
}

fun solveABC165A() {
    val k = readInt()
    val (a, b) = readInts()

    var ok = false
    for (i in a..b) {
        if (i % k == 0) {
            ok = true
            break
        }
    }

    println(if (ok) "OK" else "NG")
}