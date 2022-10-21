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
    solveABC249A()
}

fun solveABC249A() {
    val line = readInts()
    val a = line[0]
    val b = line[1]
    val c = line[2]
    val d = line[3]
    val e = line[4]
    val f = line[5]
    val x = line[6]

    var distance = 0
    for (i in 1..x) {
        if (i % (a + c) in 1..a) {
            distance += b
        }
    }

    var distance2 = 0
    for (i in 1..x) {
        if (i % (d + f) in 1..d) {
            distance2 += e
        }
    }

    if (distance < distance2) {
        println("Aoki")
    } else if (distance == distance2) {
        println("Draw")
    } else {
        println("Takahashi")
    }
}