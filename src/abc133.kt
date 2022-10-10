import java.math.BigDecimal
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
    solveABC133A()
}

fun solveABC133B() {
    val (n, d) = readLine()!!.split(" ").map { it.toInt() }

    val x = mutableListOf<List<Int>>()
    for (i in 0 until n) {
        val xi = readLine()!!.split(" ").map { it.toInt() }
        x.add(xi)
    }

    var cnt = 0
    for (i in 0 until n) {
        for (j in (i + 1) until n) {
            // √の中身
            var sum: BigDecimal = (0).toBigDecimal()
            for (k in 0 until d) {
                val tmp = (x[i][k] - x[j][k]).toBigDecimal().pow(2)
                sum += tmp
            }

            // sumまでの間に2乗(k*k)してsumになるkがあれば、平方根が整数になるのでそれを判定
            var flag = false
            for (k in 0..sum.toInt()) {
                if (k * k == sum.toInt()) {
                    flag = true
                    break
                }
            }
            if (flag) cnt++
        }
    }

    println(cnt)
}

fun solveABC133A() {
    val (n, a, b) = readInts()
    println(min(n * a, b))
}
