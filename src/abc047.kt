import kotlin.math.max
import kotlin.math.min

fun main(args: Array<String>) {
    solveABC047B()
}

fun solveABC047B() {
    // w * h の平面に、 n個の点を打っていく
    val (w, h, n) = readLine()!!.split(" ").map { it.toInt() }

    var xFrom = 0
    var xTo = w
    var yFrom = 0
    var yTo = h

    for (i in 0 until n) {
        val (xi, yi, ai) = readLine()!!.split(" ").map { it.toInt() }
        when (ai) {
            1 -> {
                // x < xi を塗りつぶし
                xFrom = max(xFrom, xi)
            }
            2 -> {
                // x > xi を塗りつぶし
                xTo = min(xTo, xi)
            }
            3 -> {
                // y < yi を塗りつぶし
                yFrom = max(yFrom, yi)
            }
            4 -> {
                // y > yi を塗りつぶし
                yTo = min(yTo, yi)
            }
        }
    }

    val xLength = xTo - xFrom
    val yLength = yTo - yFrom
    if (xLength < 0 || yLength < 0) {
        // 一方でも負数になるのであれば、残っている領域は無い
        println(0)
    } else {
        println(xLength * yLength)
    }

}