import kotlin.math.absoluteValue
import kotlin.math.min

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC123B()
}

fun solveABC123B() {
    val a = readLn()
    val b = readLn()
    val c = readLn()
    val d = readLn()
    val e = readLn()

    var res = 0
    var min = Int.MAX_VALUE

    fun getMin(s: String) {
        if (s[s.lastIndex].toString().toInt() != 0) {
            min = min(min, s[s.lastIndex].toString().toInt())
        }
    }
    getMin(a)
    getMin(b)
    getMin(c)
    getMin(d)
    getMin(e)

    var chooseLastOrder = false

    fun calc(s: String) {
        if (!chooseLastOrder && (s[s.lastIndex].toString().toInt() == min)) {
            chooseLastOrder = true
            res += s.toInt()
        } else {
            var tmp = s.toInt()
            while (tmp % 10 != 0) {
                tmp++
            }
            res += tmp
        }
    }
    calc(a)
    calc(b)
    calc(c)
    calc(d)
    calc(e)

    println(res)
}

fun solveABC123A() {
    val a = readInt()
    val b = readInt()
    val c = readInt()
    val d = readInt()
    val e = readInt()
    val k = readInt()

    if ((a - b).absoluteValue <= k
        && (a - c).absoluteValue <= k
        && (a - d).absoluteValue <= k
        && (a - e).absoluteValue <= k
        && (b - c).absoluteValue <= k
        && (b - d).absoluteValue <= k
        && (b - e).absoluteValue <= k
        && (c - d).absoluteValue <= k
        && (c - e).absoluteValue <= k
        && (d - e).absoluteValue <= k
    ) {
        println("Yay!")
    } else {
        println(":(")
    }
}