private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC162C()
}

fun solveABC162C() {
    val k = readInt()

    fun gcd(a: Long, b: Long): Long {
        return if (b == 0L) a else gcd(b, a % b)
    }

    var sum = 0L
    for (a in 1..k) {
        for (b in 1..k) {
            for (c in 1..k) {
                val tmp1 = gcd(b.toLong(), a.toLong())
                val tmp2 = gcd(c.toLong(), b.toLong())
                val tmp3 = gcd(tmp2, tmp1)
                sum += tmp3
            }
        }
    }

    println(sum)
}

fun solveABC162B() {
    val n = readLong()

    var res = 0L
    for (i in 1..n) {
        if (i % 3 == 0L || i % 5 == 0L) {
            // Fizz || Buzz
        } else {
            res += i
        }
    }

    println(res)
}

fun solveABC162A() {
    val n = readLn()
    if (n.contains("7")) {
        println("Yes")
    } else {
        println("No")
    }
}