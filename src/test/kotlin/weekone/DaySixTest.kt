package weekone

import TestUtils
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class DaySixTest : TestUtils() {
    // Tests for Day 6 Question 1
    @Nested
    inner class PartOne {

        @Test
        fun `example one`() {
            val fileName = "dec-06/example-01.txt"
            val inputData = readFile(fileName).first()

            val actual = DaySix().partOne(inputData)
            val expected = 7
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
        @Test
        fun `example two`() {
            val fileName = "dec-06/example-02.txt"
            val inputData = readFile(fileName).first()

            val actual = DaySix().partOne(inputData)
            val expected = 5
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
        @Test
        fun `example three`() {
            val fileName = "dec-06/example-03.txt"
            val inputData = readFile(fileName).first()

            val actual = DaySix().partOne(inputData)
            val expected = 6
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
        @Test
        fun `example four`() {
            val fileName = "dec-06/example-04.txt"
            val inputData = readFile(fileName).first()

            val actual = DaySix().partOne(inputData)
            val expected = 10
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
        @Test
        fun `example five`() {
            val fileName = "dec-06/example-05.txt"
            val inputData = readFile(fileName).first()

            val actual = DaySix().partOne(inputData)
            val expected = 11
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun question() {
            val fileName = "dec-06/input.txt"
            val inputData = readFile(fileName).first()

            val actual = DaySix().partOne(inputData)
            val expected = 1920
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
    }

    // Tests for Day 6 Question 2
    @Nested
    inner class PartTwo {

        @Test
        fun `example one`() {
            val fileName = "dec-06/example-01.txt"
            val inputData = readFile(fileName).first()

            val actual = DaySix().partTwo(inputData)
            val expected = 19
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun `example two`() {
            val fileName = "dec-06/example-02.txt"
            val inputData = readFile(fileName).first()

            val actual = DaySix().partTwo(inputData)
            val expected = 23
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun `example three`() {
            val fileName = "dec-06/example-03.txt"
            val inputData = readFile(fileName).first()

            val actual = DaySix().partTwo(inputData)
            val expected = 23
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun `example four`() {
            val fileName = "dec-06/example-04.txt"
            val inputData = readFile(fileName).first()

            val actual = DaySix().partTwo(inputData)
            val expected = 29
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun `example five`() {
            val fileName = "dec-06/example-05.txt"
            val inputData = readFile(fileName).first()

            val actual = DaySix().partTwo(inputData)
            val expected = 26
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }

        @Test
        fun question() {
            val fileName = "dec-06/input.txt"
            val inputData = readFile(fileName).first()

            val actual = DaySix().partTwo(inputData)
            val expected = 2334
            println("The result is $actual")

            assertThat(actual).isEqualTo(expected)
        }
    }
}