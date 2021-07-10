import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert
import org.junit.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTestABC209A {

    @Test
    fun 入力例_1() {
        val input =
            "2 4"
        val output =
            "3"

        assertIO(input, output)
    }

    @Test
    fun 入力例_2() {
        val input =
            "10 100"
        val output =
            "91"

        assertIO(input, output)
    }

    @Test
    fun 入力例_3() {
        val input =
            "3 2"
        val output =
            "0"

        assertIO(input, output)
    }

    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        solveABC209A()

        Assert.assertThat(sysOut.toString(), equalTo(output + System.lineSeparator()))
    }
}

class MainTestABC209B {

    @Test
    fun 入力例_1() {
        val input =
            "2 3" + System.lineSeparator() +
                    "1 3"
        val output =
            "Yes"

        assertIO(input, output)
    }

    @Test
    fun 入力例_2() {
        val input =
            "4 10" + System.lineSeparator() +
                    "3 3 4 4"
        val output =
            "No"

        assertIO(input, output)
    }

    @Test
    fun 入力例_3() {
        val input =
            "8 30" + System.lineSeparator() +
                    "3 1 4 1 5 9 2 6"
        val output =
            "Yes"

        assertIO(input, output)
    }

    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        solveABC209B()

        Assert.assertThat(sysOut.toString(), equalTo(output + System.lineSeparator()))
    }
}

class MainTestABC209C {

    @Test
    fun 入力例_1() {
        val input =
            "2" + System.lineSeparator() +
                    "1 3"
        val output =
            "2"

        assertIO(input, output)
    }

    @Test
    fun 入力例_2() {
        val input =
            "4" + System.lineSeparator() +
                    "3 3 4 4"
        val output =
            "12"

        assertIO(input, output)
    }

    @Test
    fun 入力例_3() {
        val input =
            "2" + System.lineSeparator() +
                    "1 1"
        val output =
            "0"

        assertIO(input, output)
    }

    @Test
    fun 入力例_4() {
        val input =
            "10" + System.lineSeparator() +
                    "999999917 999999914 999999923 999999985 999999907 999999965 999999914 999999908 999999951 999999979"
        val output =
            "405924645"

        assertIO(input, output)
    }

    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        solveABC209C()

        Assert.assertThat(sysOut.toString(), equalTo(output + System.lineSeparator()))
    }
}
