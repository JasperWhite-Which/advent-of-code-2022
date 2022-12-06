package weekone

class DaySix {

    fun partOne(s: String): Int {
        val subStringSize = 4
        return getStartIndex(s, subStringSize)
    }

    fun partTwo(s: String): Int {
        val subStringSize = 14
        return getStartIndex(s, subStringSize)
    }

    private fun getStartIndex(s: String, subStringSize: Int): Int {
        return (subStringSize .. s.length).toList().first { isUniqueSubString(s, it, subStringSize) }
    }

    private fun isUniqueSubString(s: String, i: Int, subStringSize: Int): Boolean {
        val subString = s.substring(i - subStringSize, i)
        val size: Int = subString.toList().toSet().size
        return size == subStringSize
    }
}