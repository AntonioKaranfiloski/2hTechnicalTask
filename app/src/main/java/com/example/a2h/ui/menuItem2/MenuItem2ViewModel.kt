package com.example.a2h.ui.menuItem2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MenuItem2ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is custom flow we can make logic in view model and represent here in fragment"
    }
    val text: LiveData<String> = _text
}