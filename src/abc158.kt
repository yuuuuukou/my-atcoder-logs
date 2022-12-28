import kotlin.math.min

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC158B()
}

fun solveABC158B() {
    val (n, a, b) = readLongs()

    if (a == 0L && b == 0L) {
        println(0)
        return
    }

    // abのセットが組める分
    val set = n/(a+b)
    // セットから余る分
    val mod = n%(a+b)

    println(set * a + min(mod, a))
}

fun solveABC158A() {
    val s = readLn()

    if (s[0] == s[1] && s[1] == s[2]) {
        println("No")
    } else {
        println("Yes")
    }
}
