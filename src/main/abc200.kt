fun main(args: Array<String>) {
    solveABC200B()
}

fun solveABC200B() {
    val (n, k) = readLine()!!.split(" ").map { it }

    var result = n

    for (i in 0 until k.toInt()) {
        if (result.toLong() % 200 == 0L) {
            result = (result.toLong() / 200).toString()
        } else {
            result += "200"
        }
    }

    println(result)
}

fun solveABC200A() {
    var n = readLine()!!.toInt()

    var cnt = 1
    while (n > 0) {
       n -= 100
       if (n > 0) {
           cnt++
       }
    }

    println(cnt)
}
