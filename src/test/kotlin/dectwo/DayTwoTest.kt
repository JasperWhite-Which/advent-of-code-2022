package dectwo

import TestUtils
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class DayTwoTest : TestUtils() {

    // Tests for Day 2 Question 1
    @Nested
    inner class PartOne {
        @Test
        fun example() {
            val fileName = "dec-two/example.txt"
            val inputData = readFile(fileName)

            val actual = DayTwo().partOne(inputData)
            val expected = 15L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun question() {
            val fileName = "dec-two/input.txt"
            val inputData = readFile(fileName)

            val actual = DayTwo().partOne(inputData)
            val expected = 12_645L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
    }

    // Tests for Day 2 Question 2
    @Nested
    inner class PartTwo {
        @Test
        fun example() {
            val fileName = "dec-two/example.txt"
            val inputData = readFile(fileName)

            val actual = DayTwo().partTwo(inputData)
            val expected = 12L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun question() {
            val fileName = "dec-two/input.txt"
            val inputData = readFile(fileName)

            val actual = DayTwo().partTwo(inputData)
            val expected = 11_756L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
    }
}