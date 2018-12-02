package days

import java.io.File

class Two {
    fun first(input : String) : Int {
        val lines = File(input).readLines()
        val twos = lines.filter { hasExactlyTwo(it) }.size
        val threes = lines.filter { hasExactlyThree(it) }.size
        return twos*threes
    }

    fun hasExactlyTwo(id: String): Boolean {
        val occurrences = id.toCharArray().groupBy { it }
        return !occurrences.filterValues { it.size == 2 }.isEmpty()
    }

    fun hasExactlyThree(id: String): Boolean{
        val occurrences = id.toCharArray().groupBy { it }
        return !occurrences.filterValues { it.size == 3 }.isEmpty()
    }

    fun second(input: String) : List<String>? {
        val lines = File(input).readLines()
        val foundChars = mutableListOf<String>()
        lines.forEachIndexed { index, line ->
            lines.subList(index, lines.size).forEach {
                val matched = matchLines(line, it)
                if (!matched.isNullOrEmpty()) {
                    foundChars.add(matched.joinToString(""))
                }
            }
        }
        return foundChars
    }

    fun matchLines(line1 : String, line2 : String) : List<Char>? {
        val sortedByMatchCharacters = line1.zip(line2).partition {
                pair -> pair.first == pair.second
        }
        return if (sortedByMatchCharacters.second.size == 1) {
            sortedByMatchCharacters.first.map { it.first }
        } else {
            null
        }
    }
}