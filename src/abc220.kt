import kotlin.math.pow

private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC220B()
}

fun solveABC220B() {
    val k = readInt()
    val (a, b) = readStrings()

    var a10 = 0L
    for ((aOmomi, i) in (a.lastIndex downTo 0).withIndex()) {
        val num = a[i].toString().toInt()
        a10 += num * k.toDouble().pow(aOmomi.toDouble()).toLong()
    }

    var b10 = 0L
    for ((bOmomi, i) in (b.lastIndex downTo 0).withIndex()) {
        val num = b[i].toString().toInt()
        b10 += num * k.toDouble().pow(bOmomi.toDouble()).toLong()
    }

    println(a10 * b10)
}

fun solveABC220A() {
    val (a, b, c) = readInts()
    var res = -1
    for (i in a..b) {
        if (i % c == 0) {
            res = i
            break
        }
    }
    println(res)
}