package com.example.messages

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.messages.databinding.FragmentPersonBinding


class Person : Fragment() {

    private var mbinding: FragmentPersonBinding ?= null
    private val binding get() = mbinding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Person_상태","onCreateView")
        (activity as AppCompatActivity)?.title = "친구"
        mbinding = FragmentPersonBinding.inflate(inflater, container, false)
        return binding.root
    }

}