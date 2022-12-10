package weektwo

import TestUtils
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class DayTwoTest : TestUtils() {
    // Tests for Day 9 Question 1
    @Nested
    inner class PartOne {
        @Test
        fun example() {
            val fileName = "dec-09/example.txt"
            val inputData = readFile(fileName)

            val actual = DayTwo().partOne(inputData)
            val expected = 13
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun question() {
            val fileName = "dec-09/input.txt"
            val inputData = readFile(fileName)

            val actual = DayTwo().partOne(inputData)
            val expected = 6406
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
    }

    // Tests for Day 9 Question 2
    @Nested
    inner class PartTwo {
        @Test
        fun example() {
            val fileName = "dec-09/example.txt"
            val inputData = readFile(fileName)

            val actual = DayTwo().partTwo(inputData)
            val expected = 0L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
        @Test
        fun question() {
            val fileName = "dec-09/input.txt"
            val inputData = readFile(fileName)

            val actual = DayTwo().partTwo(inputData)
            val expected = 0L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
    }
}