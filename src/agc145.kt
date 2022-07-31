import kotlin.math.max
import kotlin.math.min

fun main(args: Array<String>) {
    solveAGC145B()
}

fun solveAGC145B() {
    val (n, a, b) = readLine()!!.split(" ").map { it.toLong() }

    fun f(x: Long): Long {
        return (x / a) * min(a, b) + min(x % a, b - 1)
    }

    println(max(f(n) - f(a - 1), 0))
}

fun solveAGC145A() {
    val n = readLine()!!.toInt()
    val s = readLine()!!

    val res: String
    if (n == 2) {
        if (s == "AA" || s == "BB") {
            res = "Yes"
        } else {
            res = "No"
        }
    } else {
        if (s[n - 1].toString() == "A") {
            // 末尾がAの時点で、この条件であれば回文を作ることができる
            res = "Yes"
        } else {
            if (s[0].toString() == "B") {
                // 末尾がBのときは、先頭もBであれば回文を作ることができる
                res = "Yes"
            } else {
                res = "No"
            }
        }
    }

    println(res)
}
