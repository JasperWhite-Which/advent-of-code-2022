package weektwo

// Week 2 - Day 1 == DAY 8
class DayOne {
    fun partOne(list: List<String>): Int {
        val columnsList = list.toColumnsList()

        val totalVisible = getTotalVisible(list, columnsList)
        val outerTotal = getOuterLength(list.size, columnsList.size)

        return totalVisible + outerTotal
    }
    fun partTwo(list: List<String>): Long {
        return 0L
    }

    private fun getOuterLength(width: Int, height: Int): Int {
        return 2 * (width + height)
    }

    private fun isVisible(index: Int, s: String): Boolean {
        val value = s[index].code
//        if ((index == 0 || index == s.length - 1) && value != 0) true
        val maxLeft = s.substring(0, index).toList().map { it.code }.maxOf { it }
        val maxRight = s.substring(index + 1, s.length).toList().map { it.code }.maxOf { it }

        return value > maxLeft || value > maxRight
    }

    private fun getTotalVisible(rowList: List<String>, columnList: List<String>): Int {
        return (1 .. rowList.size - 2).toList().map { rowIndex ->
            (1..columnList.size - 2).toList().map { columnIndex ->
                if (isVisible(rowIndex, rowList[rowIndex]) || isVisible(columnIndex, columnList[columnIndex])) {
                    1
                }else 0
            }
        }.flatten().sum()
    }

    private fun List<String>.toColumnsList(): List<String> {
        val initialList = this.map { row -> (row.indices).toList().map { row[it] } }
        val new = (0 until this.size).map { rowIndex ->
            (0 until initialList[0].size).toList().map { columnIndex -> initialList[columnIndex][rowIndex] }
        }
        return new.map { it.joinToString("") }
    }

}