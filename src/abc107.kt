private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC107B()
}

fun solveABC107B() {
    val (h, w) = readInts()
    val a = mutableListOf<String>()
    repeat(h) {
        a.add(readString())
    }

    var displayRow = mutableListOf<Int>()
    var displayCol = mutableListOf<Int>()
    for (i in 0 until h) {
        if (a[i].contains("#")) {
            displayRow.add(i)
        }
    }
    for (j in 0 until w) {
        var canContinue = true
        for (i in 0 until h) {
            if (a[i][j] == '#') {
                canContinue = false
            }
        }
        if (!canContinue) {
            displayCol.add(j)
        }
    }

    for (i in displayRow) {
        for (j in displayCol) {
            print(a[i][j])
        }
        println()
    }
}

fun solveABC107A() {
    val (n, i) = readInts()
    println(n - i + 1)
}