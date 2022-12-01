package decone

class ElfCalories {

    fun getMaxTotal(list: List<String>?): Long {
        val formattedList = formatList(list)
        val sortedList = sortElfCalories(formattedList)

        return sortedList.max()
    }

    fun getTopThreeTotal(list: List<String>?): Long {
        val formattedList = formatList(list)
        val sortedList = sortElfCalories(formattedList)
        val rankedList = sortedList.sortedByDescending { it }
        val top3 = rankedList.subList(0, 3)

        return top3.sum()
    }

    private fun formatList(list: List<String>?): List<Long?> {
        return list?.map {
            if (it.isBlank()) null else it.toLong()
        } ?: emptyList()
    }

    private fun sortElfCalories(list: List<Long?>): MutableList<Long> {
        val newList = mutableListOf(0L)
        var index = 0
        list.forEach {
            if (it == null) {
                index += 1
                newList.add(index, 0L)
            } else {
                newList[index] = newList[index] + it
            }
        }
        return newList
    }

    private fun MutableList<Long>.max(): Long {
        return this.maxOrNull() ?: 0L
    }
}