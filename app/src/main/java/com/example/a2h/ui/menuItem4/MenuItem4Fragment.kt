package com.example.a2h.ui.menuItem4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.a2h.R

class MenuItem4Fragment: Fragment() {
    private lateinit var menuItem4ViewModel: MenuItem4ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        menuItem4ViewModel =
            ViewModelProvider(this).get(MenuItem4ViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_menu_item_4, container, false)
        val textView: TextView = root.findViewById(R.id.text_fragment_4)
        menuItem4ViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}