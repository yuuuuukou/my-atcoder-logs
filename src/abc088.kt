fun main(args: Array<String>) {
    solveABC088C()
}

fun solveABC088C() {
    val (c11, c12, c13) = readLine()!!.split(" ").map { it.toInt() }
    val (c21, c22, c23) = readLine()!!.split(" ").map { it.toInt() }
    val (c31, c32, c33) = readLine()!!.split(" ").map { it.toInt() }

    // ベースの等式
    // c11 = a1 + b1 , c12 = a1 + b2 , c13 = a1 + b3
    // c21 = a2 + b1 , c22 = a2 + b2 , c23 = a2 + b3
    // c31 = a3 + b1 , c32 = a3 + b2 , c33 = a3 + b3

    // c11,c12から式変形
    // a1 = b1 - c11 , a1 = b2 - c12 -> b1 = b2 - c12 + c11
    // c21,c22から式変形
    // a2 = b1 - c21 , a2 = b2 - c22 -> b1 = b2 - c22 + c21

    // さらに変形
    // -> b2 - c12 + c11 = b2 - c22 + c21
    // -> c11 == c21 + c12 - c22
    //    起点 == 下 + 右 - 右下？ 全項目が含まれるようにc11,c12,c21,c22を起点にしてみる
    if (
        c11 == c21 + c12 - c22
        && c12 == c22 + c13 - c23
        && c21 == c31 + c22 - c32
        && c22 == c23 + c32 - c33
    ) {
        println("Yes")
    } else {
        println("No")
    }
}

fun solveABC088B() {
    /* val n = */readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }

    var aliceSum = 0
    var bobSum = 0
    for ((i, ai) in a.sortedDescending().withIndex()) {
        if (i % 2 == 0) {
            aliceSum += ai
        } else {
            bobSum += ai
        }
    }
    println(aliceSum - bobSum)
}

fun solveABC088A() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.toInt()

    if ((n % 500) <= a) {
        println("Yes")
    } else {
        println("No")
    }
}