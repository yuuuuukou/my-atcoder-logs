private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC132A()
}

fun solveABC132C() {
    /*val n = */readLine()!!.toInt()
    val dList = readLine()!!.split(" ").map { it.toInt() }.sorted()

    val dx = dList[dList.size / 2 - 1]
    val dy = dList[dList.size / 2]

    println(dy - dx)
}

fun solveABC132A() {
    val s = readLn()
    val map = mutableMapOf<String, Int>()
    for (si in s) {
        map[si.toString()] = (map[si.toString()] ?: 0) + 1
    }

    var flag = true
    for (item in map) {
        if (item.value != 2) {
            flag = false
        }
    }

    if (flag) {
        println("Yes")
    } else {
        println("No")
    }
}