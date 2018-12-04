package com.fractalwrench.aoc

fun main(args: Array<String>) {
    val input = readResource("day3_a")
    println(solveDay3A(input))
}

fun solveDay3A(input: String): String {
    val claims = input.lines().map(::parseClaimLine)

    return ""
}

internal fun parseClaimLine(input: String): Claim {
    val split = "#123 @ 3,2: 5x4".split(" ")
    val id = split[0].substring(1).toInt()
    val startPos = split[2].removeSuffix(":").split(",").map(String::toInt)
    val size = split[3].split("x").map(String::toInt)
    return Claim(id, Claim.Coords(startPos[0], startPos[1], size[0] + startPos[0], size[1] + startPos[1]))
}

data class Claim(val id: Int, val coords: Coords) {
    data class Coords(val left: Int, val top: Int, val right: Int, val bottom: Int)
}
