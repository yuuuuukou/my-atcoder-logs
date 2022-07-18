fun main(args: Array<String>) {
    solveABC090B()
}

fun solveABC090B() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    var cnt = 0
    for (i in a..b) {
        val iString = i.toString()
        if (iString[0] == iString[4] && iString[1] == iString[3]) {
            cnt++
        }
    }
    println(cnt)
}