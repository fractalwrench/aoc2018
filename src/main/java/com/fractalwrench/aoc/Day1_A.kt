package com.fractalwrench.aoc

fun main(args: Array<String>) {
    val input = readResource("day1_a")
    val freq = input.lines().map { it.toInt() }.sum()
    println(freq)
}
