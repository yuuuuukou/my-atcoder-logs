fun main(args: Array<String>) {
    solveABC136B()
}

fun solveABC136B() {
    val n = readLine()!!.toInt()

    var cnt = 0
    for (i in 1..n) {
        if (i.toString().length % 2 != 0) {
            cnt++
        }
    }

    println(cnt)
}
