import kotlin.math.abs
import kotlin.math.min

fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(" ").map { it.toLong() }

    val n2 = n % k
    println(min(n2, abs(n2 - k)))
}