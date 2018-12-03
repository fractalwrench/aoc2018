package com.fractalwrench.aoc

fun main(args: Array<String>) {
    val input = readResource("day1_a")
    println(solveDay1B(input))
}

fun solveDay1B(input: String): Int {
    val frequencies = input.lines().map(String::toInt)
    val observedFrequencies = mutableSetOf<Int>()
    var currentFreq = 0

    while (!observedFrequencies.contains(currentFreq)) {
        for (it in frequencies) {
            if (observedFrequencies.contains(currentFreq)) {
                break
            } else {
                observedFrequencies.add(currentFreq)
            }
            currentFreq += it
        }
    }
    return currentFreq
}
