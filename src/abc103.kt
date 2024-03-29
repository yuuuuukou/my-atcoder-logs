import kotlin.math.absoluteValue

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC103B()
}

fun solveABC103B() {
    var s = readLn()
    val t = readLn()

    var res = false
    repeat(s.length) {
        s = s.substring(s.lastIndex) + s.substring(0 until s.lastIndex)

        if (s == t) {
            res = true
        }
    }

    println(if (res) "Yes" else "No")
}

fun solveABC103A() {
    val a = readInts()
    a.sort()
    println((a[0] - a[1]).absoluteValue + (a[1] - a[2]).absoluteValue)
}