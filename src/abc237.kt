import kotlin.math.pow

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
    solveABC237C()
}

fun solveABC237C() {
    var s = readString()

    var prefixACount = 0
    for (i in s.indices) {
        if (s[i] == 'a') {
            prefixACount++
        } else {
            break
        }
    }

    var suffixACount = 0
    for (i in s.lastIndex downTo 0) {
        if (s[i] == 'a') {
            suffixACount++
        } else {
            break
        }
    }

    if (prefixACount == suffixACount) {
        // そのまま回文判定する
    } else if (prefixACount < suffixACount) {
        // 先頭のaが不足、いくらでも足せるので末尾のaは無いものとして考える
        s = s.reversed().removeRange(0 until (suffixACount - prefixACount))
    } else {
        // 末尾のaが不足、無理
        println("No")
        return
    }

    var ok = true
    for (i in s.indices) {
        if (s[i] == s[s.lastIndex - i]) {
            // ok
        } else {
            // ng
            ok = false
        }
    }

    println(if (ok) "Yes" else "No")
}

fun solveABC237B() {
    val (h, w) = readInts()
    val a = mutableListOf<MutableList<Int>>()
    for (row in 0 until h) {
        val ai = readInts()
        a.add(ai)
    }

    // var res = StringBuilder()
    for (i in 0 until w) {
        for (j in 0 until h) {
            // res.append("${a[j][i]} ")
            print("${a[j][i]} ")
        }
        // res.removeSuffix(" ")
        // res.append("\n")
        println()
    }

    // println(res)
}

fun solveABC237A() {
    val n = readLong()
    if (n in (-2.0).pow(31.0).toLong() until (2.0).pow(31.0).toLong()) {
        println("Yes")
    } else {
        println("No")
    }
}