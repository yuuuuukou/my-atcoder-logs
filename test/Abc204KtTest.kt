import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert
import org.junit.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class MainTest {

    @Test
    fun `solveABC204A 入力例 1`() {
        val input =
            "0 1"
        val output =
            "2"

        assertIO(input, output)
    }

    @Test
    fun `solveABC204A 入力例 2`() {
        val input =
            "0 0"
        val output =
            "0"

        assertIO(input, output)
    }

    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        solveABC204A()

        Assert.assertThat(sysOut.toString(), equalTo(output + System.lineSeparator()))
    }
}
