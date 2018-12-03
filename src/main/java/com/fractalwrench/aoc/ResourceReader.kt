package com.fractalwrench.aoc

fun readResource(name: String) = ResourceReader::class.java.classLoader.getResource(name).readText()
private class ResourceReader
