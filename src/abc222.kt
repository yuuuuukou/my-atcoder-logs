private fun readString() = readLine()!!
private fun readStrings() = readString().split(" ").toMutableList()
private fun readInt() = readString().toInt()
private fun readInts() = readString().split(" ").map { it.toInt() }.toMutableList()
private fun readLong() = readString().toLong()
private fun readLongs() = readString().split(" ").map { it.toLong() }.toMutableList()

fun main(args: Array<String>) {
    solveABC222C()
}

fun solveABC222C() {
    val (n, m) = readInts()

    class Person(val no: Int, val te: String, var win: Int)

    val persons = mutableListOf<Person>()
    for (i in 1..2 * n) {
        val ai = readString()
        persons.add(Person(i, ai, 0))
    }

    for (i in 0 until m) {
        // iラウンド
        persons.sortWith(compareBy({ -it.win }, { it.no }))
        for (j in 0 until 2 * n step 2) {
            val p1 = persons[j]
            val p2 = persons[j + 1]
            when (p1.te[i].toString()) {
                "G" -> {
                    when (p2.te[i].toString()) {
                        "G" -> {}
                        "C" -> p1.win++
                        "P" -> p2.win++
                    }
                }
                "C" -> {
                    when (p2.te[i].toString()) {
                        "G" -> p2.win++
                        "C" -> {}
                        "P" -> p1.win++
                    }
                }
                "P" -> {
                    when (p2.te[i].toString()) {
                        "G" -> p1.win++
                        "C" -> p2.win++
                        "P" -> {}
                    }
                }
            }
        }

    }

    // 最終的なランキング
    persons.sortWith(compareBy({ -it.win }, { it.no }))
    for (person in persons) {
        println(person.no)
    }
}

fun solveABC222B() {
    val (n, p) = readInts()
    val a = readInts()

    var res = 0
    for (ai in a) {
        if (ai < p) {
            res++
        }
    }

    println(res)
}

fun solveABC222A() {
    val n = readString()
    println(n.padStart(4, '0'))
}