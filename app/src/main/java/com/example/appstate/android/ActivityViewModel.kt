package com.example.appstate.android

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import com.example.appstate.databinding.ActivityViewModelBinding
import com.example.appstate.utils.MyViewModel

/**
 * An example showing unidirectional data flow in the View system using a ViewModel.
 */
class ActivityViewModel : AppCompatActivity() {
    private val viewModel by viewModels<MyViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityViewModelBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.input.doAfterTextChanged { viewModel.onChange(it.toString()) }
        viewModel.name.observe(this) { name -> binding.output.text = name }
    }
}
