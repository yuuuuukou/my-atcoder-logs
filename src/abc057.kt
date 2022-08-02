import kotlin.math.max
import kotlin.math.min
import kotlin.math.sqrt

fun main(args: Array<String>) {
    solveABC057C()
}

fun solveABC057C() {
    val n = readLine()!!.toLong()

    var ans = Long.MAX_VALUE

    for (a in 1..sqrt(n.toDouble()).toInt()) {
        if (n % a == 0L) {
            val b = n / a
            ans = min(ans, f(a.toLong(), b))
        }
    }

    println(ans)
}

fun f(a: Long, b: Long): Long {
    return max(a.toString().length, b.toString().length).toLong()
}