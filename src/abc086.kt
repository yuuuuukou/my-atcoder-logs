import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    solveABC086A()
}

fun solveABC086B() {
    val ab = readLine()!!.replace(" ", "").toInt()
    val x = sqrt(ab.toDouble()).toInt()
    if (x.toDouble().pow(2) == ab.toDouble()) {
        println("Yes")
    } else {
        println("No")
    }
}

fun solveABC086A() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    if ((a * b) % 2 == 0) {
        println("Even")
    } else {
        println("Odd")
    }
}