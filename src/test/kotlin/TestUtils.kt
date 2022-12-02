
open class TestUtils {
    fun readFile(filePath: String): List<String>? {
        return this::class.java.classLoader.getResourceAsStream(filePath)?.bufferedReader()?.readLines()
    }
}