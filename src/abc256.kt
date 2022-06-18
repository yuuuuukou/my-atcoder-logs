fun main(args: Array<String>) {
    solveABC256C()
}

fun solveABC256C() {
    val hw = readLine()!!.split(" ").map { it.toInt() }
    val h1 = hw[0]
    val h2 = hw[1]
    val h3 = hw[2]
    val w1 = hw[3]
    val w2 = hw[4]
    val w3 = hw[5]

    var cnt = 0
    for (r1c1 in 1..h1 - 2) {
        for (r1c2 in 1..h1 - 1) {
            val r1c3 = h1 - r1c1 - r1c2
            for (r2c1 in 1..h2 - 2) {
                for (r2c2 in 1..h2 - 1) {
                    val r2c3 = h2 - r2c1 - r2c2
                    for (r3c1 in 1..h3 - 2) {
                        for (r3c2 in 1..h3 - 1) {
                            val r3c3 = h3 - r3c1 - r3c2

                            if (r1c1 + r1c2 + r1c3 == h1
                                && r2c1 + r2c2 + r2c3 == h2
                                && r3c1 + r3c2 + r3c3 == h3
                                && r1c1 + r2c1 + r3c1 == w1
                                && r1c2 + r2c2 + r3c2 == w2
                                && r1c3 + r2c3 + r3c3 == w3
                                && r1c1 > 0 && r1c2 > 0 && r1c3 > 0
                                && r2c1 > 0 && r2c2 > 0 && r2c3 > 0
                                && r3c1 > 0 && r3c2 > 0 && r3c3 > 0
                            ) {
                                cnt++
                            }
                        }
                    }
                }
            }
        }
    }

    println(cnt)
}

fun solveABC256B() {
    /*val n = */readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }

    val masu = mutableMapOf<Int, Int>()

    for (ai in a) {
        masu[0] = 1

        moveMasu(masu, 3, ai)
        moveMasu(masu, 2, ai)
        moveMasu(masu, 1, ai)
        moveMasu(masu, 0, ai)
    }

    var cnt = 0
    for (item in masu) {
        if (item.key < 4) {
            continue
        } else {
            cnt += item.value
        }
    }

    print(cnt)
}

private fun moveMasu(masu: MutableMap<Int, Int>, targetIndex: Int, move: Int) {
    if (masu.containsKey(targetIndex)) {
        if (masu.containsKey(targetIndex + move)) {
            masu[targetIndex + move] = masu[targetIndex]!! + masu[targetIndex + move]!!
        } else {
            masu[targetIndex + move] = masu[targetIndex]!!
        }
        masu[targetIndex] = 0
    }
}

fun solveABC256A() {
    val n = readLine()!!.toInt()

    var ans = 1
    for (i in 0 until n) {
        ans *= 2
    }

    print(ans)
}