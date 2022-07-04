import java.math.BigDecimal

fun main(args: Array<String>) {
    solveABC133B()
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
