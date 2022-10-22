package com.example.appstate.utils

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * A ViewModel extracts _state_ from the UI and defines _events_ that can update it.
 */
class MyViewModel : ViewModel() {
    // LiveData holds state which is observed by the UI (state flows down from ViewModel)
    private val _name = MutableLiveData("")
    val name: LiveData<String> get() = _name

    fun onChange(newName: String) {
        _name.value = newName
    }
}
