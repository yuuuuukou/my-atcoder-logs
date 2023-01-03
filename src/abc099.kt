private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC099B()
}

fun solveABC099B() {
    val (a, b) = readInts()

    var prev = 0
    for (i in 1..999) {
        if (i == b - a) {
            // i-1, iがそれぞれa, bだけ埋もれずにいる
            println(i + prev - b)
            return
        }

        prev += i
    }
}

fun solveABC099A() {
    val n = readInt()
    println(if (n > 999) "ABD" else "ABC")
}