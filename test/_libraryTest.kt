import org.junit.Test

import org.junit.Assert.*

class _libraryTest {

    @Test
    fun nextPermutation_1_2_3_4_5() {
        val list = mutableListOf(1, 2, 3, 4, 5)
        val expected = mutableListOf(1, 2, 3, 5, 4)

        val boolExpected = true
        val boolActual = _library().nextPermutation(list)

        assertEquals(boolExpected, boolActual)
        assertEquals(expected, list)
    }

    @Test
    fun nextPermutation_1_5_4_3_2() {
        val list = mutableListOf(1, 5, 4, 3, 2)
        val expected = mutableListOf(2, 1, 3, 4, 5)

        val boolExpected = true
        val boolActual = _library().nextPermutation(list)

        assertEquals(boolExpected, boolActual)
        assertEquals(expected, list)
    }
}