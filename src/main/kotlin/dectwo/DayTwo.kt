package dectwo

class DayTwo {

    fun partOne(list: List<String>?): Long {
        return list?.sumOf { row ->
            val game = row.split(" ")
            val opponent = Hand.values().toList().first { it.opponentHand == game[0] }
            val player = Hand.values().toList().first { it.playerHand == game[1] }
            val result = getGameResult(opponent, player)

            result.score + player.score
        } ?: 0L
    }

    fun partTwo(list: List<String>?): Long {
        return list?.sumOf { row ->
            val game = row.split(" ")
            val opponent = Hand.values().toList().first { it.opponentHand == game[0] }
            val result = Result.values().toList().first { it.symbol == game[1] }
            val player = getPlayerHand(opponent, result)

            result.score + player.score
        } ?: 0L
    }

    private fun getGameResult(opponent: Hand, player: Hand): Result {
        return when {
            opponent == Hand.ROCK && player == Hand.PAPER -> Result.WIN
            opponent == Hand.PAPER && player == Hand.SCISSORS -> Result.WIN
            opponent == Hand.SCISSORS && player == Hand.ROCK -> Result.WIN
            opponent.name == player.name -> Result.DRAW
            else -> Result.LOSE
        }
    }

    private fun getPlayerHand(opponent: Hand, result: Result): Hand {
        return when {
            result == Result.DRAW -> opponent
            opponent == Hand.ROCK && result == Result.WIN -> Hand.PAPER
            opponent == Hand.PAPER && result == Result.WIN -> Hand.SCISSORS
            opponent == Hand.SCISSORS && result == Result.WIN -> Hand.ROCK
            opponent == Hand.ROCK && result == Result.LOSE -> Hand.SCISSORS
            opponent == Hand.PAPER && result == Result.LOSE -> Hand.ROCK
            opponent == Hand.SCISSORS && result == Result.LOSE -> Hand.PAPER
            else -> throw Exception("Failed to get player hand")
        }
    }

    enum class Hand(val opponentHand: String, val playerHand: String, val score: Long) {
        ROCK("A", "X", 1L),
        PAPER("B", "Y", 2L),
        SCISSORS("C", "Z", 3L)
    }

    enum class Result(val score: Long, val symbol: String) {
        LOSE(0L, "X"),
        DRAW(3L, "Y"),
        WIN(6L, "Z")
    }
}