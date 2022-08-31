private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC072A()
}

fun solveABC072B() {
    val s = readLine()!!

    var result = ""
    for (i in s.indices) {
        val no = i + 1
        if (no % 2 == 0) {
            continue
        } else {
            result += s[i]
        }
    }

    println(result)
}

fun solveABC072A() {
    val (x, t) = readInts()
    if (x - t < 0) {
        println(0)
    } else {
        println(x - t)
    }

}