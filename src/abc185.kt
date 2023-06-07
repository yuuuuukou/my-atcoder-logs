import java.math.BigDecimal
import kotlin.math.min
import kotlin.system.exitProcess

private val reader = System.`in`.bufferedReader()
private fun readString() = reader.readLine()
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readString().toDouble()
private fun readDoubles() = readString().split(" ").map { it.toDouble() }.toMutableList()
private fun readBigDecimal() = readString().toBigDecimal()
private fun readBigDecimals() = readString().split(" ").map { it.toBigDecimal() }.toMutableList()

fun main() {
    solveABC185C()
}

fun solveABC185C() {
    val l = readBigDecimal()
    // l - 1 から 11個選ぶ選び方？
    // 2^63未満・・・Longにおさまる？

    // 12! / ( 11! * (12-11)! ) = 12
    // 16! / ( 11! * (16-11)! ) =

    fun factorial(num: BigDecimal): BigDecimal {
        if (num <= 1.toBigDecimal()) {
            return 1.toBigDecimal()
        }

        return num * factorial(num - 1.toBigDecimal())
    }

    val res =
        factorial(l - 1.toBigDecimal()) /
                (factorial(11.toBigDecimal()) * factorial(l - 1.toBigDecimal() - 11.toBigDecimal()))

    println(res)
}

fun solveABC185B() {
    // N: バッテリー容量 n + 0.5ごとに1減少or増加
    // M: カフェを訪れる回数
    // T: 帰宅時刻
    // A: カフェfrom
    // B: カフェto
    val (n, m, t) = readLine()!!.split(" ").map { it.toInt() }

    var current = n
    var lastTime = 0

    for (i in 0..m) {
        val (a, b) = if (i == m) {
            // ループの最後は帰宅時刻まで引っ張る
            listOf(t, t)
        } else {
            readLine()!!.split(" ").map { it.toInt() }
        }

        // current->aまで減算
        current -= (a - lastTime)
        if (current <= 0) {
            print("No")
            exitProcess(0)
        }

        // b->aまで分を加算(nが上限)
        current = min(n, current + b - a)

        lastTime = b
    }

    print("Yes")
}

fun solveABC185A() {
    val a = readLine()!!.split(" ").map { it.toInt() }
    println(a.min())
}