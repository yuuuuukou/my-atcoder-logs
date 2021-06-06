import kotlin.math.min
import kotlin.system.exitProcess

fun main() {
    solveABC185B()
}

fun solveABC185B() {
    // N: バッテリー容量 n + 0.5ごとに1減少or増加
    // M: カフェを訪れる回数
    // T: 帰宅時刻
    // A: カフェfrom
    // B: カフェto
    val (n, m, t) = readLine()!!.split(" ").map { it.toInt() }

    var current = n
    var lastTime = 0

    for (i in 0..m) {
        val (a, b) = if (i == m) {
            // ループの最後は帰宅時刻まで引っ張る
            listOf(t, t)
        } else {
            readLine()!!.split(" ").map { it.toInt() }
        }

        // current->aまで減算
        current -= (a - lastTime)
        if (current <= 0) {
            print("No")
            exitProcess(0)
        }

        // b->aまで分を加算(nが上限)
        current = min(n, current + b - a)

        lastTime = b
    }

    print("Yes")
}

fun solveABC185A() {
    val a = readLine()!!.split(" ").map { it.toInt() }
    println(a.min())
}