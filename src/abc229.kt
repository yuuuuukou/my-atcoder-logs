import kotlin.math.max

private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readString().toDouble()
private fun readDoubles() = readString().split(" ").map { it.toDouble() }.toMutableList()
private fun readBigDecimal() = readString().toBigDecimal()
private fun readBigDecimals() = readString().split(" ").map { it.toBigDecimal() }.toMutableList()

fun main(args: Array<String>) {
    solveABC229B()
}

fun solveABC229B() {
    val (a, b) = readStrings()

    var isHard = false
    for (i in 0 until max(a.length, b.length)) {
        if (i < a.length && i < b.length) {
            val ai = a[a.length - 1 - i].toString().toInt()
            val bi = b[b.length - 1 - i].toString().toInt()
            if (ai + bi >= 10) {
                isHard = true
            }
        }
    }

    println(if (isHard) "Hard" else "Easy")
}

fun solveABC229A() {
    val s1 = readString()
    val s2 = readString()
    if (s1 == ".#" && s2 == "#." || s1 == "#." && s2 == ".#") {
        println("No")
    } else {
        println("Yes")
    }
}