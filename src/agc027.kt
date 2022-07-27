fun main(args: Array<String>) {
    solveAGC027A()
}

fun solveAGC027A() {
    var (n, x) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    a.sort()

    var res = 0
    for ((i, ai) in a.withIndex()) {
        val lastIndex = n - 1
        if (i == lastIndex) {
            if (x == ai) {
                // 配り切る必要があり、最後の子供は残りのお菓子(x)と欲してるお菓子(ai)が一致する必要がある
                res++
            }
        } else {/**/
            if (x < ai) {
                // 配れるお菓子が不足
                break
            } else {
                x -= ai
                res++
            }
        }
    }

    println(res)
}
