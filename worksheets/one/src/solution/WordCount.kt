package solution

object WordCount {

    fun phrase(phrase: String): Map<String, Int> {
        val withoutPunctuation = phrase.toLowerCase().replace(Regex("[^\\w']"), " ").trim()

        val words = withoutPunctuation.split(Regex("\\s+"))

        val unquotedWords = words.map { word -> word.trim('\'') }

        val groupedWords = unquotedWords.groupBy { w -> w }

        return groupedWords.mapValues { it.value.size }
    }
}