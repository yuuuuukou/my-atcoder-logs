private fun readString() = readLine()!!
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
    solveABC244B()
}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

fun solveABC244B() {
    /*val n = */readInt()
    val t = readString()

    var (x, y) = 0 to 0
    var direction = Direction.EAST
    for (ti in t) {
        if (ti.toString() == "S") {
            when (direction) {
                Direction.EAST -> x += 1
                Direction.SOUTH -> y -= 1
                Direction.WEST -> x -= 1
                Direction.NORTH -> y += 1
            }
        }
        if (ti.toString() == "R") {
            direction = when (direction) {
                Direction.EAST -> Direction.SOUTH
                Direction.SOUTH -> Direction.WEST
                Direction.WEST -> Direction.NORTH
                Direction.NORTH -> Direction.EAST
            }
        }
    }
    println("$x $y")
}

fun solveABC244A() {
    /*val n = */readInt()
    val s = readString()

    println(s[s.lastIndex])
}