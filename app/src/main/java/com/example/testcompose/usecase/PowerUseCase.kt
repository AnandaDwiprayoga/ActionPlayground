package com.example.testcompose.usecase

import kotlin.math.pow

interface PowerUseCase {
    fun execute(a: Int, b: Int): Int
}

class PowerUseCaseImpl : PowerUseCase {
    override fun execute(a: Int, b: Int): Int {
        return a.toDouble().pow(b.toDouble()).toInt()
    }
}
