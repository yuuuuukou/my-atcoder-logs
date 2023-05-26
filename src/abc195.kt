private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC195C()
}

fun solveABC195C() {
//    val n = readString()
//
//    //         1 ..         999 -> 各0回
//    //     1,000 ..     999,999 -> 各1回
//    // 1,000,000 .. 999,999,999 -> 各2回
//
//    // 1,234
//    // 1個 * (1-1) + 1 + 234
//
//    // 2,234
//    // 1個 * (2-1) * 1000 + 234+1
//    // 1000~1999の1000個
//    // 2000~2234の234+1個
//
//    // 100,234
//    // 1個 * (100-1) * 1000 + 234+1
//
//    // 1,100,234
//    // 2個 * (1-1) * 1000000 + 100234+1
//
//    // 1 <= n <= 100_000_000_000_000
//    var commaCnt =
//        if (n.length >= 13) {
//            4
//        } else if (n.length >= 10) {
//            3
//        } else if (n.length >= 7) {
//            2
//        } else if (n.length >= 4) {
//            1
//        } else {
//            0
//        }
//
//    var res = 0L
//    for (i in commaCnt downTo 1) {
//        // i * 3桁分を右側、それ以外を左側で分ける
//        val l = n.substring(0 until n.length - i * 3).toLong()
//        val r = n.substring(n.length - i * 3..n.lastIndex).toLong()
//        res += i * (l - 1) * 10.0.pow(3 * i).toLong() + r + 1
//    }
//
//    println(res)

    val n = readLong()
    var ans = 0L
    if (n >= 1000) ans += n - 999
    if (n >= 1000000) ans += n - 999999
    if (n >= 1000000000) ans += n - 999999999
    if (n >= 1000000000000) ans += n - 999999999999
    if (n >= 1000000000000000) ans += n - 999999999999999
    println(ans)
}

fun solveABC195B() {
    val (a, b, w) = readInts()
    val weight = w * 1000

    var max: Int? = null
    var min: Int? = null

    // 取りうるmaxの個数 w=1000キログラム a=b=1グラム
    // -> 1,000,000個
    // -> 1個～1,000,000個に分配可能かを全探索
    // 1個あたりの重量がa..bにおさまっているかを判定
    // あまりがでない or あまりをさらに分配したうえでもa..bにおさまっているならOK
    for (i in 1..1000000) {
        val mod = weight % i

        val unitWeight = weight / i
        if (unitWeight in a..b && (unitWeight * i == weight || unitWeight + kotlin.math.max(mod / i, 1) in a..b)) {
            max = kotlin.math.max(max ?: Int.MIN_VALUE, i)
            min = kotlin.math.min(min ?: Int.MAX_VALUE, i)
        }
    }

    if (max == null && min == null) {
        println("UNSATISFIABLE")
    } else {
        println("$min $max")
    }
}

fun solveABC195A() {
    val (m, h) = readInts()
    if (h % m == 0) {
        println("Yes")
    } else {
        println("No")
    }
}