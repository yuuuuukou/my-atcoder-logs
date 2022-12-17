private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC221B()
}

fun solveABC221B() {
    val s = readString()
    val t = readString()

    if (s == t) {
        println("Yes")
        return
    }

    for (i in 0 .. s.length - 2) {
        var tmpString = ""
        if (i != 0) {
            val tmpL = s.substring(0 until i)
            tmpString += tmpL
        }

        val tmpSwapL = s.substring(i..i)
        val tmpSwapR = s.substring(i + 1..i + 1)
        tmpString += tmpSwapR + tmpSwapL

        if (s.length > 3) {
            val tmpR = s.substring(i + 2..s.lastIndex)
            tmpString += tmpR
        }

        if (tmpString == t) {
            println("Yes")
            return
        }
    }

    println("No")
}

fun solveABC221A() {
    val (a, b) = readInts()
    var res = 1
    for (i in b until a) {
        res *= 32
    }
    println(res)
}