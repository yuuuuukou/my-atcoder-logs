import kotlin.math.min

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC094A()
}

fun solveABC094B() {
    // n: 0..のマスがある
    //    0 or n へ到達でゴール
    // m: i = 1..m は移動時に1コスト発生
    // x: 始点マス
    // a: am 料金所
    val (_, _, x) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }

    var toZeroCost = 0
    var toNCost = 0
    for (ai in a) {
        if (ai < x) {
            toZeroCost++
        } else {
            toNCost++
        }
    }

    println(min(toZeroCost, toNCost))
}

fun solveABC094A() {
    val (a, b, x) = readInts()

    if (a + b >= x && a <= x) {
        println("YES")
    } else {
        println("NO")
    }
}