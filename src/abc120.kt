import kotlin.math.max

fun main(args: Array<String>) {
    solveABC120B()
}

private fun solveABC120B() {
    val (a, b, k) = readLine()!!.split(" ").map { it.toInt() }

    val list = mutableListOf<Int>()
    for (i in 1..max(a, b)) {
        if (a % i == 0 && b % i == 0) {
            list.add(i)
        }
    }
    println(list.reversed()[k - 1])
}