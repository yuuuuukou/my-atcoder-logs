import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert
import org.junit.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTestABC205A {

    @Test
    fun 入力例_1() {
        val input =
            "45 200"
        val output =
            "90"

        assertIO(input, output)
    }

    @Test
    fun 入力例_2() {
        val input =
            "37 450"
        val output =
            "166.5"

        assertIO(input, output)
    }

    @Test
    fun 入力例_3() {
        val input =
            "0 1000"
        val output =
            "0"

        assertIO(input, output)
    }

    @Test
    fun 入力例_4() {
        val input =
            "50 0"
        val output =
            "0"

        assertIO(input, output)
    }

    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        solveABC205A()

        Assert.assertThat(sysOut.toString(), equalTo(output + System.lineSeparator()))
    }
}

class MainTestABC205B {

    @Test
    fun 入力例_1() {
        val input =
            "5" + System.lineSeparator() +
                    "3 1 2 4 5"
        val output =
            "Yes"

        assertIO(input, output)
    }

    @Test
    fun 入力例_2() {
        val input =
            "6" + System.lineSeparator() +
                    "3 1 4 1 5 2"
        val output =
            "No"

        assertIO(input, output)
    }

    @Test
    fun 入力例_3() {
        val input =
            "3" + System.lineSeparator() +
                    "1 2 3"
        val output =
            "Yes"

        assertIO(input, output)
    }

    @Test
    fun 入力例_4() {
        val input =
            "1" + System.lineSeparator() +
                    "1"
        val output =
            "Yes"

        assertIO(input, output)
    }

    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        solveABC205B()

        Assert.assertThat(sysOut.toString(), equalTo(output + System.lineSeparator()))
    }
}

class MainTestABC205C {

    @Test
    fun 入力例_1() {
        val input =
            "3 2 4"
        val output =
            ">"

        assertIO(input, output)
    }

    @Test
    fun 入力例_2() {
        val input =
            "-7 7 2"
        val output =
            "="

        assertIO(input, output)
    }

    @Test
    fun 入力例_3() {
        val input =
            "-8 6 3"
        val output =
            "<"

        assertIO(input, output)
    }

    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        solveABC205C()

        Assert.assertThat(sysOut.toString(), equalTo(output + System.lineSeparator()))
    }
}

class MainTestABC205D {

    @Test
    fun 入力例_1() {
        val input =
            "4 3" + System.lineSeparator() +
                    "3 5 6 7" + System.lineSeparator() +
                    "2" + System.lineSeparator() +
                    "5" + System.lineSeparator() +
                    "3"
        val output =
            "2" + System.lineSeparator() +
                    "9" + System.lineSeparator() +
                    "4"

        assertIO(input, output)
    }

    @Test
    fun 入力例_2() {
        val input =
            "5 2" + System.lineSeparator() +
                    "1 2 3 4 5" + System.lineSeparator() +
                    "1" + System.lineSeparator() +
                    "10"
        val output =
            "6" + System.lineSeparator() +
                    "15"

        assertIO(input, output)
    }

    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        solveABC205D()

        Assert.assertThat(sysOut.toString(), equalTo(output + System.lineSeparator()))
    }
}
