package weektwo

import TestUtils
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class DayZeroTest : TestUtils() {
    // Tests for Day 12 Question 1
    @Nested
    inner class PartOne {
        @Test
        fun example() {
            val fileName = "dec-12/example.txt"
            val inputData = readFile(fileName)

            val actual = DayFive().partOne(inputData)
            val expected = 31L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun question() {
            val fileName = "dec-12/input.txt"
            val inputData = readFile(fileName)

            val actual = DayFive().partOne(inputData)
            val expected = 0L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
    }

    // Tests for Day 12 Question 2
    @Nested
    inner class PartTwo {
        @Test
        fun example() {
            val fileName = "dec-12/example.txt"
            val inputData = readFile(fileName)

            val actual = DayFive().partTwo(inputData)
            val expected = 0L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
        @Test
        fun question() {
            val fileName = "dec-12/input.txt"
            val inputData = readFile(fileName)

            val actual = DayFive().partTwo(inputData)
            val expected = 0L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
    }
}