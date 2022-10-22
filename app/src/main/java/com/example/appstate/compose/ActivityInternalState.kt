package com.example.appstate.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.appstate.utils.TextInput

class ActivityInternalState : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { ScreenInternalState() }
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenInternalState() {
    val (name, setName) = remember { mutableStateOf("") }
    Column(Modifier.padding(16.dp)) {
        Text("Compose: Internal State", style = MaterialTheme.typography.h6)
        Spacer(Modifier.height(16.dp))
        TextInput(name, setName)
        Text(name)
    }
}
