import kotlin.math.absoluteValue

fun main(args: Array<String>) {
    solveABC074B()
}

fun solveABC074B() {
    /* val n = */readLine()!!.toInt()
    val k = readLine()!!.toInt()
    val x = readLine()!!.split(" ").map { it.toInt() }

    var sum = 0
    for (xi in x) {
        sum += if ((k - xi).absoluteValue < (0 - xi).absoluteValue) {
            2 * (k - xi)
        } else {
            2 * xi
        }
    }
    println(sum)
}
