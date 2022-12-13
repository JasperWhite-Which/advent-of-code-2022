package weektwo

import TestUtils
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class DayThreeTest : TestUtils() {
    // Tests for Day 10 Question 1
    @Nested
    inner class PartOne {
        @Test
        fun example() {
            val fileName = "dec-10/example.txt"
            val inputData = readFile(fileName)

            val actual = DayThree().partOne(inputData)
            val expected = 13_140L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun question() {
            val fileName = "dec-10/input.txt"
            val inputData = readFile(fileName)

            val actual = DayThree().partOne(inputData)
            val expected = 13_680L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
    }

    // Tests for Day 10 Question 2
    @Nested
    inner class PartTwo {
        @Test
        fun example() {
            val fileName = "dec-10/example.txt"
            val inputData = readFile(fileName)

            val actual = DayThree().partTwo(inputData)
            val expected = 0L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
        @Test
        fun question() {
            val fileName = "dec-10/input.txt"
            val inputData = readFile(fileName)

            val actual = DayThree().partTwo(inputData)
            val expected = 0L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
    }
}