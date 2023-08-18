package com.example.testcompose.usecase

interface MultipleUseCase {
    fun execute(a: Int, b: Int): Int
}

class MultipleUseCaseImpl : MultipleUseCase {
    override fun execute(a: Int, b: Int): Int {
        return a * b
    }
}

