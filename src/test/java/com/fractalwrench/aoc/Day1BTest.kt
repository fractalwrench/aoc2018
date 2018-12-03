package com.fractalwrench.aoc

import org.junit.Assert.*
import org.junit.Test

class Day1BTest {

    @Test
    fun testSolveDay1A() {
        assertEquals(0, solveDay1B("+1\n-1"))
        assertEquals(10, solveDay1B("+3\n+3\n+4\n-2\n-4"))
        assertEquals(5, solveDay1B("-6\n+3\n+8\n+5\n-6"))
        assertEquals(14, solveDay1B("+7\n+7\n-2\n-7\n-4"))
    }
}