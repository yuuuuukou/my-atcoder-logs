import kotlin.math.absoluteValue
import kotlin.math.min

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

fun main(args: Array<String>) {
    solveABC212C()
}

fun solveABC212C() {
    val (n, m) = readInts()
    val a = readInts().distinct().sorted()
    val b = readInts().distinct().sorted()

    var res = Int.MAX_VALUE
    var aIndex = 0
    var bIndex = 0
    while (aIndex <= a.lastIndex) {
        if (aIndex > a.lastIndex || bIndex > b.lastIndex) break
        while (bIndex <= b.lastIndex) {
            if (aIndex > a.lastIndex) break
            res = min(res, (a[aIndex] - b[bIndex]).absoluteValue)

            if (a[aIndex] <= b[bIndex]) {
                // aiがbi以下であれば、昇順ソートしていてbi側のループをこれ以上回しても意味がないのでaiを進める
                aIndex++
            } else {
                bIndex++
            }
        }
    }

    println(res)
}

fun solveABC212B() {
    val xxxx = readLine()!!

    if (xxxx[0] == xxxx[1]
        && xxxx[0] == xxxx[2]
        && xxxx[0] == xxxx[3]
    ) {
        println("Weak")
    } else if (isNextNumber(xxxx[0].toString().toInt(), xxxx[1].toString().toInt())
        && isNextNumber(xxxx[1].toString().toInt(), xxxx[2].toString().toInt())
        && isNextNumber(xxxx[2].toString().toInt(), xxxx[3].toString().toInt())
    ) {
        println("Weak")
    } else {
        println("Strong")
    }
}

fun isNextNumber(xi: Int, xj: Int): Boolean {
    return if (xi == 9) {
        xj == 0
    } else {
        (xi + 1) == xj
    }
}

fun solveABC212A() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    when {
        a > 0 && b == 0 -> {
            println("Gold")
        }
        a == 0 && b > 0 -> {
            println("Silver")
        }
        a > 0 && b > 0 -> {
            println("Alloy")
        }
        else -> {
        }
    }
}
