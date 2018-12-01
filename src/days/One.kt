package days

import java.io.File

class One {

    fun first(inputfile: String): Int {
        val lines = File(inputfile).readLines()
        return lines.sumBy { it.toInt() }
    }

    fun second(inputfile: String): Int {
        val lines = File(inputfile).readLines()
        val foundFrequencies = mutableListOf<Int>()
        var currentFrequency = 0
        while(true) {
            lines.forEach {
                currentFrequency += it.toInt()
                if (foundFrequencies.contains(currentFrequency)) {
                    println("found it!")
                    return currentFrequency
                }
                else foundFrequencies.add(currentFrequency)
            }
        }
    }
}

