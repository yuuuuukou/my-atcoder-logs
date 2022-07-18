import kotlin.math.min

fun main(args: Array<String>) {
    solveAGC025A()
}

fun solveAGC025A() {
    val n = readLine()!!.toInt()

    var ans = Int.MAX_VALUE

    // 1と999 999と1は同じになるので、(n/2)+1まで探索
    for (i in 2..(n / 2) + 1) {
        val a = i
        val b = n - i
        val sum = calcDigitSum(a) + calcDigitSum(b)
        ans = min(ans, sum)
    }

    println(ans)
}

fun calcDigitSum(n: Int): Int {
    val string = n.toString()
    var sum = 0
    for (i in string) {
        sum += i.toString().toInt()
    }
    return sum
}