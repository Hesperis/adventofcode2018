package days

import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class TwoTest {

    @Test
    fun `can find the strings that contains exactly two of any letter`() {
        val linesWithTwo = File("input/two/firsttest.txt").readLines().filter { Two().hasExactlyTwo(it) }
        assertEquals(listOf("bababc", "abbcde", "aabcdd", "abcdee"), linesWithTwo)
    }

    @Test
    fun `can find the strings that contains exactly three of any letter`() {
        val linesWithThree = File("input/two/firsttest.txt").readLines().filter { Two().hasExactlyThree(it) }
        assertEquals(listOf("bababc", "abcccd", "ababab"), linesWithThree)
    }

    @Test
    fun `can find correct checksum for testinput`() {
        val checksum = Two().first("input/two/firsttest.txt")
        assertEquals(12, checksum)
    }

    @Test
    fun `can find correct checksum for actual input`() {
        val checksum = Two().first("input/two/realinput.txt")
        println("The real checksum is $checksum")
        assert(true)
    }

    @Test
    fun `can call the second function with test data`() {
        val result = Two().second("input/two/secondtest.txt")
        assertNotNull(result)
        print(result)
    }

    @Test
    fun `returns true if two lines match barring one letter`() {
        assertEquals("fgij".toList(), Two().matchLines("fghij", "fguij"))
    }

    @Test
    fun `can call the second function with real data`() {
        val result = Two().second("input/two/realinput.txt")
        assertNotNull(result)
        print("The second result is $result")
    }
}