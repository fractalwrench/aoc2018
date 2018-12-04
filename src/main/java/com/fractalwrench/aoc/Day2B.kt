package com.fractalwrench.aoc

fun main(args: Array<String>) {
    val input = readResource("day2_a")
    println(solveDay2B(input))
}

fun solveDay2B(input: String): String? {
    val barcodeIds = input.lines().sorted()

    for ((index, line) in barcodeIds.withIndex()) {
        for (k in index + 1 until barcodeIds.size) {
            val other = barcodeIds[k]
            val similarity = removeNonMatchingChars(line.toCharArray(), other.toCharArray())

            if (similarity.size == other.length - 1) {
                return String(similarity)
            }
        }
    }
    return null
}

internal fun removeNonMatchingChars(first: CharArray, second: CharArray) =
    first.filterIndexed { index, c -> c == second[index] }.toCharArray()

