fun main(args: Array<String>) {
    solveABC175B()
}

fun solveABC175B() {
    val n = readLine()!!.toInt()
    val l = readLine()!!.split(" ").map { it.toInt() }

    var cnt = 0
    for (i in 0 until n) {
        for (j in i until n) {
            for (k in j until n) {
                val contain = j in (i + 1) until k
                if (!contain) {
                    continue
                }

                val li = l[i]
                val lj = l[j]
                val lk = l[k]

                if (li == lj || lj == lk || lk == li) {
                    // li, lj, lkがすべて異なる が偽
                    continue
                }

                // 三角形の成立条件 : 各辺において、他の2辺の和よりも長さが短いこと
                // -> a + b > c && b + c > a && c + a > b
                if (li + lj > lk && lj + lk > li && lk + li > lj) {
                    cnt++
                }
            }
        }
    }

    println(cnt)
}
