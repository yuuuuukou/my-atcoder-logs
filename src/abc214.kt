import kotlin.math.min

private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC214C()
}

fun solveABC214C() {
    val n = readInt()
    val s = readInts()
    val t = readInts()

    val res = MutableList(n) { Long.MAX_VALUE }

    for (i in 0 until n) {
        val beforeIndex = if (i == 0) res.lastIndex else i - 1
        // i番目の人が直接受け取る時刻
        val time1 = t[i].toLong()
        // i番目の人が前の人から受け取る時刻
        val time2 =
            if (i == 0) {
                // 最初の人が前の人から受け取るケースは一旦考えない
                Long.MAX_VALUE
            } else {
                // 前の人が受け取った時間t + 前の人が渡すまでの時間si
                res[beforeIndex] + s[beforeIndex]
            }
        res[i] = min(time1, time2)
    }

    for (i in 0 until n) {
        val beforeIndex = if (i == 0) res.lastIndex else i - 1
        // i番目の人が直接受け取る時刻
        val time1 = t[i].toLong()
        // i番目の人が前の人から受け取る時刻
        // 前の人が受け取った時間t + 前の人が渡すまでの時間si
        val time2 = res[beforeIndex] + s[beforeIndex]
        res[i] = min(time1, time2)
    }

    for (r in res) {
        println(r)
    }
}

fun solveABC214B() {
    val (s, t) = readInts()

    var cnt = 0
    for (ai in 0..100) {
        for (bi in 0..100) {
            for (ci in 0..100) {
                if (ai + bi + ci <= s && ai * bi * ci <= t) {
                    cnt++
                }
            }
        }
    }

    println(cnt)
}

fun solveABC214A() {
    when (readInt()) {
        in 1..125 -> {
            println(4)
        }
        in 126..211 -> {
            println(6)
        }
        in 212..214 -> {
            println(8)
        }
    }
}