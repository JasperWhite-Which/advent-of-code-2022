package weekone

import TestUtils
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import weekone.DayFour

class DayFourTest: TestUtils() {
    // Tests for Day 4 Question 1
    @Nested
    inner class PartOne {
        @Test
        fun example() {
            val fileName = "dec-04/example.txt"
            val inputData = readFile(fileName)

            val actual = DayFour().partOne(inputData)
            val expected = 2L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun question() {
            val fileName = "dec-04/input.txt"
            val inputData = readFile(fileName)

            val actual = DayFour().partOne(inputData)
            val expected = 582L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
    }

    // Tests for Day 4 Question 2
    @Nested
    inner class PartTwo {
        @Test
        fun example() {
            val fileName = "dec-04/example.txt"
            val inputData = readFile(fileName)

            val actual = DayFour().partTwo(inputData)
            val expected = 4L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
        @Test
        fun question() {
            val fileName = "dec-04/input.txt"
            val inputData = readFile(fileName)

            val actual = DayFour().partTwo(inputData)
            val expected = 893L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
    }
}