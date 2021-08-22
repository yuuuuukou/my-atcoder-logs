import kotlin.math.min
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    solveABC212C()
}

fun solveABC212C() {
    val (n, m) = readLine()!!.split(" ").map { it.toLong() }
    val a = readLine()!!.split(" ").map { it.toLong() }.sorted()
    val b = readLine()!!.split(" ").map { it.toLong() }.sorted()

    var result = Long.MAX_VALUE

    for (ai in a) {
        val searchResult = b.binarySearch(ai)
        if (searchResult == 0) {
            println("0")
            exitProcess(0)
        }

        val backIndex = -searchResult - 2
        val forwardIndex = -searchResult - 1

        if (backIndex >= 0) {
            val back = b[backIndex]
            result = min(result, ai - back)
        }

        if (forwardIndex < b.size) {
            val forward = b[forwardIndex]
            result = min(result, forward - ai)
        }
    }

    println(result)
}

fun solveABC212B() {
    val xxxx = readLine()!!

    if (xxxx[0] == xxxx[1]
        && xxxx[0] == xxxx[2]
        && xxxx[0] == xxxx[3]
    ) {
        println("Weak")
    } else if (isNextNumber(xxxx[0].toString().toInt(), xxxx[1].toString().toInt())
        && isNextNumber(xxxx[1].toString().toInt(), xxxx[2].toString().toInt())
        && isNextNumber(xxxx[2].toString().toInt(), xxxx[3].toString().toInt())
    ) {
        println("Weak")
    } else {
        println("Strong")
    }
}

fun isNextNumber(xi: Int, xj: Int): Boolean {
    return if (xi == 9) {
        xj == 0
    } else {
        (xi + 1) == xj
    }
}

fun solveABC212A() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }

    when {
        a > 0 && b == 0 -> {
            println("Gold")
        }
        a == 0 && b > 0 -> {
            println("Silver")
        }
        a > 0 && b > 0 -> {
            println("Alloy")
        }
        else -> {
        }
    }
}
