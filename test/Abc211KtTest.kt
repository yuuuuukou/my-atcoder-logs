import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert
import org.junit.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTestABC211A {

    @Test
    fun 入力例_1() {
        val input =
            "130 100"
        val output =
            "110"

        assertIO(input, output)
    }

    @Test
    fun 入力例_2() {
        val input =
            "300 50"
        val output =
            "133.3333333"

        assertIO(input, output)
    }

    @Test
    fun 入力例_3() {
        val input =
            "123 123"
        val output =
            "123"

        assertIO(input, output)
    }

    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        solveABC211A()

        Assert.assertThat(sysOut.toString(), equalTo(output + System.lineSeparator()))
    }
}

class MainTestABC211B {

    @Test
    fun 入力例_1() {
        val input =
            "3B" + System.lineSeparator() +
                    "HR" + System.lineSeparator() +
                    "2B" + System.lineSeparator() +
                    "H"
        val output =
            "Yes"

        assertIO(input, output)
    }

    @Test
    fun 入力例_2() {
        val input =
            "2B" + System.lineSeparator() +
                    "3B" + System.lineSeparator() +
                    "HR" + System.lineSeparator() +
                    "3B"
        val output =
            "No"

        assertIO(input, output)
    }

    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        solveABC211B()

        Assert.assertThat(sysOut.toString(), equalTo(output + System.lineSeparator()))
    }
}
