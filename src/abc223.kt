private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC223B()
}

fun solveABC223B() {
    var s = readString()

    val ss = mutableListOf<String>()

    if (s.length == 1) {
        println(s)
        println(s)
        return
    }

    repeat(s.length) {
        ss.add(s)
        s = "${s.substring(1..s.lastIndex)}${s.substring(0..0)}"
    }

    println(ss.min())
    println(ss.max())
}

fun solveABC223A() {
    val x = readInt()
    if (x == 0) {
        println("No")
    } else {
        if (x % 100 == 0) {
            println("Yes")
        } else {
            println("No")
        }
    }
}