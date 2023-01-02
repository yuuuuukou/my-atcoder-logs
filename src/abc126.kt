private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()
private fun readDouble() = readLn().toDouble()
private fun readDoubles() = readLn().split(" ").map { it.toDouble() }.toMutableList()

fun main(args: Array<String>) {
    solveABC126B()
}

fun solveABC126B() {
    val s = readLn()
    val first = "${s[0]}${s[1]}"
    val second = "${s[2]}${s[3]}"

    if (first in "01" .. "12") {
        // first: yy ok and mm ok
        if (second in "01".. "12") {
            // second: yy ok and mm ok
            println("AMBIGUOUS")
        } else if (second in "00" .. "99") {
            // second: yy ok
            println("MMYY")
        } else {
            println("NA")
        }
    } else if (first in "00" .. "99") {
        // first: yy ok
        if (second in "01".. "12") {
            // second: yy ok and mm ok
            println("YYMM")
        } else if (second in "00" .. "99") {
            // second: yy ok
            println("NA")
        } else {
            println("NA")
        }
    } else {
        println("NA")
    }
}

fun solveABC126A() {
    val (n, k) = readInts()
    val s = readLn()
    if (k == s.length) {
        println(s.substring(0 until k - 1) + s.substring(k - 1..k - 1).toLowerCase())
    } else {
        println(s.substring(0 until k - 1) + s.substring(k - 1..k - 1).toLowerCase() + s.substring(k..s.lastIndex))
    }

}