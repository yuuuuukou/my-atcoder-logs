import kotlin.math.abs

fun main(args: Array<String>) {
    solveABC205D()
}

fun solveABC205D() {
    val (n, q) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toLong() }.toMutableList()

    // ai以下の対象となる整数の個数を数える
    val low = Array<Long>(n) { 0 }
    for (i in 0 until n) {
        // a = 3,5 であれば、i=0 のときに1,2の2個対象になる
        // a[0] - (0+1) = 3-1 = 2
        // a = 3,5 であれば、i=1 のときに1,2,4の3個対象になる
        // a[1] - (1+1) = 5-2 = 3
        low[i] = a[i] - (i + 1)
    }

    for (i in 1..q) {
        val ki = readLine()!!.toLong()
        val index = a.binarySearch(ki)
        if (index >= 0) {
            // 対象の値がある -> 対象のインデックスが返る
            // [3,5,6,7] 3を渡す -> 0が返る "index"
            // [3,5,6,7] 5を渡す -> 1が返る "index"

            // 対象の数値よりも小さい要素の数
            // 0 -> 1
            // 1 -> 2
            // に変換
            var smallItemCount = index + 1

        } else {
            // 対象の値が無ければ、対象の値より大きい最も近い値のindex + 1が負数で返る

            // [3,5,6,7] 2を渡す -> -1が返る "-(大きくて一番近い値のindex + 1)"
            // [3,5,6,7] 4を渡す -> -2が返る "-(大きくて一番近い値のindex + 1)"

            // 対象の数値よりも小さい要素の数
            // -1 -> 0
            // -2 -> 1
            // に変換
            val smallItemCount = (-1 * index) - 1

        }
    }
}

fun solveABC205C() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toLong() }

    val aSignum = getSignumP1PowP2(a, c)
    val bSignum = getSignumP1PowP2(b, c)

    if (aSignum == -1 && bSignum >= 0) {
        println("<")
    } else if (aSignum >= 0 && bSignum == -1) {
        println(">")
    } else {
        if (abs(a) == abs(b)) {
            println("=")
        } else if (abs(a) < abs(b)) {
            println("<")
        } else {
            println(">")
        }
    }

//    when {
//        a.pow(c.toInt()) == b.pow(c.toInt()) -> {
//            println("=")
//        }
//        a.pow(c.toInt()) < b.pow(c.toInt()) -> {
//            println("<")
//        }
//        else -> {
//            println(">")
//        }
//    }
}

/**
 * pow計算後の符号を計算
 * C問題用
 */
fun getSignumP1PowP2(p1: Long, p2: Long): Int {
    val p1Tmp = p1.toBigDecimal()

    return if (p1Tmp.signum() == -1) {
        if (p2 % 2 == 0L) {
            1
        } else {
            -1
        }
    } else {
        1
    }
}

fun solveABC205B() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }

    val aCount = Array(n + 1) { 0 }

    var able = true
    for (ai in a) {
        aCount[ai]++

        if (aCount[ai] > 1) {
            able = false
        }
    }

    println(if (able) "Yes" else "No")
}

fun solveABC205A() {
    val (a, b) = readLine()!!.split(" ").map { it.toDouble() }

    println(a * b / 100.0)
}
