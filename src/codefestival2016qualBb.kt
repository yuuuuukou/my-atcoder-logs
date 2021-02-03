fun main(args: Array<String>) {
    solveCodefestival2016QualBB()
}

fun solveCodefestival2016QualBB() {
    // 予選は国内または海外の学生のみが通過することができ、
    // 上位の学生から順に、以下の条件を満たすときに通過します。学生でない参加者は予選を通過できません。

    // 国内の学生は、現在予選の通過が確定した参加者が A + B 人に満たなければ、予選を通過する

    // 海外の学生は、現在予選の通過が確定した参加者が A + B 人に満たず、
    // さらに海外の学生の中での順位が B 位以内なら、予選を通過する

    val (n, a, b) = readLine()!!.split(" ").map { it.toInt() }
    val s = readLine()!!

    var passTotal = 0
    var countB = 0

    for (i in 0 until n) {
        if (s[i].toString() == "a") {
            if (passTotal < (a + b)) {
                println("Yes")
                passTotal++
            } else {
                println("No")
            }
        } else if (s[i].toString() == "b") {
            countB++ // 今のB内の順位
            if (passTotal < (a + b) && countB <= b) {
                println("Yes")
                passTotal++
            } else {
                println("No")
            }
        } else if (s[i].toString() == "c") {
            println("No")
        }
    }
}
