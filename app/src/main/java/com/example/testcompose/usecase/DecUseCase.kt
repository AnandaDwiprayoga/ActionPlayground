package com.example.testcompose.usecase

//for decrement usecase
interface DecUseCase {
    fun execute(a: Int, b: Int): Int
}

class DecUseCaseImpl : DecUseCase {
    override fun execute(a: Int, b: Int): Int {
        return a - b
    }
}
