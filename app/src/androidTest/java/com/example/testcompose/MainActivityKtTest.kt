package com.example.testcompose

import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test

class MainActivityKtTest {
    @get:Rule
    val rule = createComposeRule()

    @Test
    fun test() {
        rule.setContent {
            Greeting(name = "Android")
        }
    }
}
