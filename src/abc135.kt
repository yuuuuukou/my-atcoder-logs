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
    solveABC135C()
}

fun solveABC135C() {
    val n = readInt()
    val a = readInts()
    val b = readInts()

    var sum = 0L
    for (i in 0 until n) {
        sum += min(a[i], b[i])
        if (a[i] < b[i]) {
            sum += min(b[i] - a[i], a[i + 1])
            a[i + 1] -= min(b[i] - a[i], a[i + 1])
        }
    }

    println(sum)
}

fun solveABC135B() {
    val n = readInt()
    val p = readInts()
    val p2 = p.sorted()

    for (i in 0 until n) {
        for (j in 0 until n) {
            val p3 = p.toMutableList()
            val tmp = p3[i]
            p3[i] = p3[j]
            p3[j] = tmp
            if (p2 == p3) {
                println("YES")
                return
            }
        }
    }

    println("NO")
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