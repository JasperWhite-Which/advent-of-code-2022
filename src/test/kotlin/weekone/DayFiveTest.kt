package weekone

import TestUtils
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import weekone.DayFive

class DayFiveTest : TestUtils() {
    // Tests for Day 5 Question 1
    @Nested
    inner class PartOne {
        @Test
        fun example() {
            val fileName = "dec-five/example.txt"
            val inputData = readFile(fileName)

            val actual = DayFive().partOne(inputData)
            val expected = 0L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun question() {
            val fileName = "dec-five/input.txt"
            val inputData = readFile(fileName)

            val actual = DayFive().partOne(inputData)
            val expected = 0L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
    }

    // Tests for Day 5 Question 2
    @Nested
    inner class PartTwo {
        @Test
        fun example() {
            val fileName = "dec-five/example.txt"
            val inputData = readFile(fileName)

            val actual = DayFive().partTwo(inputData)
            val expected = 0L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
        @Test
        fun question() {
            val fileName = "dec-five/input.txt"
            val inputData = readFile(fileName)

            val actual = DayFive().partTwo(inputData)
            val expected = 0L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
    }
}