fun main(args: Array<String>) {
    solveABC069B()
}

fun solveABC069B() {
    val s = readLine()!!

    println("${s[0]}${s.length - 2}${s[s.length - 1]}")
}
