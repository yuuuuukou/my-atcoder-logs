import kotlin.system.exitProcess

fun main(args: Array<String>) {
    var (a, b, c) = readLine()!!.split(" ").map { it.toLong() }

    var cnt = 0
    while (a % 2 == 0L && b % 2 == 0L && c % 2 == 0L) {
        val halfA = a / 2
        val halfB = b / 2
        val halfC = c / 2

        if (a == halfB + halfC
                && b == halfA + halfC
                && c == halfA + halfB) {
            println("-1")
            exitProcess(0)
        }

        a = halfB + halfC
        b = halfA + halfC
        c = halfA + halfB
        cnt++
    }

    println(cnt)

}