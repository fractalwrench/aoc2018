package com.fractalwrench.aoc

fun main(args: Array<String>) {
    val input = readResource("day2_a")
    println(solveDay2A(input))
}

fun solveDay2A(input: String): Int {
    val lines = input.lines()
    val twoletterCount = lines.count { hasExactlyNLetters(it, 2) }
    val threeletterCount = lines.count { hasExactlyNLetters(it, 3) }
    return twoletterCount * threeletterCount
}

fun hasExactlyNLetters(str: String, count: Int): Boolean {
    return str.toCharArray()
        .groupBy { it }
        .filter { it.value.size == count }
        .isNotEmpty()
}


