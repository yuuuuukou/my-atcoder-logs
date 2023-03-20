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
    solveTessokuBookB03()
}

fun solveTessokuBookB03() {
    val n = readInt()
    val a = readInts()
    for (i in 0 until n) {
        for (j in 0 until n) {
            for (k in 0 until n) {
                if (i == j || j == k || k == i) continue

                if (a[i] + a[j] + a[k] == 1000) {
                    println("Yes")
                    return
                }
            }
        }
    }
    println("No")
}

fun solveTessokuBookA03() {
    val (n, k) = readInts()
    val p = readInts()
    val q = readInts()

    var res = false
    for (pi in p) {
        for (qi in q) {
            if (pi + qi == k) {
                res = true
            }
        }
    }

    println(if (res) "Yes" else "No")
}

fun solveTessokuBookB02() {
    val (a, b) = readInts()

    var res = false
    for (i in a..b) {
        if (100 % i == 0) {
            res = true
        }
    }

    println(if (res) "Yes" else "No")
}

fun solveTessokuBookA02() {
    val (n, x) = readInts()
    val a = readInts()
    if (a.contains(x)) {
        println("Yes")
    } else {
        println("No")
    }
}

fun solveTessokuBookB01() {
    val (a, b) = readInts()
    println(a + b)
}

fun solveTessokuBookA01() {
    val n = readInt()
    println(n * n)
}
