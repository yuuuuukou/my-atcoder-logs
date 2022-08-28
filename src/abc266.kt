private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC266C()
}

fun solveABC266C() {
    val (ax, ay) = readInts()
    val (bx, by) = readInts()
    val (cx, cy) = readInts()
    val (dx, dy) = readInts()

    // 角Aの外積 bxd
    val a = calc(bx - ax, by - ay, dx - ax, dy - ay)
    // 角Bの外積 cxa
    val b = calc(cx - bx, cy - by, ax - bx, ay - by)
    // 角Cの外積 dxb
    val c = calc(dx - cx, dy - cy, bx - cx, by - cy)
    // 角Dの外積 axc
    val d = calc(ax - dx, ay - dy, cx - dx, cy - dy)

    if (a > 0 && b > 0 && c > 0 && d > 0) {
        println("Yes")
    } else {
        println("No")
    }
}

private fun calc(ax: Int, ay: Int, bx: Int, by: Int): Int {
    return ax * by - ay * bx
}

fun solveABC266B() {
    val n = readLong()

    val key = 998244353

    if (n >= 0L) {
        println(n % key)
    } else {
        if (n % key == 0L) {
            println(0)
        } else {
            println(key + n % key)
        }
    }
}

fun solveABC266A() {
    val s = readLn()
    println(s[s.length / 2])
}
