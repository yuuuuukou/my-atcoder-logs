fun main(args: Array<String>) {
    solveAGC012A()
}

fun solveAGC012A() {
    val n = readLine()!!.toLong()
    val a = readLine()!!.split(" ").map { it.toLong() }

    val aDesc = a.sortedDescending()
    var res = 0L
    for ((i, ai) in aDesc.withIndex()) {
        // 0,1,2番目を1チーム
        // 3,4,5番目を2チーム
        // :
        // 偶数,奇数番目をnチーム
        // -> 降順ソートの奇数番目をカウントしていく
        //    カウントは2n-1番目まで
        //    (2n番目からは3人目のアサインになるのでカウントをやめる)
        if (i % 2 != 0 && i < 2 * n) {
            res += ai
        }
    }

    println(res)
}
