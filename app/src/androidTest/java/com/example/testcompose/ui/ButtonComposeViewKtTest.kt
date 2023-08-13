package com.example.testcompose.ui

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test


class ButtonComposeViewKtTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testTextCounterViewVisible() {
        composeTestRule.setContent {
            ButtonComposeView()
        }

        composeTestRule.onNodeWithTag("text_counter").assertIsDisplayed()
    }

    @Test
    fun testButtonComposeViewVisible() {
        composeTestRule.setContent {
            ButtonComposeView()
        }

        composeTestRule.onNodeWithTag("button_counter").assertIsDisplayed()
    }

    @Test
    fun testButtonComposeViewClick() {
        composeTestRule.setContent {
            ButtonComposeView()
        }

        composeTestRule.onNodeWithTag("button_counter").performClick()
        composeTestRule.onNodeWithTag("text_counter").assertTextEquals("Counter: 1")
    }

    @Test
    fun testButtonComposeViewClickMultipleTimes() {
        composeTestRule.setContent {
            ButtonComposeView()
        }

        composeTestRule.onNodeWithTag("button_counter").performClick()
        composeTestRule.onNodeWithTag("button_counter").performClick()
        composeTestRule.onNodeWithTag("button_counter").performClick()
        composeTestRule.onNodeWithTag("text_counter").assertTextEquals("Counter: 3")
    }
}
