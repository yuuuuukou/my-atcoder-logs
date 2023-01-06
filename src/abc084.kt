private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC084B()
}

fun solveABC084B() {
    val (a, b) = readInts()
    val s = readLn()

    if (s.length != a + b + 1) {
        println("No")
        return
    }
    for ((i, si) in s.withIndex()) {
        if (i == a) {
            if (si == '-') {
                // ok
            } else {
                // ng
                println("No")
                return
            }
        } else {
            if (si in '0' .. '9') {
                // ok
            } else {
                // ng
                println("No")
                return
            }
        }
    }

    println("Yes")
}

fun solveABC084A() {
    val m = readInt()

    println(24 + 24 - m)
}
