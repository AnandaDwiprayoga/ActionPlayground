package com.example.testcompose.usecase

interface SumUseCase {
    fun execute(a: Int, b: Int): Int
}

class SumUseCaseImpl : SumUseCase {
    override fun execute(a: Int, b: Int): Int {
        return a + b
    }
}
