import kotlin.math.pow

private val reader = System.`in`.bufferedReader()
private fun readString() = reader.readLine()
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readString().toDouble()
private fun readDoubles() = readString().split(" ").map { it.toDouble() }.toMutableList()
private fun readBigDecimal() = readString().toBigDecimal()
private fun readBigDecimals() = readString().split(" ").map { it.toBigDecimal() }.toMutableList()

fun main(args: Array<String>) {
    solveABC049B()
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

fun solveABC049B() {
    val (h, w) = readInts()
    repeat(h) {
        val ci = readString()
        println(ci)
        println(ci)
    }
}

fun solveABC049A() {
    val c = readLine()!!

    val vowels = listOf("a", "i", "u", "e", "o")

    if (vowels.contains(c)) {
        println("vowel")
    } else {
        println("consonant")
    }
}