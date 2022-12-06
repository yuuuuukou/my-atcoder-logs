import kotlin.math.max

private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC179B()
}

fun solveABC179B() {
    val n = readInt()

    var zoroCnt = 0
    var zoroCntMax = 0
    repeat(n) {
        val (di1, di2) = readInts()
        if (di1 == di2) {
            zoroCnt++
            zoroCntMax = max(zoroCntMax, zoroCnt)
        } else {
            zoroCnt = 0
        }
    }

    println(if (zoroCntMax >= 3) "Yes" else "No")
}

fun solveABC179A() {
    val s = readString()
    if (s[s.lastIndex].toString() == "s") {
        println("${s}es")
    } else {
        println("${s}s")
    }
}