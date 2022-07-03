fun main(args: Array<String>) {
    solveABC087B()
}

fun solveABC087B() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val x = readLine()!!.toInt()

    var cnt = 0
    for (ai in 0..a) {
        for (bi in 0..b) {
            for (ci in 0..c) {
                if (x == 500 * ai + 100 * bi + 50 * ci) {
                    cnt++
                }
            }
        }
    }

    println(cnt)
}