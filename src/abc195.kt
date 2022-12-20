private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC195B()
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