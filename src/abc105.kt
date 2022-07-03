fun main(args: Array<String>) {
    solveABC105B()
}

fun solveABC105B() {
    val n = readLine()!!.toInt()

    var can = false
    for (i in 0..((100 / 4) + 1)) {
        for (j in 0..((100 / 7) + 1)) {
            if (n == 4 * i + 7 * j) {
                can = true
            }
        }
    }

    if (can) {
        println("Yes")
    } else {
        println("No")
    }
}
