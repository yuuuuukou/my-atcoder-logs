fun main(args: Array<String>) {
    solveABC064A()
}

fun solveABC064A() {
    val rgb = readLine()!!.replace(" ", "").toInt()
    if (rgb % 4 == 0) {
        println("YES")
    } else {
        println("NO")
    }
}