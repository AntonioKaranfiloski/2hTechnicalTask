package com.example.a2h.ui.home

import android.widget.ImageView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.a2h.R

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Long TextLong TextLong TextLong TextLong TextLong TextLong TextLong Text"
    }
    private val _img = MutableLiveData<Int>().apply {
        value = R.drawable.ic_baseline_image_24
    }
    val img: LiveData<Int> = _img
    val text: LiveData<String> = _text
}