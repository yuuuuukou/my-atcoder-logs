fun main(args: Array<String>) {
    solveABC215B()
}

fun solveABC215B() {
    val n = readLine()!!.toLong()

    var a = 2L
    var cnt = 0
    while (a <= n) {
        a *= 2
        cnt++
    }

    println(cnt)
}

fun solveABC215A() {
    val s = readLine()!!

    if (s == "Hello,World!") {
        println("AC")
    } else {
        println("WA")
    }
}
