package com.example.appstate.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import com.example.appstate.databinding.ActivityInternalStateBinding

/**
 * An example showing unstructured state stored in an Activity.
 */
class ActivityInternalState : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityInternalStateBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.input.doAfterTextChanged { text -> binding.output.text = text }
    }
}
