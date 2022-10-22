package com.example.appstate.utils

import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

/**
 * @param name (state) current text to display
 * @param onChange (event) request that text change
 */
@Composable
fun TextInput(name: String, onChange: (String) -> Unit) {
    TextField(name, onChange, label = { Text("Name") })
}

@Preview
@Composable
private fun TextInput() = Surface {
    TextInput("Hello World!") {}
}
