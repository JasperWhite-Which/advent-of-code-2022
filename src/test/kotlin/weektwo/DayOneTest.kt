package weektwo

import TestUtils
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class DayOneTest : TestUtils() {
    // Tests for Day 8 Question 1
    @Nested
    inner class PartOne {
        @Test
        fun example() {
            val fileName = "dec-08/example.txt"
            val inputData = readFile(fileName)

            val actual = DayOne().partOne(inputData)
            val expected = 21
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun question() {
            val fileName = "dec-08/input.txt"
            val inputData = readFile(fileName)

            val actual = DayOne().partOne(inputData)
            val expected = 0L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
    }

    // Tests for Day 8 Question 2
    @Nested
    inner class PartTwo {
        @Test
        fun example() {
            val fileName = "dec-08/example-01.txt"
            val inputData = readFile(fileName)

            val actual = DayOne().partTwo(inputData)
            val expected = 0L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
        @Test
        fun question() {
            val fileName = "dec-08/input.txt"
            val inputData = readFile(fileName)

            val actual = DayOne().partTwo(inputData)
            val expected = 0L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
    }
}