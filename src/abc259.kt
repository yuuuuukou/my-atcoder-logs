import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

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
    solveABC259B()
}

fun solveABC259B() {
    val (a, b, d) = readInts()

    // (x, y) を Θ回転させた点の座標(x', y')
    // ref: https://mathwords.net/heimenkaiten
    // ref: https://methodology.site/rotation-about-a-point/2/
    //   x'       cosΘ -sinΘ     x
    // (    ) = (            ) (   )
    //   y'       sinΘ  cosΘ     y

    // 度 -> Θ
    // ref: https://www.peko-step.com/tool/tfrad.html
    val theta = d.toDouble() * PI / 180

    val xDash = cos(theta) * a - sin(theta) * b
    val yDash = sin(theta) * a + cos(theta) * b

    println("$xDash $yDash")
}

fun solveABC259A() {
    // n歳で t cm
    // x歳までは d cm/年 ずつ伸びた
    // x .. n歳は伸びてない
    // ではm歳の時は？
    val (n, m, x, t, d) = readInts()
    if (m >= x) {
        // x歳以降であればtcm
        println(t)
    } else {
        // d * 年数 cm小さいはず
        println(t - (d * (x - m)))
    }
}