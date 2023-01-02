import kotlin.math.absoluteValue

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC131B()
}

fun solveABC131B() {
    val (n, l) = readInts()
    val tastes = MutableList(n + 1) { l + it - 1 }
    tastes.removeAt(0)

    var min = Int.MAX_VALUE
    for (taste in tastes) {
        min = kotlin.math.min(taste.absoluteValue, min)
    }

    var sum = 0
    for (taste in tastes) {
        if (taste.absoluteValue == min) {
            continue
        }
        sum += taste
    }

    println(sum)
}

fun solveABC131A() {
    val s = readLn()
    if (s[0] == s[1] || s[1] == s[2] || s[2] == s[3]) {
        println("Bad")
    } else {
        println("Good")
    }
}