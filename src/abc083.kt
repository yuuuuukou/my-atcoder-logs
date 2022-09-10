private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC083A()
}

fun solveABC083B() {
    val (n, a, b) = readLine()!!.split(" ").map { it.toInt() }

    var ans = 0

//    // 文字列としてループさせる方法
//    for (i in 1..n) {
//        val iString = i.toString()
//        var sum = 0
//        for (char in iString) {
//            sum += char.toString().toInt()
//        }
//
//        if (sum in a..b) {
//            ans += i
//        }
//    }

    // 数値として10ずつ割って余りを使っていく方法
    for (i in 1..n) {
        val sum = calc(i)
        if (sum in a..b) {
            ans += i
        }
    }

    println(ans)
}

private fun calc(n: Int): Int {
    var ndash = n
    var sum = 0
    while (ndash > 0) {
        sum += ndash % 10
        ndash /= 10
    }
    return sum
}

fun solveABC083A() {
    val (a, b, c, d) = readInts()

    if (a + b == c + d) {
        println("Balanced")
    } else if (a + b < c + d) {
        println("Right")
    } else {
        println("Left")
    }
}
