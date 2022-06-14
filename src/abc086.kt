import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    solveABC086B()
}

private fun solveABC086B() {
    val ab = readLine()!!.replace(" ", "").toInt()
    val x = sqrt(ab.toDouble()).toInt()
    if (x.toDouble().pow(2) == ab.toDouble()) {
        println("Yes")
    } else {
        println("No")
    }
}