fun main() {
    solveABC185A()
}

fun solveABC185A() {
    val a = readLine()!!.split(" ").map { it.toInt() }
    println(a.min())
}