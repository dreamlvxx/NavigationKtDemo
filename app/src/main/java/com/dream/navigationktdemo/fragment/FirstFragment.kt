package com.dream.navigationktdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.dream.navigationktdemo.R
import kotlinx.android.synthetic.main.fragment_first_layout.view.*

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root= inflater.inflate(R.layout.fragment_first_layout,container,false)
        root.apply {
            tv_first_btn.setOnClickListener {
                val action = FirstFragmentDirections.actionFirst(sex = "sssss")
                Navigation.findNavController(it).navigate(action)
            }
        }
        return root
    }
}