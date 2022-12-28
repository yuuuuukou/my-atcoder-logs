private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC138B()
}

fun solveABC138C() {
    val n = readLine()!!.toInt()
    val v = readLine()!!.split(" ").map { it.toBigDecimal() }.sorted()

    var before = "0".toBigDecimal()
    for (i in 0 until n) {
        if (i == 0) {
            before = v[i]
            continue
        }

        before = (before + v[i]).divide("2.00000".toBigDecimal())
    }
    println(before)
}

fun solveABC138B() {
    val n = readInt()
    val a = readDoubles()

    var sum = 0.0
    for (ai in a) {
        sum += (1.0 / ai)
    }

    println(1.0/sum)
}

fun solveABC138A() {
    val a = readInt()
    val s = readLn()

    if (a >= 3200) {
        println(s)
    } else {
        println("red")
    }
}