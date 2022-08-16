fun main(args: Array<String>) {
    solveABC106B()
}

fun solveABC106B() {
    val n = readLine()!!.toInt()

    var res = 0
    for (i in 1..n) {
        if (i % 2 != 0) {
            var cnt = 0
            for (j in 1..i) {
                if (i % j == 0) {
                    cnt++
                }
            }
            if (cnt == 8) {
                res++
            }
        }
    }
    println(res)
}