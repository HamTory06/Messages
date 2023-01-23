package com.example.messages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.messages.databinding.FragmentProfileBinding

class profile : Fragment() {

    private var mbinding: FragmentProfileBinding ?= null
    private val binding get() = mbinding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mbinding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

}