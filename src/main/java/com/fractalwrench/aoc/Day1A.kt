package com.fractalwrench.aoc

fun main(args: Array<String>) {
    val input = readResource("day1_a")
    println(solveDay1A(input))
}

fun solveDay1A(input: String) = input.lines().map { it.toInt() }.sum()
