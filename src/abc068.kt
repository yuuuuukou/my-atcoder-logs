import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    var result = 2

    if (n == 1) {
        println("1")
        exitProcess(0)
    }

    while (n > result) {
        result *= 2
    }

    if (n < result) {
        result /= 2
    }

    println(result)
}