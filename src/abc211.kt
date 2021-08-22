fun main(args: Array<String>) {
    solveABC211B()
}

fun solveABC211B() {
    val s1 = readLine()!!
    val s2 = readLine()!!
    val s3 = readLine()!!
    val s4 = readLine()!!

    val sExists = mutableMapOf<String, Int>()

    sExists[s1] = 1
    sExists[s2] = 1
    sExists[s3] = 1
    sExists[s4] = 1

    if (sExists.containsKey("H")
        && sExists.containsKey("2B")
        && sExists.containsKey("3B")
        && sExists.containsKey("HR")) {
        println("Yes")
    } else {
        println("No")
    }
}

fun solveABC211A() {
    val (a, b) = readLine()!!.split(" ").map { it.toDouble() }

    println(((a - b) / 3 + b))
}
