fun main(args: Array<String>) {
    solveABC144B()
}

private fun solveABC144B() {
    val n = readLine()!!.toInt()

    var result = "No"
    for (i in 1..9) {
        for (j in 1..9) {
            if (i * j == n) {
                result = "Yes"
            }
        }
    }

    println(result)
}