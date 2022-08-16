fun main(args: Array<String>) {
    solveABC150B()
}

private fun solveABC150B() {
    /*val n =*/ readLine()!!.toInt()
    val s = readLine()!!

    var cnt = 0
    for (i in 0..s.length - 1 - 2) {
        if (s[i].toString() + s[i + 1].toString() + s[i + 2].toString() == "ABC") {
            cnt++
        }
    }
    println(cnt)
}