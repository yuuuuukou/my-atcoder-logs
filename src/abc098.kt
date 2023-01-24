import kotlin.math.max

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC098B()
}

fun solveABC098B() {
    val n = readInt()
    val s = readLn()

    var res = 0

    for (i in 0 until n) {
        val s1 = s.substring(0..i)
        val s2 = s.substring(i + 1..s.lastIndex)

        var cnt = 0
        for (c in 'a'..'z') {
            if (s1.contains(c) && s2.contains(c)) {
                cnt++
            }
        }
        res = max(res, cnt)
    }

    println(res)
}

fun solveABC098A() {
    val (a, b) = readInts()
    println(max(max(a + b, a - b), a * b))
}