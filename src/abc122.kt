private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC122A()
}

fun solveABC122B() {
    val s = readLine()!!

    var result = ""
    for (i in s.indices) {
        var tmpStr = ""

        for (j in i until s.length) {
            val current = s[j].toString()
            if (current == "A" || current == "C" || current == "G" || current == "T") {
                tmpStr += current
            } else {
                break
            }
        }

        if (tmpStr.length > result.length) {
            result = tmpStr
        }
    }

    println(result.length)
}

fun solveABC122A() {
    val b = readLn()
    if (b == "A") {
        println("T")
    } else if (b == "T") {
        println("A")
    } else if (b == "C") {
        println("G")
    } else if (b == "G") {
        println("C")
    }
}