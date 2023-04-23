private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC206C()
}

fun solveABC206C() {
    val n = readLong()
    val a = readLongs()

    var cnt = 0L
    val map = mutableMapOf<Long, Long>()
    for ((i, ai) in a.withIndex()) {
        cnt += (i - (map[ai] ?: 0))
        map[ai] = (map[ai] ?: 0) + 1
    }

    println(cnt)
}

fun solveABC206B() {
    val n = readInt()

    var day = 0
    var current = 0
    var amount = 0
    do {
        day++
        amount += (++current)
    } while (amount < n)

    println(day)
}

fun solveABC206A() {
    val n = readInt()
    val price = (n * 1.08).toInt()
    when {
        price < 206 -> {
            println("Yay!")
        }
        price == 206 -> {
            println("so-so")
        }
        else -> {
            println(":(")
        }
    }
}