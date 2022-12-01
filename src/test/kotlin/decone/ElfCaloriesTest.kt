package decone

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ElfCaloriesTest {
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

            val result = ElfCalories().getMaxTotal(inputData)
            println("The result is $result")

        }
    }

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

            val result = ElfCalories().getTopThreeTotal(inputData)
            println("The result is $result")
        }
    }

    private fun readFile(filePath: String): List<String>? {
        return this::class.java.classLoader.getResourceAsStream(filePath)?.bufferedReader()?.readLines()
    }
}