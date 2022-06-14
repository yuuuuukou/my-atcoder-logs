fun main(args: Array<String>) {
    solveABC157B()
}

fun solveABC157B() {
    val (a11, a12, a13) = readLine()!!.split(" ").map { it.toInt() }
    val (a21, a22, a23) = readLine()!!.split(" ").map { it.toInt() }
    val (a31, a32, a33) = readLine()!!.split(" ").map { it.toInt() }
    val n = readLine()!!.toInt()

    val b = mutableMapOf<Int, Boolean>()
    for (i in 0 until n) {
        val bi = readLine()!!.toInt()
        b[bi] = true
    }

    if (// 縦
        b[a11] == true && b[a21] == true && b[a31] == true
        || b[a12] == true && b[a22] == true && b[a32] == true
        || b[a13] == true && b[a23] == true && b[a33] == true
        // 横
        || b[a11] == true && b[a12] == true && b[a13] == true
        || b[a21] == true && b[a22] == true && b[a23] == true
        || b[a31] == true && b[a32] == true && b[a33] == true
        // 斜め
        || b[a11] == true && b[a22] == true && b[a33] == true
        || b[a13] == true && b[a22] == true && b[a31] == true
    ) {
        println("Yes")
    } else {
        println("No")
    }
}