package decone

class ElfCalories {

    fun getMaxTotal(list: List<String>?): Long {
        val formattedList = format(list)

        return formattedList.first()
    }

    fun getTopThreeTotal(list: List<String>?): Long {
        val formattedList = format(list)

        return formattedList.subList(0, 3).sum()
    }

    private fun format(list: List<String>?): List<Long> {
        val newList = mutableListOf(0L)
        var index = 0
        list?.forEach {
            if (it.isBlank()) {
                index += 1
                newList.add(index, 0L)
            } else {
                newList[index] = newList[index] + it.toLong()
            }
        }
        return newList.toList().sortedByDescending { it }
    }

}