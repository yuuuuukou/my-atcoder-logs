import java.math.BigDecimal
import kotlin.math.absoluteValue
import kotlin.math.max
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
    solveABC135A()
}

fun solveABC135A() {
    val (a, b) = readInts()
    val from = min(a, b)
    val to = max(a, b)

    var ans: Int? = null
    for (k in from..to) {
        if ((a - k).absoluteValue == (b - k).absoluteValue) {
            ans = k
        }
    }

    if (ans == null) {
        println("IMPOSSIBLE")
    } else {
        println(ans)
    }
}