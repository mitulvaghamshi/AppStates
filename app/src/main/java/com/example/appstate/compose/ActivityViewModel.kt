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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.appstate.utils.MyViewModel
import com.example.appstate.utils.TextInput

class ActivityViewModel : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { ScreenViewModel() }
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenViewModel(viewModel: MyViewModel = viewModel()) {
    // ViewModel follows the Lifecycle as the the Activity
    // or Fragment that calls this composable function.
    // name is the _current_ value of [viewModel.name]
    val name: String by viewModel.name.observeAsState("")
    Column(Modifier.padding(16.dp)) {
        Text("Compose: ViewModel", style = MaterialTheme.typography.h6)
        Spacer(Modifier.height(16.dp))
        TextInput(name, viewModel::onChange)
        Text(name)
    }
}
