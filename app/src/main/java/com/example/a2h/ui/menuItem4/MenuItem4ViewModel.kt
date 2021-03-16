package com.example.a2h.ui.menuItem4

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MenuItem4ViewModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Fragment 4"
    }
    val text: LiveData<String> = _text
}