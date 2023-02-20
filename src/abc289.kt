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
    Thread(null, {
        solveABC289B()
    }, "solve", 1.shl(26)).start()
}

fun solveABC289B() {
    val (n, m) = readInts()
    var a: MutableList<Int>

    if (m == 0) {
        for (i in 1..n) {
            print("$i ")
        }
        println()
        return
    } else {
        a = readInts()
    }

    val list = mutableListOf<MutableList<Int>>()
    for (ai in a) {
        if (list.isEmpty()) {
            val tmp = mutableListOf<Int>()
            tmp.add(ai)
            tmp.add(ai + 1)
            list.add(tmp)
        } else {

            var added = false
            for (item in list) {
                if (item.contains(ai)) {
                    item.add(ai + 1)
                    added = true
                }
            }

            if (!added) {
                val tmp = mutableListOf<Int>()
                tmp.add(ai)
                tmp.add(ai + 1)
                list.add(tmp)
            }
        }
    }

    val printed = mutableMapOf<Int, Int>()
    for (item in list) {
        val printedMax = printed.maxBy { it.key }?.key ?: 0
        if (item.min() != printedMax + 1) {
            for (i in printedMax + 1 until item.min()!!) {
                print("$i ")
                printed[i] = 1
            }
        }
        item.sortDescending()
        for (num in item) {
            print("$num ")
            printed[num] = 1
        }
    }
    val printedMax = printed.maxBy { it.key }?.key ?: 0
    if (printedMax != n) {
        for (i in printedMax + 1..n) {
            print("$i ")
        }
    }
    println()
}

fun solveABC289A() {
    val s = readString()
    println(
        s.replace('0', 'a')
            .replace('1', '0')
            .replace('a', '1')
    )
}