fun main(args: Array<String>) {
    solveABC068B()
}

fun solveABC068B() {
    val n = readLine()!!.toInt()

    var ans = 1
    while (true) {
        val tmpAns = ans * 2
        if (tmpAns <= n) {
            ans = tmpAns
        } else {
            break
        }
    }

    println(ans)
}