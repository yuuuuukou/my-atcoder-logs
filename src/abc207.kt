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
    solveABC207C()
}

fun solveABC207C() {
    val n = readInt()

    class Section(val t: Int, val l: Double, val r: Double)

    val list = mutableListOf<Section>()
    repeat(n) {
        val (ti, li, ri) = readInts()
        list.add(Section(ti, li.toDouble(), ri.toDouble()))
    }

    var cnt = 0
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            val l1 = when (list[i].t) {
                1, 2 -> list[i].l
                3, 4 -> list[i].l + 0.1
                else -> list[i].l
            }
            val r1 = when (list[i].t) {
                1, 3 -> list[i].r
                2, 4 -> list[i].r - 0.1
                else -> list[i].r
            }
            val l2 = when (list[j].t) {
                1, 2 -> list[j].l
                3, 4 -> list[j].l + 0.1
                else -> list[j].l
            }
            val r2 = when (list[j].t) {
                1, 3 -> list[j].r
                2, 4 -> list[j].r - 0.1
                else -> list[j].r
            }

            if (l2 in l1..r1 || r2 in l1..r1 || l1 in l2..r2 || r1 in l2..r2) {
                cnt++
            }
        }
    }

    println(cnt)
}

fun solveABC207B() {
    val (a, b, c, d) = readLongs()

    var bucket = Pair(a, 0L)
    var cnt = 0
    var preRate = Double.MAX_VALUE
    while (true) {
        val rate = bucket.first.toDouble() / bucket.second.toDouble()
        if (rate <= d) {
            println(cnt)
            return
        }
        if (cnt > 0) {
            if (rate >= preRate) {
                println(-1)
                return
            }
        }

        preRate = rate
        bucket = Pair(bucket.first + b, bucket.second + c)
        cnt++
    }
}

fun solveABC207A() {
    val abc = readInts().sortedDescending()
    println(abc[0] + abc[1])
}