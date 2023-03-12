private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC154C()
}

fun solveABC154C() {
    val n = readInt()
    val a = readInts()

    if (a.count() == a.distinct().count()) {
        println("YES")
    } else {
        println("NO")
    }
}

fun solveABC154B() {
    val s = readString()

    println("".padStart(s.length, 'x'))
}

fun solveABC154A() {
    val (s, t) = readStrings()
    val (a, b) = readInts()
    val u = readString()

    val map = mutableMapOf<String, Int>()
    map[s] = a
    map[t] = b
    map[u] = (map[u] ?: 0) - 1

    println("${map[s]} ${map[t]}")
}