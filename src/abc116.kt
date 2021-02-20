fun main(args: Array<String>) {
    val s = readLine()!!.toInt()

    val a = mutableMapOf<Int, Int>()
    var before = s
    for (i in 1..1000000) {
        if (i == 1) {
            a[s] = i
            continue
        }

        val f =
                if (before % 2 == 0) {
                    before / 2
                } else {
                    (3 * before) + 1
                }

        if (a.containsKey(f)) {
            println(i)
            break
        } else {
            a[f] = i
        }
        before = f
    }
}