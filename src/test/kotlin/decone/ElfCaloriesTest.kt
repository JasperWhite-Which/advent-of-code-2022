package decone

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ElfCaloriesTest {

    // Tests for Day 1 Question 1
    @Nested
    inner class GetMaxTotal {
        @Test
        fun `test example case`() {
            val fileName = "dec-one/example.txt"
            val inputData = readFile(fileName)

            val actual = ElfCalories().getMaxTotal(inputData)
            val expected = 24_000L

            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun `test question case`() {
            val fileName = "dec-one/input.txt"
            val inputData = readFile(fileName)

            val actual = ElfCalories().getMaxTotal(inputData)
            println("The result is $actual")
            val expected = 67_450L

            assertThat(actual).isEqualTo(expected)

        }
    }

    // Tests for Day 1 Question 2
    @Nested
    inner class GetTopThreeTotal {
        @Test
        fun `test example case`() {
            val fileName = "dec-one/example.txt"
            val inputData = readFile(fileName)

            val actual = ElfCalories().getTopThreeTotal(inputData)
            val expected = 45_000L

            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun `test question case`() {
            val fileName = "dec-one/input.txt"
            val inputData = readFile(fileName)

            val actual = ElfCalories().getTopThreeTotal(inputData)
            println("The result is $actual")
            val expected = 199_357L

            assertThat(actual).isEqualTo(expected)
        }
    }

    private fun readFile(filePath: String): List<String>? {
        return this::class.java.classLoader.getResourceAsStream(filePath)?.bufferedReader()?.readLines()
    }
}