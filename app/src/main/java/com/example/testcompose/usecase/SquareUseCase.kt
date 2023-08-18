package com.example.testcompose.usecase

interface SquareUseCase {
    fun execute(a: Int): Int
}

class SquareUseCaseImpl : SquareUseCase {
    override fun execute(a: Int): Int {
        return a * a
    }
}
