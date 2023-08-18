package com.example.testcompose.usecase

import kotlin.math.sqrt

interface SquareRootUseCase {
    fun execute(a: Int): Int
}

class SquareRootUseCaseImpl : SquareRootUseCase {
    override fun execute(a: Int): Int {
        return sqrt(a.toDouble()).toInt()
    }
}
