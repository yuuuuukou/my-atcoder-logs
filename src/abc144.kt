import kotlin.math.min

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC144C()
}

fun solveABC144C() {
    val n = readLong()

    // ref: https://qiita.com/drken/items/a14e9af0ca2d857dad23#3-%E7%B4%84%E6%95%B0%E5%88%97%E6%8C%99
    fun getDivisors(n: Long): MutableList<Long> {
        val res = mutableListOf<Long>()

        var i = 1L
        while (i * i <= n) {
            if (n % i == 0L) {
                res.add(i)
                if (n / i != i) res.add(n / i)
            }
            i++
        }
        res.sort()
        return res
    }

    var res = Long.MAX_VALUE
    val divisors = getDivisors(n)
    for (i in divisors) {
        for (j in divisors) {
            if (i * j == n) {
                res = min(i + j, res)
            }
        }
    }

    println(res - 2)
}

fun solveABC144B() {
    val n = readLine()!!.toInt()

    var result = "No"
    for (i in 1..9) {
        for (j in 1..9) {
            if (i * j == n) {
                result = "Yes"
            }
        }
    }

    println(result)
}

fun solveABC144A() {
    val (a, b) = readInts()
    if (a <= 9 && b <= 9) {
        println(a * b)
    } else {
        println(-1)
    }
}