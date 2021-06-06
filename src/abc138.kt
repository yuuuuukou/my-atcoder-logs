fun main(args:Array<String>) {
    val n = readLine()!!.toInt()
    val v = readLine()!!.split(" ").map { it.toBigDecimal() }.sorted()

    var before = "0".toBigDecimal()
    for (i in 0 until n) {
        if (i == 0) {
            before = v[i]
            continue
        }

        before = (before + v[i]).divide("2.00000".toBigDecimal())
    }
    println(before)
}