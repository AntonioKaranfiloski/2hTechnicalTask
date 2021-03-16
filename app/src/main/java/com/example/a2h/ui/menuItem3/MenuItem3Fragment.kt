package com.example.a2h.ui.menuItem3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.a2h.R

class MenuItem3Fragment: Fragment() {
    private lateinit var menuItem3ViewModel: MenuItem3ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        menuItem3ViewModel =
            ViewModelProvider(this).get(MenuItem3ViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_menu_item_3, container, false)
        val textView: TextView = root.findViewById(R.id.text_fragment_3)
        menuItem3ViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}