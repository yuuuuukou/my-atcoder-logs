private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC219A()
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