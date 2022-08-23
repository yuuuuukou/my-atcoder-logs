import kotlin.math.sqrt

fun main(args: Array<String>) {
    solveABC149C()
}

fun solveABC149C() {
    val x = readLine()!!.toInt()

    val primes = makePrimes(1000000)

    for (prime in primes) {
        if (prime >= x) {
            println(prime)
            return
        }
    }
}

/**
 * エラトステネスの篩を利用して素数を列挙したリストを作成
 */
private fun makePrimes(n: Int): MutableList<Int> {
    val isPrime = MutableList(n + 1) { true }
    isPrime[0] = false
    isPrime[1] = false

    for (p in 2..sqrt(n.toDouble()).toInt() + 1) {
        if (isPrime[p]) {
            for (x in p * 2..n step p) {
                // p^2以上のpの整数倍は全てfalse(=0)にしてふるいにかける
                isPrime[x] = false
            }
        }
    }

    val res = mutableListOf<Int>()
    for (p in 2..n) {
        if (isPrime[p]) {
            res.add(p)
        }
    }

    return res
}