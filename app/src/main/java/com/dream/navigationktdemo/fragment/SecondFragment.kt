package com.dream.navigationktdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.dream.navigationktdemo.R
import kotlinx.android.synthetic.main.fragment_second_layout.view.*

class SecondFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val ttt = arguments?.get("name")
        val root = inflater.inflate(R.layout.fragment_second_layout,container,false)
        root.apply {
            tv_btn_topwd.text = "${ttt}9999"
            tv_btn_topwd.setOnClickListener {
                Navigation.findNavController(it).navigate(R.id.action_second)
            }
        }
        return root
    }
}