import kotlin.math.absoluteValue

fun main(args: Array<String>) {
    solveABC113B()
}

fun solveABC113B() {
    /*val n = */readLine()!!.toInt()
    val (t, a) = readLine()!!.split(" ").map { it.toInt() }
    val h = readLine()!!.split(" ").map { it.toInt() }

    // 標高xメートル 平均気温t - x * 0.006度
    // 候補地n個
    // 平均気温がA度に近くなるように
    var resultIndex = 0
    var resultValue = Double.MAX_VALUE
    for (i in h.indices) {
        val temperature = t - h[i] * 0.006

        if ((a - temperature).absoluteValue < resultValue) {
            resultIndex = i + 1
            resultValue = (a - temperature).absoluteValue
        }
    }

    println(resultIndex)
}