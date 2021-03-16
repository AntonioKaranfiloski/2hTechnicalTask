package com.example.a2h.ui.menuItem2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.a2h.R

class MenuItem2Fragment : Fragment() {

    private lateinit var menuItem2ViewModel: MenuItem2ViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        menuItem2ViewModel =
                ViewModelProvider(this).get(MenuItem2ViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_menu_item_2, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        menuItem2ViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}