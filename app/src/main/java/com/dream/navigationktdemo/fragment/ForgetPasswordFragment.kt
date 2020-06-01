package com.dream.navigationktdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.dream.navigationktdemo.R
import kotlinx.android.synthetic.main.fragment_forget_pwd_layout.view.*

class ForgetPasswordFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_forget_pwd_layout,container,false)
        root.apply {
            tv_pwd_btn.setOnClickListener {
                Navigation.findNavController(it).navigate(R.id.action_pwd)
            }
        }
        return root
    }
}