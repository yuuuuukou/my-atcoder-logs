fun main(args: Array<String>) {
    solveABC088A()
}

fun solveABC088B() {
    /*val n = */readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }

    var aliceSum = 0
    var bobSum = 0

    val sortedA = a.sortedDescending()
    for ((i, ai) in sortedA.withIndex()) {
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