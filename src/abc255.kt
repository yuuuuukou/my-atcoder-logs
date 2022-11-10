import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sqrt

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
    solveABC255B()
}

fun solveABC255B() {
    val (n, k) = readInts()
    val a = readInts()

    data class Person(val no: Int, val x: Int, val y: Int, var distance: Double)

    val list = mutableListOf<Person>()

    for (i in 1..n) {
        val (xi, yi) = readInts()
        val tmpDistance = if (a.contains(i)) 0.0 else Double.MAX_VALUE
        list.add(Person(i, xi, yi, tmpDistance))
    }

    for (person in list) {
        if (person.distance > 0) {
            for (ai in a) {
                val rightPerson = list[ai - 1]
                // あかり持ってる人を全探索して最短距離を導出
                val distance =
                    sqrt((rightPerson.x - person.x).toDouble().pow(2) + (rightPerson.y - person.y).toDouble().pow(2))
                person.distance = min(person.distance, distance)
            }
        }
    }

    println(list.sortedBy { -it.distance }[0].distance)
}

fun solveABC255A() {
    val (r, c) = readInts()
    val (a11, a12) = readInts()
    val (a21, a22) = readInts()
    if (r == 1) {
        if (c == 1) {
            println(a11)
        } else {
            println(a12)
        }
    } else {
        if (c == 1) {
            println(a21)
        } else {
            println(a22)
        }
    }
}