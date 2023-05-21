private fun readString() = readLine()!!
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
    solveABC235C()
}

fun solveABC235C() {
    val (_, q) = readInts()
    val a = readInts()

    val countMap = mutableMapOf<Int, Int>()
    val resultMap = mutableMapOf<Pair<Int, Int>, Int>()
    for ((i, ai) in a.withIndex()) {
        // aiが出てきたのが何回目か
        countMap[ai] = (countMap[ai] ?: 0) + 1
        // aiのcountMap[ai]はi+1番目
        resultMap[Pair(ai, countMap[ai]!!)] = i + 1
    }

    repeat(q) {
        val (xi, ki) = readInts()
        println(resultMap[Pair(xi, ki)] ?: -1)
    }
}

fun solveABC235B() {
    val n = readInt()
    val h = readInts()

    var res = 0
    for (hi in h) {
        if (res < hi) {
            res = hi
        } else {
            break
        }
    }
    println(res)
}

fun solveABC235A() {
    val abc = readString()
    println(
        abc.toInt()
                + (abc[1].toString() + abc[2].toString() + abc[0].toString()).toInt()
                + (abc[2].toString() + abc[0].toString() + abc[1].toString()).toInt()
    )
}