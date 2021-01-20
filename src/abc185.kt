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

    // バッテリーの増減を保持
    val map = mutableMapOf<Double, Int>()

    // 基本はバッテリーが減る
    for (i in 0 until t) {
        map[i + 0.5] = -1
    }

    // カフェにいる間は増える
    for (i in 0 until m) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        for (j in a until b) {
            map[j + 0.5] = 1
        }
    }

    // 増減確認
    var battery = n
    for (i in 0 .. t) {
        if (battery <= 0) {
            // 途中で充電切れ
            print("No")
            exitProcess(0)
        }

        if ((map[i + 0.5] ?: 0) > 0) {
            // 加算
            if (battery >= n) {
                // バッテリー容量Nを超えては充電不可
            } else {
                battery += (map[i + 0.5] ?: 0)
            }
        } else {
            // 減算
            battery += (map[i + 0.5] ?: 0)
        }
    }

    // 充電切れなければYes
    print("Yes")

}

fun solveABC185A() {
    val a = readLine()!!.split(" ").map { it.toInt() }
    println(a.min())
}