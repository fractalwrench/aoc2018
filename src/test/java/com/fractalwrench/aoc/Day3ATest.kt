package com.fractalwrench.aoc

import org.junit.Test

import org.junit.Assert.*

class Day3ATest {

    @Test
    fun solveDay3A() {
        assertEquals(4, solveDay3A("#1 @ 1,3: 4x4\n#2 @ 3,1: 4x4\n#3 @ 5,5: 2x2"))
    }

    @Test
    fun testParseLine() {
        val claim = parseClaimLine("#123 @ 3,2: 5x4")
        assertEquals(123, claim.id)
        assertEquals(3, claim.coords.left)
        assertEquals(2, claim.coords.top)
        assertEquals(8, claim.coords.right)
        assertEquals(6, claim.coords.bottom)
    }
}