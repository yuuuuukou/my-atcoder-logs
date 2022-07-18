fun main(args: Array<String>) {
    solveABC083B()
}

fun solveABC083B() {
    val (n, a, b) = readLine()!!.split(" ").map { it.toInt() }

    var ans = 0
    for (i in 1..n) {
        val iString = i.toString()
        var sum = 0
        for (char in iString) {
            sum += char.toString().toInt()
        }

        if (sum in a..b) {
            ans += i
        }
    }

    println(ans)
}
