import kotlin.math.roundToInt

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC082A()
}

fun solveABC082B() {
    val s = readLine()!!.toList().sorted()
    val t = readLine()!!.toList().sortedDescending()

    val list = mutableListOf<String>()

    var sSorted = ""
    for (si in s) {
        sSorted += si
    }
    list.add(sSorted)

    var tSorted = ""
    for (ti in t) {
        tSorted += ti
    }
    list.add(tSorted)

    if (list[0] == list[1]) {
        println("No")
    } else {
        if (list.sorted()[0] == list[0]) {
            println("Yes")
        } else {
            println("No")
        }
    }
}

fun solveABC082A() {
    val (a, b) = readInts()

    println(((a + b).toDouble() / 2).roundToInt())
}