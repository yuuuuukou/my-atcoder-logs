fun main(args: Array<String>) {
    solveABC081B()
}

fun solveABC081B() {
    /*val n = */readLine()!!
    val a = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    var cnt = 0
    var canContinue = true
    while (canContinue) {
        for (i in a.indices) {
            if (a[i] % 2 != 0) {
                canContinue = false
            } else {
                a[i] /= 2
            }
        }
        cnt++
    }

    // 最後1回余計に数えているのでデクリメント
    cnt--

    println(cnt)
}

fun solveABC081A() {
    val s = readLine()!!

    println(s[0].toString().toInt() + s[1].toString().toInt() + s[2].toString().toInt())
}
