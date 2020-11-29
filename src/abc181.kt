fun main() {
    solveABC181A()
}

fun solveABC181A() {
    val n = readLine()!!.toInt()

    if (n % 2 == 0) {
        println("White")
    } else {
        println("Black")
    }
}
