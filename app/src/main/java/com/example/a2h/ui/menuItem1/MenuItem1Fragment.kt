package com.example.a2h.ui.menuItem1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.a2h.R

class MenuItem1Fragment : Fragment() {

    private lateinit var menuItem1ViewModel: MenuItem1ViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        menuItem1ViewModel =
                ViewModelProvider(this).get(MenuItem1ViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_menu_item_1, container, false)
        val textView: TextView = root.findViewById(R.id.text_fragment_4)
        menuItem1ViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}