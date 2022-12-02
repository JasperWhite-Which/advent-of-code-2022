package decone

import TestUtils
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class DayOneTest: TestUtils() {

    // Tests for Day 1 Question 1
    @Nested
    inner class PartOne {
        @Test
        fun `test example case`() {
            val fileName = "dec-one/example.txt"
            val inputData = readFile(fileName)

            val actual = DayOne().partOne(inputData)
            val expected = 24_000L

            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun `test question case`() {
            val fileName = "dec-one/input.txt"
            val inputData = readFile(fileName)

            val actual = DayOne().partOne(inputData)
            println("The result is $actual")
            val expected = 67_450L

            assertThat(actual).isEqualTo(expected)

        }
    }

    // Tests for Day 1 Question 2
    @Nested
    inner class PartTwo {
        @Test
        fun `test example case`() {
            val fileName = "dec-one/example.txt"
            val inputData = readFile(fileName)

            val actual = DayOne().partTwo(inputData)
            val expected = 45_000L

            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun `test question case`() {
            val fileName = "dec-one/input.txt"
            val inputData = readFile(fileName)

            val actual = DayOne().partTwo(inputData)
            println("The result is $actual")
            val expected = 199_357L

            assertThat(actual).isEqualTo(expected)
        }
    }
}