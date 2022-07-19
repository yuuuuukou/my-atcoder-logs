fun main(args: Array<String>) {
    solveABC156B()
}

private fun solveABC156C() {
    /*val n = */readLine()!!.toInt()
    val xList = readLine()!!.split(" ").map { it.toInt() }

    var min = Int.MAX_VALUE

    for (p in 1..100) {
        var sum = 0
        for (x in xList) {
            sum += (x - p) * (x - p)
        }
        if (sum < min) {
            min = sum
        }
    }

    print(min)
}

fun solveABC156B() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }

    var ndash = n
    var ansDigit = 1
    while (ndash >= k) {
        ndash /= k
        ansDigit++
    }
    println(ansDigit)
}