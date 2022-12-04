package decthree

import TestUtils
import assertk.assertThat
import assertk.assertions.isEqualTo
import dectwo.DayTwo
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class DayThreeTest: TestUtils() {

    // Tests for Day 3 Question 1
    @Nested
    inner class PartOne {
        @Test
        fun example() {
            val fileName = "dec-three/example.txt"
            val inputData = readFile(fileName)

            val actual = DayThree().partOne(inputData)
            val expected = 157L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun question() {
            val fileName = "dec-three/input.txt"
            val inputData = readFile(fileName)

            val actual = DayThree().partOne(inputData)
            val expected = 8018L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
    }

    // Tests for Day 3 Question 2
    @Nested
    inner class PartTwo {
        @Test
        fun example() {
            val fileName = "dec-three/example.txt"
            val inputData = readFile(fileName)

            val actual = DayThree().partTwo(inputData)
            val expected = 70L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
        @Test
        fun question() {
            val fileName = "dec-three/input.txt"
            val inputData = readFile(fileName)

            val actual = DayThree().partTwo(inputData)
            val expected = 2518L
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
    }
}