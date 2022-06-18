fun main(args: Array<String>) {
    solveABC102B()
}

fun solveABC102B() {
    /*val n = */readLine()!!
    val a = readLine()!!.split(" ").map { it.toInt() }

    print(a.max()!! - a.min()!!)
}
