private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC144A()
}

fun solveABC144B() {
    val n = readLine()!!.toInt()

    var result = "No"
    for (i in 1..9) {
        for (j in 1..9) {
            if (i * j == n) {
                result = "Yes"
            }
        }
    }

    println(result)
}

fun solveABC144A() {
    val (a, b) = readInts()
    if (a <= 9 && b <= 9) {
        println(a * b)
    } else {
        println(-1)
    }
}