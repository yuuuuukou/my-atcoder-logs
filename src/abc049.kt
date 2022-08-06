import kotlin.math.pow

fun main(args: Array<String>) {
    solveABC049C()
}

fun solveABC049C() {
    val s = readLine()!!

    val texts = listOf("dream", "dreamer", "erase", "eraser")

    val dp = MutableList<Int>(10.0.pow(6).toInt()) { 0 }
    for (i in 0 until s.length - 1) {
        if (i == 0 || dp[i] == 1) {
            for (text in texts) {
                if (s.substring(i).length < text.length) {
                    continue
                }
                if (s.substring(i until i + text.length) == text) {
                    // i(1,2...)文字目到達できた という意味で1立てる
                    dp[i + text.length] = 1
                }
            }
        }
    }

    if (dp[s.length] == 1) {
        println("YES")
    } else {
        println("NO")
    }
}