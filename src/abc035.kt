import kotlin.math.absoluteValue
import kotlin.math.max
import kotlin.math.min

private val reader = System.`in`.bufferedReader()
private fun readString() = reader.readLine()
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
    solveABC035B()
}

fun solveABC035B() {
    val s = readString()
    val t = readInt()

    var xMax = 0
    var yMax = 0
    var xMin = 0
    var yMin = 0

    for (si in s) {
        when (si) {
            'L' -> {
                xMax -= 1
                xMin -= 1
            }
            'R' -> {
                xMax += 1
                xMin += 1
            }
            'U' -> {
                yMax += 1
                yMin += 1
            }
            'D' -> {
                yMax -= 1
                yMin -= 1
            }
        }
    }

    for (si in s) {
        when (si) {
            '?' -> {
                // max
                val tmpMaxL = (xMax - 1).absoluteValue + (yMax).absoluteValue
                val tmpMaxR = (xMax + 1).absoluteValue + (yMax).absoluteValue
                val tmpMaxU = (xMax).absoluteValue + (yMax + 1).absoluteValue
                val tmpMaxD = (xMax).absoluteValue + (yMax - 1).absoluteValue
                when (max(max(tmpMaxL, tmpMaxR), max(tmpMaxU, tmpMaxD))) {
                    tmpMaxL -> xMax -= 1
                    tmpMaxR -> xMax += 1
                    tmpMaxU -> yMax += 1
                    tmpMaxD -> yMax -= 1
                }

                // min
                val tmpMinL = (xMin - 1).absoluteValue + (yMin).absoluteValue
                val tmpMinR = (xMin + 1).absoluteValue + (yMin).absoluteValue
                val tmpMinU = (xMin).absoluteValue + (yMin + 1).absoluteValue
                val tmpMinD = (xMin).absoluteValue + (yMin - 1).absoluteValue
                when (min(min(tmpMinL, tmpMinR), min(tmpMinU, tmpMinD))) {
                    tmpMinL -> xMin -= 1
                    tmpMinR -> xMin += 1
                    tmpMinU -> yMin += 1
                    tmpMinD -> yMin -= 1
                }
            }
        }
    }

    when (t) {
        1 -> println(xMax.absoluteValue + yMax.absoluteValue)
        2 -> println(xMin.absoluteValue + yMin.absoluteValue)
    }
}

fun solveABC035A() {
    val (w, h) = readInts()
    if (w % 16 == 0 && h % 9 == 0) {
        println("16:9")
    } else if (w % 4 == 0 && h % 3 == 0) {
        println("4:3")
    } else {

    }
}