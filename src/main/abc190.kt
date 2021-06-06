import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    solveABC190C()
}

fun solveABC190C() {
    // n    : 1..nの番号が付いた 皿
    // m    : 1..Mの番号が付いた 条件
    // 条件i : 皿Ai,皿Biの両方にボールが置かれているときに満たされる
    // k    : 1..kの番号が付いた 人、人iは皿Ciか皿Diのどちらか一方にボールを置く

    // 条件
    val conditions = mutableListOf<Pair<Int, Int>>()
    val (_, m) = readLine()!!.split(" ").map { it.toInt() }
    for (i in 0 until m) {
        val (ai, bi) = readLine()!!.split(" ").map { it.toInt() }
        conditions.add(ai to bi)
    }

    // 人
    val choices = mutableListOf<Pair<Int, Int>>()
    val k = readLine()!!.toInt()
    for (i in 0 until k) {
        val (ci, di) = readLine()!!.split(" ").map { it.toInt() }
        choices.add(ci to di)
    }

    var ans = 0
    // 2^k のパターンをループ
    for (bit in 0 until ((2.0).pow(k).roundToInt())) {

        // ボールが乗っているかどうかのmap
        val balls = mutableMapOf<Int, Boolean>()

        // 人数分の選択を全探索
        for ((i, choice) in choices.withIndex()) {
            val (c, d) = choice
            // bitのi番目が立っていれば    cを選択
            //           立っていなければ dを選択
            // -> 1をi桁左シフト(1 shl i)した値とandを取ることで
            //    i番目のフラグが立っているか確認
            val selectedBall = if (bit and (1 shl i) == 0) c else d

            // 選んだボールのフラグを立てる
            // = 皿にボールが乗った状態
            balls[selectedBall] = true
        }

        // 条件を確認していく
        var count = 0
        for (condition in conditions) {
            val (a, b) = condition
            if (balls[a] == true && balls[b] == true) {
                count++
            }
        }

        // count最大のものを解答とする
        if (ans < count) {
            ans = count
        }
    }
    println(ans)
}

fun solveABC190B() {
    // n:魔法の種類
    // xi:詠唱時間
    // yi:威力
    // s:s秒以上かかる魔法はダメージ0
    // d:威力d以下の魔法はダメージ0

    val (n, s, d) = readLine()!!.split(" ").map { it.toInt() }
    for (i in 0 until n) {
        val (x, y) = readLine()!!.split(" ").map { it.toInt() }
        if (x < s && y > d && y > 0) {
            // ダメージ出る
            println("Yes")
            exitProcess(0)
        }
    }
    println("No")
}

fun solveABC190A() {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    // 2,1,0
    if (c == 0) {
        // a先
        if (a <= b) {
            println("Aoki")
        } else {
            println("Takahashi")
        }
    } else if (c == 1) {
        // b先
        if (a >= b) {
            println("Takahashi")
        } else {
            println("Aoki")
        }
    }
}
