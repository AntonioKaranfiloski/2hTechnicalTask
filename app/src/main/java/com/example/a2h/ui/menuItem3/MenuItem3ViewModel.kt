package com.example.a2h.ui.menuItem3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MenuItem3ViewModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Fragment 3 data are added from view model"
    }
    val text: LiveData<String> = _text
}