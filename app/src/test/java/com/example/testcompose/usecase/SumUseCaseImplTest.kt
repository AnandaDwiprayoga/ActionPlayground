package com.example.testcompose.usecase

import org.junit.Assert.*
import org.junit.Test

class SumUseCaseImplTest {

    private val sumUseCase = SumUseCaseImpl()

    @Test
    fun execute() {
        val result = sumUseCase.execute(1, 2)
        assertEquals(3, result)
    }

    // test if number is negative
    @Test
    fun executeNegative() {
        val result = sumUseCase.execute(-1, -2)
        assertEquals(-3, result)
    }

    // test if first parameter is negative
    @Test
    fun executeFirstNegative() {
        val result = sumUseCase.execute(-1, 2)
        assertEquals(1, result)
    }

    // test if second parameter is negative
    @Test
    fun executeSecondNegative() {
        val result = sumUseCase.execute(1, -2)
        assertEquals(-1, result)
    }
}
