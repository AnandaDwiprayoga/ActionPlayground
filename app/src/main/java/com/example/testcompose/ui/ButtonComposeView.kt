package com.example.testcompose.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag

@Composable
fun ButtonComposeView(
    modifier: Modifier = Modifier
) {
    var counter by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(modifier = Modifier.testTag("text_counter") ,text = "Counter: $counter")

        Button(
            onClick = {
                counter++
            },
            modifier = Modifier.testTag("button_counter")
        ) {
            Text(text = "Add counter")
        }
    }
}
