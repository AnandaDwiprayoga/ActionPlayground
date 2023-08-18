package com.example.testcompose.usecase

import kotlin.math.pow

interface NthRootUseCase {
    fun execute(a: Int, b: Int): Int
}

class NthRootUseCaseImpl : NthRootUseCase {
    override fun execute(a: Int, b: Int): Int {
        return a.toDouble().pow(1.0 / b.toDouble()).toInt()
    }
}
