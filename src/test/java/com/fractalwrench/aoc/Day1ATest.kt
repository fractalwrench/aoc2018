package com.fractalwrench.aoc

import org.junit.Assert.*
import org.junit.Test

class Day1ATest {

    @Test
    fun testSolveDay1A() {
        assertEquals(3, solveDay1A("+1\n+1\n+1"))
        assertEquals(0, solveDay1A("+1\n+1\n-2"))
        assertEquals(-6, solveDay1A("-1\n-2\n-3"))
    }
}