package weekone

import TestUtils
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class DayFiveTest : TestUtils() {
    // Tests for Day 5 Question 1
    @Nested
    inner class PartOne {
        @Test
        fun example() {
            val fileName = "dec-05/example.txt"
            val inputData = readFile(fileName)

            val actual = DayFive().partOne(inputData)
            val expected = "CMZ"
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun question() {
            val fileName = "dec-05/input.txt"
            val inputData = readFile(fileName)

            val actual = DayFive().partOne(inputData)
            val expected = "TGWSMRBPN"
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
    }

    // Tests for Day 5 Question 2
    @Nested
    inner class PartTwo {
        @Test
        fun example() {
            val fileName = "dec-05/example.txt"
            val inputData = readFile(fileName)

            val actual = DayFive().partTwo(inputData)
            val expected = "MCD"
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
        @Test
        fun question() {
            val fileName = "dec-05/input.txt"
            val inputData = readFile(fileName)

            val actual = DayFive().partTwo(inputData)
            val expected = 0L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
    }
}