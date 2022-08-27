import java.math.RoundingMode
import kotlin.math.pow
import kotlin.math.sqrt

private fun readLn() = readLine()!!
private fun readStrings() = readLn().split(" ").toMutableList()
private fun readInt() = readLn().toInt()
private fun readInts() = readLn().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readLn().toLong()
private fun readLongs() = readLn().split(" ").map { it.toLong() }.toMutableList()

private fun readIntsPlus100() = readLn().split(" ").map { it.toInt() + 100 }.toMutableList()

fun main(args: Array<String>) {
    solveABC266C()
}

fun solveABC266C() {
    val (ax, ay) = readIntsPlus100()
    val (bx, by) = readIntsPlus100()
    val (cx, cy) = readIntsPlus100()
    val (dx, dy) = readIntsPlus100()

    // abの距離
    val ab = sqrt((bx.toDouble() - ax.toDouble()).pow(2.0) + (by.toDouble() - ay.toDouble()).pow(2.0))
    val bc = sqrt((cx.toDouble() - bx.toDouble()).pow(2.0) + (cy.toDouble() - by.toDouble()).pow(2.0))
    val cd = sqrt((dx.toDouble() - cx.toDouble()).pow(2.0) + (dy.toDouble() - cy.toDouble()).pow(2.0))
    val da = sqrt((ax.toDouble() - dx.toDouble()).pow(2.0) + (ay.toDouble() - dy.toDouble()).pow(2.0))

    // 対角線
    val ac = sqrt((cx.toDouble() - ax.toDouble()).pow(2.0) + (cy.toDouble() - ay.toDouble()).pow(2.0))
    val bd = sqrt((dx.toDouble() - bx.toDouble()).pow(2.0) + (dy.toDouble() - by.toDouble()).pow(2.0))

    var isRectangle = true

    if (ab == bc && bc == cd && cd == da) {

    } else {
        isRectangle = false
    }

    if (bc / ab == cd / bc && cd / bc == da / cd && da / cd == ab / da) {

    } else {
        isRectangle = false
    }

    val acBD = ac.toString().toBigDecimal().setScale(10, RoundingMode.FLOOR)
    val bdBD = bd.toString().toBigDecimal().setScale(10, RoundingMode.FLOOR)

    if (acBD == bdBD) {
        val root2 = sqrt(2.0).toString().toBigDecimal().setScale(10, RoundingMode.FLOOR)
        if (root2 % acBD == 0.toBigDecimal().setScale(10, RoundingMode.FLOOR)) {
        } else {
            isRectangle = false
        }
    } else {
        isRectangle = false
    }

    if (isRectangle) {
        println("Yes")
    } else {
        println("No")
    }
}

fun solveABC266B() {
    val n = readLong()

    val key = 998244353

    if (n >= 0L) {
        println(n % key)
    } else {
        if (n % key == 0L) {
            println(0)
        } else {
            println(key + n % key)
        }
    }
}

fun solveABC266A() {
    val s = readLn()
    println(s[s.length / 2])
}
