package com.fractalwrench.aoc

fun main(args: Array<String>) {
    val input = readResource("day3_a")
    println(solveDay3A(input))
}

fun solveDay3A(input: String): Int {
    val claims = input.lines().map(::parseClaimLine)
    val matrix = generateEmptyMatrix(claims)

    claims.forEach {
        mutateMatrix(matrix, it.coords)
    }

    return matrix.map { row -> row.count { it > 1 } }.sum()
}

private fun mutateMatrix(matrix: Array<Array<Int>>, coords: Claim.Coords) {
    for (k in coords.top until coords.bottom) {
        for (n in coords.left until coords.right) {
            matrix[k][n]++
        }
    }
}

private fun generateEmptyMatrix(claims: List<Claim>): Array<Array<Int>> {
    val maxRight = claims.map { it.coords.right }.max()!!
    val maxBottom = claims.map { it.coords.bottom }.max()!!
    return Array(maxBottom) { Array(maxRight) { 0 } }
}

internal fun parseClaimLine(input: String): Claim {
    val split = input.split(" ")
    val id = split[0].substring(1).toInt()
    val startPos = split[2].removeSuffix(":").split(",").map(String::toInt)
    val size = split[3].split("x").map(String::toInt)
    return Claim(id, Claim.Coords(startPos[0], startPos[1], size[0] + startPos[0], size[1] + startPos[1]))
}

data class Claim(val id: Int, val coords: Coords) {
    data class Coords(val left: Int, val top: Int, val right: Int, val bottom: Int)
}
