import kotlin.math.absoluteValue

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC114B()
}

fun solveABC114B() {
    val s = readLn()

    var min = Int.MAX_VALUE
    for (i in 0..s.length - 3) {
        val si = s.substring(i..i + 2).toInt()
        min = kotlin.math.min(min, (753 - si).absoluteValue)
    }

    println(min)
}

fun solveABC114A() {
    val x = readInt()
    if (x == 7 || x == 5 || x == 3) {
        println("YES")
    } else {
        println("NO")
    }
}