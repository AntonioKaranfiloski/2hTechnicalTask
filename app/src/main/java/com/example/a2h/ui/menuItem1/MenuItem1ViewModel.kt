package com.example.a2h.ui.menuItem1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MenuItem1ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Item menu 1 fragment, here we can add custom logic in View Model"
    }
    val text: LiveData<String> = _text
}