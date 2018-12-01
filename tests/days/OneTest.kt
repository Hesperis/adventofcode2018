package days

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class OneTest {
    @Test
    fun `running with test input 1`() {
        assertEquals(3, One().first("input/one/firsttest.txt"))
    }

    @Test
    fun `running with test input 2`() {
        assertEquals(0, One().first("input/one/secondtest.txt"))
    }

    @Test
    fun `running with test input 3`() {
        assertEquals(-6, One().first("input/one/thirdtest.txt"))
    }

    @Test
    fun `find the number`() {
        val result = One().first("input/one/realinputfirst.txt")
        println("The real result of the first problem is $result")
        assert(true)
    }

    @Test
    fun `testing frequency function with input 2`() {
        assertEquals(0, One().second("input/one/secondtest.txt"))
    }

    @Test
    fun `testing frequency function with input 4`() {
        assertEquals(10, One().second("input/one/fourthtest.txt"))
    }

    @Test
    fun `find the real recurring frequency`() {
        val result = One().second("input/one/realinputfirst.txt")
        println("The real result of the second problem is $result")
        assert(true)
    }
}

