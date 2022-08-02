import kotlin.math.min

fun main(args: Array<String>) {
    solveARC096C()
}

fun solveARC096C() {
    val (a, b, c, x, y) = readLine()!!.split(" ").map { it.toInt() }

    var cost = 0

    // min(x, y): AピザもBピザも必要になる区間
    for (i in 1..min(x, y)) {
        // どちらも必要なので、より安い方法で購入
        cost += min(a + b, c * 2)
    }

    // max(x, y): AピザorBピザの一方のみ購入すればよい区間
    when {
        x == y -> {}
        x < y -> {
            for (i in min(x, y) + 1..y) {
                //　Bピザが不足
                cost += min(b, c * 2)
            }
        }
        else /* x > y */ -> {
            for (i in min(x, y) + 1..x) {
                //　Aピザが不足
                cost += min(a, c * 2)
            }
        }
    }

    println(cost)
}
