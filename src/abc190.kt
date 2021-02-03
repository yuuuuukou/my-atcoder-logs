import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
//    solveABC190C()
}

//fun solveABC190C() {
//    // n    : 1..nの番号が付いた 皿
//    // m    : 1..Mの番号が付いた 条件
//    // 条件i : 皿Ai,皿Biの両方にボールが置かれているときに満たされる
//    // k    : 1..kの番号が付いた 人、人iは皿Ciか皿Diのどちらか一方にボールを置く
//
//    // 皿
//    var aList = mutableListOf<Int>()
//    var bList = mutableListOf<Int>()
//
//    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
//    for (i in 1..m) {
//        val (ai, bi) = readLine()!!.split(" ").map { it.toInt() }
//        aList.add(ai)
//        bList.add(bi)
//    }
//
//    // 人
//    var cList = mutableListOf<Int>()
//    var dList = mutableListOf<Int>()
//    val k = readLine()!!.toInt()
//    for (i in 1..k) {
//        val (ci, di) = readLine()!!.split(" ").map { it.toInt() }
//        cList.add(ci)
//        dList.add(di)
//    }
//
//    val patternList = mutableListOf<Int>()
//
//    for (i in 1 .. Math.pow(2.0, k.toDouble()).roundToInt()) {
//        for (j in 0 until k) {
//
//        }
//    }
//
//}

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
