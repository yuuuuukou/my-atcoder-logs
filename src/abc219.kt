private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC219B()
}

fun solveABC219B() {
    val s1 = readString()
    val s2 = readString()
    val s3 = readString()
    val t = readString()

    val res = StringBuilder()
    for (ti in t) {
        when (ti.toString()) {
            "1" -> res.append(s1)
            "2" -> res.append(s2)
            "3" -> res.append(s3)
        }
    }

    println(res)
}

fun solveABC219A() {
    val x = readInt()
    when (x) {
        in 0 until 40 -> {
            println(40 - x)
        }
        in 40 until 70 -> {
            println(70 - x)
        }
        in 70 until 90 -> {
            println(90 - x)
        }
        in 90..100 -> {
            println("expert")
        }
    }
}